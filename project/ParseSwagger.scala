import sbt._
import Keys._
import play.api.libs.json._
import play.api.libs.functional.syntax._

object ParseSwagger {
  case class SwaggerDoc(swagger: String, info: Map[String, JsValue], basePath: Option[String], paths: Map[String, Map[String, SwaggerMethod]], definitions: Map[String, SwaggerDefinition], securityDefinitions: Map[String, JsValue], apiVersion: Option[String])
  case class SwaggerMethod(tags: Seq[String], summary: Option[String], description: Option[String], operationId: Option[String], consumes: Seq[String], produces: Seq[String], parameters: Option[Seq[SwaggerProperty]], responses: Map[String, Option[SwaggerResult]], deprecated: Option[Boolean], security: Seq[Map[String, JsValue]])
  case class SwaggerDefinition(description: Option[String], required: Option[Seq[String]], `type`: String, properties: Map[String, SwaggerProperty], example: Option[JsValue])
  case class SwaggerProperty(name: Option[String], description: Option[String], required: Option[Boolean], `type`: Option[String], format: Option[String], EnumDataType: Option[String], readOnly: Option[Boolean], example: Option[JsValue], schema: Option[JsValue], items: Option[JsValue], `$ref`: Option[String], in: Option[String], default: Option[String], enum: Option[Seq[String]])
  case class SwaggerResult(description: Option[String], schema: Option[SwaggerProperty])

  implicit lazy val swaggerPropertyReads: Reads[SwaggerProperty] = (
    (JsPath \ "name").readNullable[String] and
    (JsPath \ "description").readNullable[String] and
    (JsPath \ "required").readNullable[Boolean] and
    (JsPath \ "type").readNullable[String] and
    (JsPath \ "format").readNullable[String] and
    (JsPath \ "x-enum-type").readNullable[String] and
    (JsPath \ "readOnly").readNullable[Boolean] and
    (JsPath \ "example").readNullable[JsValue] and
    (JsPath \ "schema").readNullable[JsValue] and
    (JsPath \ "items").readNullable[JsValue] and
    (JsPath \ "$ref").readNullable[String] and
    (JsPath \ "in").readNullable[String] and
    (JsPath \ "default")
        .readNullable[String]
        .orElse((JsPath \ "default").readNullable[Int].map(_.map(_.toString)))
        .orElse(
          (JsPath \ "default").readNullable[Boolean].map(_.map(_.toString))
        ) and
    (JsPath \ "enum").readNullable[Seq[String]]
  )(SwaggerProperty.apply _)


  implicit lazy val swaggerResultReads: Reads[SwaggerResult] = (
    (JsPath \ "description").readNullable[String] and
    (JsPath \ "schema").readNullable[SwaggerProperty]
  )(SwaggerResult.apply _)

  implicit lazy val optionalSwaggerResultReads: Reads[Option[SwaggerResult]] = Reads.optionWithNull[SwaggerResult]

  implicit lazy val swaggerMethodReads: Reads[SwaggerMethod] = (
    (JsPath \ "tags").read[Seq[String]] and
      (JsPath \ "summary").readNullable[String] and
      (JsPath \ "description").readNullable[String] and
      (JsPath \ "operationId").readNullable[String] and
      (JsPath \ "consumes").read[Seq[String]] and
      (JsPath \ "produces").read[Seq[String]] and
      (JsPath \ "parameters").readNullable[Seq[SwaggerProperty]] and
      (JsPath \ "responses").read[Map[String, Option[SwaggerResult]]] and
      (JsPath \ "deprecated").readNullable[Boolean] and
      (JsPath \ "security").read[Seq[Map[String, JsValue]]]
    )(SwaggerMethod.apply _)

  implicit lazy val swaggerDefinitionReads: Reads[SwaggerDefinition] = (
    (JsPath \ "description").readNullable[String] and
      (JsPath \ "required").readNullable[Seq[String]] and
      (JsPath \ "type").read[String] and
      (JsPath \ "properties").read[Map[String, SwaggerProperty]] and
      (JsPath \ "example").readNullable[JsValue]
    )(SwaggerDefinition.apply _)

  implicit lazy val swaggerDocReads: Reads[SwaggerDoc] = (
    (JsPath \ "swagger").read[String] and
    (JsPath \ "info").read[Map[String, JsValue]] and
    (JsPath \ "basePath").readNullable[String] and
    (JsPath \ "paths").read[Map[String, Map[String, SwaggerMethod]]] and
    (JsPath \ "definitions").read[Map[String, SwaggerDefinition]] and
    (JsPath \ "securityDefinitions").read[Map[String, JsValue]] and
    (JsPath \ "x-api-version").readNullable[String]
  )(SwaggerDoc.apply _)

