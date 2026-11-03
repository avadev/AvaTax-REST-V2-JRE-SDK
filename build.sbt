name := """avatax-rest-v2-api-java"""

organization := "net.avalara.avatax"

version := "26.10.2"

scalaVersion := "2.11.12"

autoScalaLibrary := false

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

javacOptions in doc := Seq("-source", "1.7", "-Xdoclint:none")

publishMavenStyle := true

publishTo := {
  val centralSnapshots = "https://central.sonatype.com/repository/maven-snapshots/"
  if (isSnapshot.value) Some("central-snapshots" at centralSnapshots)
  else localStaging.value
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
  "org.scala-lang" % "scala-library" % scalaVersion.value % "test",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test",
  "com.google.code.gson" % "gson" % "2.9.0",
  "org.apache.httpcomponents" % "httpclient" % "4.5.13",
  "org.slf4j" % "slf4j-api" % "2.0.1"
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
