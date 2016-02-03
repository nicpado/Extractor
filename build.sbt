name := "Extractor"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.8.2",
  "org.joda" % "joda-convert" % "1.8.1",
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  "com.typesafe" % "config" % "1.2.1",
  "com.github.nscala-time" %% "nscala-time" % "2.8.0",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.2" % "test"
)

/*
libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  "com.typesafe" % "config" % "1.2.1",
  //  "org.apache.spark" %% "spark-core" % "1.2.0" % "provided",
  //  "org.apache.spark" %% "spark-sql" % "1.2.0" % "provided",
  "org.apache.spark" %% "spark-core" % "1.2.0",
  //  "org.apache.spark" %% "spark-sql" % "1.2.0",
  "joda-time" % "joda-time" % "2.8.2",
  "org.joda" % "joda-convert" % "1.8.1",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % "test",
  "org.apache.poi" % "poi" % "3.7"
)*/