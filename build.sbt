import com.typesafe.sbt.web.pipeline.Pipeline

WebKeys.packagePrefix in Assets := "public/"

name := """playweb-demo"""

version := "2.3-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "org.webjars" % "jquery" % "2.1.0-2",
  "org.webjars" % "angularjs" % "1.3.0-beta.18",
  "org.webjars" % "angular-ui-router" % "0.2.10-1",
  "org.webjars" % "requirejs" % "2.1.11-1",
  "org.webjars" % "chai" % "1.9.1" % "test",
  "org.webjars" % "rjs" % "2.1.11-1-trireme" % "test",
  "org.webjars" % "squirejs" % "0.1.0" % "test"
)

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

//MochaKeys.requires += "./Setup"
//MochaKeys.globals = ''

// Apply RequireJS optimization, digest calculation and gzip compression to assets
pipelineStages := Seq(rjs)
//*, digest, gzip*/