  case class ApiModel(methods: Seq[ApiInfo], enums: Seq[EnumInfo], models: Seq[ModelInfo])

  case class ApiInfo(uri: String, comment: String, category: String, typeName: String, httpVerb: String, operationId: String, bodyParam: Option[ParameterInfo], params: Seq[ParameterInfo], queryParams: Seq[ParameterInfo]) {
    override def toString: String = {
      val paramComments = new StringBuilder()
      val paramList = new StringBuilder()
      val paramBuilder = new StringBuilder()

      for (p <- params) {
        paramComments.append(s"        /// param name ${p.javaParamName}: ${p.comment}")
        paramList.append(s"${p.typeName} ${p.javaParamName}, ")
        paramBuilder.append(s"""\n        path.applyField("${p.paramName}", ${p.javaParamName});""")
      }

      for (p <- queryParams) {
        paramComments.append(s"        /// param name ${p.javaParamName}: ${p.comment}")
        paramList.append(s"${p.typeName} ${p.javaParamName}, ")
        paramBuilder.append(s"""\n        path.addQuery("${p.paramName}", ${p.javaParamName});""")
      }

      if (bodyParam.isDefined) {
        paramComments.append(s"        /// param name ${bodyParam.get.javaParamName}: ${bodyParam.get.comment}")
        paramList.append(s"${bodyParam.get.typeName} ${bodyParam.get.javaParamName}, ")
      }

      paramComments.append("        /// returns")
      if (paramList.nonEmpty) paramList.delete(paramList.length - 2, paramList.length)

      TemplateConstants.APIClassMethodTemplate
        .replace("@@CATEGORY@@", category)
        .replace("@@COMMENT@@", comment)
        .replace("@@TYPENAME@@", typeName)
        .replace("@@APINAME@@", operationId(0).toLower + operationId.substring(1))
        .replace("@@HTTPVERB@@", httpVerb)
        .replace("@@PARAMCOMMENTS@@", paramComments.toString())
        .replace("@@PARAMBUILDER@@", paramBuilder.toString())
        .replace("@@PARAMS@@", paramList.toString())
        .replace("@@URI@@", uri)
        .replace("@@PAYLOAD@@", if (bodyParam.isEmpty) "null" else "model")
    }
  }

  case class ParameterInfo(paramName: String, typeName: String, comment: String) {
    val javaParamName = paramName.replace("\\$", "")
  }

  case class EnumInfo(enumDataType: String, comment: String, items: Seq[EnumItem]) {
    override def toString: String = {
      val builder = new StringBuilder()

      for (i <- items) {
        builder.append(TemplateConstants.EnumValueTemplate
          .replace("@@COMMENT@@", Option(i.comment).getOrElse("No comment data provided"))
          .replace("@@VALUE@@", i.value) + "\n")
      }

      TemplateConstants.EnumClassTemplate
        .replace("@@ENUMCLASS@@", enumDataType)
        .replace("@@COMMENT@@", if (comment == null) "" else comment)
        .replace("@@VALUELIST@@", builder.toString)
    }
  }

  case class EnumItem(comment: String, value: String)

  case class ModelInfo(comment: String, schemaName: String, properties: Seq[ParameterInfo]) {
    override def toString: String = {
      var builder = new StringBuilder()

      for (prop <- properties) {
        builder.append(TemplateConstants.ModelPropertyTemplate
          .replace("@@PROPERTYNAME@@", prop.javaParamName)
          .replace("@@UPPERPROPERTYNAME@@", prop.javaParamName(0).toUpper + prop.javaParamName.substring(1))
          .replace("@@COMMENT@@", if (comment == null) "" else comment)
          .replace("@@PROPERTYTYPE@@", prop.typeName) + "\n")
      }

      TemplateConstants.ModelClassTemplate
        .replace("@@PROPERTYLIST@@", builder.toString)
        .replace("@@COMMENT@@", if (comment == null) "" else comment)
        .replace("@@MODELCLASS@@", schemaName)
    }
  }

