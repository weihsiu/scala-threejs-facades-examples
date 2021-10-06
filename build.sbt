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
  "org.cascaval" %%% "scala-threejs-facades" % "0.131.1-SNAPSHOT",
  ("org.scala-js" %%% "scalajs-dom" % "1.2.0").cross(CrossVersion.for3Use2_13)
)

webpackBundlingMode := BundlingMode.LibraryOnly()
