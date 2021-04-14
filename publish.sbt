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

ThisBuild / credentials += Credentials(Path.userHome / ".sbt" / "sonatype_credentials")
ThisBuild / description := "Some description about your project."
ThisBuild / licenses := Seq("GPL-3.0" -> url("https://opensource.org/licenses/GPL-3.0"))
ThisBuild / homepage := Some(url("https://gitlab.com/colisweb-open-source/scala/approvals-scala"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := Some("releases" at "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
ThisBuild / publishMavenStyle := true

version := "0.0.3"