  def resolveType(prop: SwaggerProperty): String = {
    val builder = new StringBuilder()
    var isValueType = false

    prop.`type` match {
      case Some("integer") => {
        prop.format match {
          case Some("byte") => builder.append("Byte")
          case Some("int16") => builder.append("Short")
          case Some("int64") => builder.append("Long")
          case _ => builder.append("Integer")
        }

        isValueType = true
      }
      case Some("number") => {
        builder.append("BigDecimal")
        isValueType = true
      }
      case Some("boolean") => {
        builder.append("Boolean")
        isValueType = true
      }
      case Some("string") => {
        if (prop.format.isDefined && prop.format.get.equals("date-time")) {
          builder.append("Date")
          isValueType = true
        } else if (prop.EnumDataType.isDefined) {
          builder.append(prop.EnumDataType.get)
          isValueType = true
        } else {
          builder.append("String")
        }
      }
      case Some("array") => {
        builder.append("ArrayList<")
        builder.append(resolveType(prop.items.get.validate[SwaggerProperty].get))
        builder.append(">")
      }
      case _ => {
        if (prop.`$ref`.isDefined) {
          var schema = prop.`$ref`.get.substring(prop.`$ref`.get.lastIndexOf('/') + 1)

          if (schema.startsWith("FetchResult")) {
            schema = schema.replace("[", "<").replace("]", ">")
          }

          builder.append(schema)
        } else if (prop.schema.isDefined) {
          builder.append(resolveType(prop.schema.get.validate[SwaggerProperty].get))
        } else if (prop.description.isDefined && (prop.description.get.equals("Default addresses for all lines in this document") || prop.description.get.equals("Specify any differences for addresses between this line and the rest of the document"))) {
          builder.append("HashMap<TransactionAddressType, AddressInfo>")
        } else {
          builder.append("HashMap<String, String>")
        }
      }
    }

    builder.toString
  }

  def mapParameterInfo(prop: SwaggerProperty, name: Option[String] = None): ParameterInfo = {
    ParameterInfo(name getOrElse prop.name.orNull, resolveType(prop), prop.description getOrElse "")
  }

  def extractEnum(prop: SwaggerProperty): EnumInfo = {
    EnumInfo(prop.EnumDataType.orNull, null, prop.enum.get.map(e => EnumItem(null, e)))
  }

  def parseSwaggerDocument(swaggerDoc: String) = {
    val swagDocValidated = Json.parse(swaggerDoc).validate[SwaggerDoc]
    
    swagDocValidated.fold(
      errors => {
        println(errors.toString)
        throw new Exception("")
      },
      swagDoc => ApiModel(// ApiInfo
      (swagDoc.paths flatMap { (path: (String, Map[String, SwaggerMethod])) =>
        path._2 map { (verb: (String, SwaggerMethod)) =>
          ApiInfo(path._1,
            verb._2.summary.getOrElse(""),
            verb._2.tags.headOption.getOrElse(""),
            (verb._2.responses.find(r => r._1.equals("200")) orElse verb._2.responses.find(r => r._1.equals("201"))).flatMap(r => r._2.flatMap(_.schema.map(resolveType))).getOrElse("String"),
            verb._1,
            verb._2.operationId.getOrElse("").replace("ApiV2", ""),
            if (verb._2.parameters.isDefined) verb._2.parameters.get.find(_.in.equals(Some("body"))).map(mapParameterInfo(_, Some("model"))) else null,
            if (verb._2.parameters.isDefined) verb._2.parameters.get.filter(_.in.equals(Some("path"))).map(mapParameterInfo(_)) else null,
            if (verb._2.parameters.isDefined) verb._2.parameters.get.filter(_.in.equals(Some("query"))).map(mapParameterInfo(_)) else null
          )
        }
      }).toSeq,
      Seq(EnumInfo("TransactionAddressType", null, Seq(
        EnumItem("This is the location from which the product was shipped", "ShipFrom"),
        EnumItem("This is the location to which the product was shipped", "ShipTo"),
        EnumItem("Location where the order was accepted; typically the call center, business office where purchase orders are accepted, server locations where orders are processed and accepted", "PointOfOrderAcceptance"),
        EnumItem("Location from which the order was placed; typically the customer's home or business location", "PointOfOrderOrigin"),
        EnumItem("Only used if all addresses for this transaction were identical; e.g. if this was a point-of-sale physical transaction", "SingleLocation")
      ))) ++ (swagDoc.paths flatMap { path => path._2.filter(_._2.parameters.isDefined).flatMap { verb => verb._2.parameters.get.filter(_.EnumDataType.isDefined).filter(_.enum.isDefined) map { param => extractEnum(param) }}}).toSeq
        ++ (swagDoc.definitions flatMap { definition => definition._2.properties.filter(_._2.EnumDataType.isDefined).filter(_._2.enum.isDefined) map { param => extractEnum(param._2) } }).toSeq,
      (swagDoc.definitions map { definition =>
        ModelInfo(definition._2.description.orNull, definition._1, (definition._2.properties map { prop =>
          var mutProp = prop
          if (!prop._2.required.getOrElse(false) && definition._2.required.nonEmpty) {
            mutProp = prop.copy(prop._1, prop._2.copy(required = definition._2.required.map(_.contains(prop._1))))
          }

          ParameterInfo(mutProp._1, resolveType(mutProp._2), mutProp._2.description.orNull)
        }).toSeq)
      }).toSeq)
    )
  }
}
