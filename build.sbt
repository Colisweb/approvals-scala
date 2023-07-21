name := "approvals-scala"

crossScalaVersions := List("2.12.17", "2.13.11", "3.3.0")

libraryDependencies ++= Seq(scalaTest, approvalsJava, pprint)

resolvers += Resolver.mavenLocal

lazy val pprint        = "com.lihaoyi"   %% "pprint"         % "0.8.1"
lazy val scalaTest     = "org.scalatest" %% "scalatest"      % "3.2.16"
lazy val approvalsJava = "com.colisweb"   % "approvals-java" % "0.13.4"
ThisBuild / pushRemoteCacheTo := Some(
  MavenCache("local-cache", baseDirectory.value / sys.env.getOrElse("CACHE_PATH", "sbt-cache"))
)

Global / onChangedBuildSource := ReloadOnSourceChanges
