organization in ThisBuild := "auctionsniper"
version in ThisBuild := "1.0-SNAPSHOT"

// the Scala version that will be used for cross-compiled libraries
scalaVersion in ThisBuild := "2.12.4"

val macwire = "com.softwaremill.macwire" %% "macros" % "2.3.0" % "provided"
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4" % Test

lazy val `reactive-goos` = (project in file("."))
  .aggregate(`reactive-goos-api`, `reactive-goos-impl`, `reactive-goos-stream-api`, `reactive-goos-stream-impl`)

lazy val `reactive-goos-api` = (project in file("reactive-goos-api"))
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslApi
    )
  )

lazy val `reactive-goos-impl` = (project in file("reactive-goos-impl"))
  .enablePlugins(LagomScala)
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslPersistenceCassandra,
      lagomScaladslKafkaBroker,
      lagomScaladslTestKit,
      macwire,
      scalaTest
    )
  )
  .settings(lagomForkedTestSettings: _*)
  .dependsOn(`reactive-goos-api`)

lazy val `reactive-goos-stream-api` = (project in file("reactive-goos-stream-api"))
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslApi
    )
  )

lazy val `reactive-goos-stream-impl` = (project in file("reactive-goos-stream-impl"))
  .enablePlugins(LagomScala)
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslTestKit,
      macwire,
      scalaTest
    )
  )
  .dependsOn(`reactive-goos-stream-api`, `reactive-goos-api`)
