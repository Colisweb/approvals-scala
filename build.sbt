name := "approvals-scala"

crossScalaVersions := List("2.12.13", "2.13.5")

libraryDependencies ++= Seq(scalaTest, approvalsJava, pprint)

resolvers += Resolver.mavenLocal

lazy val pprint = "com.lihaoyi" %% "pprint" % "0.6.4"
lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.7"
lazy val approvalsJava = "com.github.writethemfirst" % "approvals-java" % "0.13.1"
ThisBuild / pushRemoteCacheTo := Some(
  MavenCache("local-cache", baseDirectory.value / sys.env.getOrElse("CACHE_PATH", "sbt-cache"))
)

Global / onChangedBuildSource := ReloadOnSourceChanges
