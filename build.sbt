name := """avatax-rest-v2-api-java"""

organization := "net.avalara.avatax"

version := "20.12.1"

scalaVersion := "2.11.12"

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

javacOptions in doc := Seq("-source", "1.7", "-Xdoclint:none")

useGpg := true

usePgpKeyHex("7C14D882A238CB42")

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ =>
  false
}

pomExtra := (
  <url>https://github.com/avadev/AvaTax-REST-V2-JRE-SDK</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>https://www.apache.org/licenses/LICENSE-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:avadev/AvaTax-REST-V2-JRE-SDK.git</url>
    <connection>scm:git:git@github.com:avadev/AvaTax-REST-V2-JRE-SDK.git</connection>
  </scm>
  <developers>
    <developer>
      <id>drheart</id>
      <name>Dustin R. Heart</name>
      <url>http://www.avalara.com</url>
    </developer>
  </developers>)

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  //"com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "com.google.code.gson" % "gson" % "2.8.6",
  "org.apache.httpcomponents" % "httpclient" % "4.5.11"
)

// lazy val downloadSwaggerAndGenerateClient = taskKey[Unit]("Generating client from latest swagger.json")

// downloadSwaggerAndGenerateClient := {
//   val swaggerDoc = new File("./project/swagger.json")
//   val url = new URL("https://sandbox-rest.avatax.com/swagger/v2/swagger.json")
//   val json = sbt.io.Using.urlInputStream(url) { in =>
//     IO.transfer(in, swaggerDoc); IO.read(swaggerDoc)
//   }
//   val model = ParseSwagger.parseSwaggerDocument(json)

//   ClientGenerator.renderClient(model)
// }

// Compile / compile := (Compile / compile).dependsOn(downloadSwaggerAndGenerateClient).value
