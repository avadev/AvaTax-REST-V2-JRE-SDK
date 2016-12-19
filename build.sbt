name := """avatax-rest-v2-api-java"""

organization := "net.avalara.avatax"

version := "2.16.12.3"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  //"com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.google.code.gson" % "gson" % "2.8.0",
  "org.apache.httpcomponents" % "httpclient" % "4.5.2"
)

lazy val downloadSwaggerAndGenerateClient = taskKey[Unit]("Generating client from latest swagger.json")

downloadSwaggerAndGenerateClient := {
  val swaggerDoc = new File("./project/swagger.json")
  IO.download(new URL("https://sandbox-rest.avatax.com/swagger/v2/swagger.json"), swaggerDoc)
  val model = ParseSwagger.parseSwaggerDocument(IO.read(swaggerDoc))

  ClientGenerator.renderClient(model)
}

compile in Compile <<= (compile in Compile).dependsOn(downloadSwaggerAndGenerateClient)
