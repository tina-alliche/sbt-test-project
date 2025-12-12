name := "sbt-test-project"

version := "0.1.0"

scalaVersion := "3.3.1"

organization := "com.example"

// Common dependencies
libraryDependencies ++= Seq(
  // Testing
  "org.scalatest" %% "scalatest" % "3.2.17" % Test,
  
  // JSON parsing
  "io.circe" %% "circe-core" % "0.14.6",
  "io.circe" %% "circe-generic" % "0.14.6",
  "io.circe" %% "circe-parser" % "0.14.6",
  
  // Logging
  "ch.qos.logback" % "logback-classic" % "1.4.14",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  
  // Utilities
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0"
)

// Compiler options
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings"
)

// Test options
Test / parallelExecution := false
Test / testOptions += Tests.Argument("-oD")
