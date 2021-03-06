import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.ihsmarkit",
      scalaVersion := "2.12.1",
      version      := "0.1.0"
    )),
    name := "FindPalindromes",
    libraryDependencies += scalaTest % Test
  )
