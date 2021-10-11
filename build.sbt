// resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
// libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.9"
// libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % "test"

import Dependencies._

ThisBuild / scalaVersion     := "3.1.1"

lazy val root: Project = (project in file("."))
  .settings(
    name := "wallbreakers-scala",
    sourcesInBase := false,
    unmanagedSourceDirectories := baseDirectory { base =>
      Seq(
        base / "summer2021/unit1"
      )
    }.value
    libraryDependencies += scalaTest % Test,
    unmanagedSourceDirectories in Test := baseDirectory { base =>
      Seq(
        base / "summer2021/unit1"
      )
    }.value,
  )