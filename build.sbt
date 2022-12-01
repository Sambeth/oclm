ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

lazy val sparkVersion = "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "oclm",
    libraryDependencies ++= Seq(
      ("org.apache.spark" %% "spark-core" % sparkVersion).cross(CrossVersion.for3Use2_13),
      ("org.apache.spark" %% "spark-sql" % sparkVersion % "provided").cross(CrossVersion.for3Use2_13)
    )
  )
