publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)

ThisBuild / organization := "com.colisweb"
ThisBuild / organizationName := "Colisweb"
ThisBuild / organizationHomepage := Some(url("https://gitlab.com/colisweb-open-source"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://gitlab.com/colisweb-open-source/scala/approvals-scala"),
    "scm:git@gitlab.com:colisweb-open-source/scala/approvals-scala.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id    = "LitlBro",
    name  = "colas mombrun",
    email = "colas.mombrun@colisweb.com",
    url   = url("https://gitlab.com/LitlBro")
  )
)

ThisBuild / credentials += Credentials(file(sys.env.getOrElse("SONATYPE_CREDENTIALS", "sonatype_credentials")))
ThisBuild / description := "Some description about your project."
ThisBuild / licenses := Seq("GPL-3.0" -> url("https://opensource.org/licenses/GPL-3.0"))
ThisBuild / homepage := Some(url("https://gitlab.com/colisweb-open-source/scala/approvals-scala"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://s01.oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}


ThisBuild / publishMavenStyle := true

version := sys.env.getOrElse("CI_COMMIT_TAG", "0.0.1-SNAPSHOT").replaceAll("v", "")
