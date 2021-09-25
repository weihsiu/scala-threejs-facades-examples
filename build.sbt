enablePlugins(ScalaJSBundlerPlugin)

name := "scala-threejs-facades-examples"
version := "0.0.1"
scalaVersion := "3.0.2"

scalacOptions ++= Seq(
  "-source:future"
)

scalaJSUseMainModuleInitializer := true

Compile / npmDependencies ++= Seq(
  "three" -> "0.132.2",
  "troika-three-text" -> "0.43.0"
)

libraryDependencies ++= Seq(
  "org.cascaval" %%% "three-typings" % "0.1.7-SNAPSHOT",
  ("org.scala-js" %%% "scalajs-dom" % "1.2.0").cross(CrossVersion.for3Use2_13)
)
