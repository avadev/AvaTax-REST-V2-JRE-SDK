import sbt.File

object ClientGenerator {
  def renderClient(model: ParseSwagger.ApiModel) = {
    var builder = new StringBuilder()
    var currentRegion: String = null

    for (api <- model.methods.sortBy(_.operationId).sortBy(_.category)) {
      if (currentRegion != api.category) {
        if (currentRegion != null) {
          builder.append("//endregion\n\n")
        }

        builder.append("//region " + api.category + "\n")
        currentRegion = api.category
      }

      builder.append(api.toString + "\n");
    }

    if (currentRegion != null) {
      builder.append("//endregion\n")
    }

    var fileText = TemplateConstants.APIClassTemplate.replace("@@APILIST@@", builder.toString())
    sbt.IO.write(new File("./src/main/java/net/avalara/avatax/rest/client/AvaTaxClient.java"), fileText, java.nio.charset.Charset.forName("utf-8"))

    for (m <- model.models) {
      if (!m.schemaName.startsWith("FetchResult")) {
        sbt.IO.write(new File("./src/main/java/net/avalara/avatax/rest/client/models/" + m.schemaName + ".java"), m.toString, java.nio.charset.Charset.forName("utf-8"))
      }
    }

    for (e <- model.enums) {
      sbt.IO.write(new File("./src/main/java/net/avalara/avatax/rest/client/enums/" + e.enumDataType + ".java"), e.toString, java.nio.charset.Charset.forName("utf-8"))
    }
  }
}