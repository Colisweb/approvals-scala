ThisBuild / organization := "com.colisweb"
ThisBuild / organizationName := "Colisweb"
ThisBuild / organizationHomepage := Some(url("https://gitlab.com/colisweb-open-source"))
ThisBuild / credentials += Credentials(
  "Sonatype Nexus Repository Manager",
  "s01.oss.sonatype.org",
  sys.env.getOrElse("SONATYPE_USERNAME", "unused"),
  sys.env.getOrElse("SONATYPE_PASSWORD", "unused")
)
version := sys.env.getOrElse("CI_COMMIT_TAG", "0.0.1-SNAPSHOT").replaceAll("v", "")
ThisBuild / publishMavenStyle := true

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

ThisBuild / description := "Some description about your project."
ThisBuild / licenses := Seq("GPL-3.0" -> url("https://opensource.org/licenses/GPL-3.0"))
ThisBuild / homepage := Some(url("https://gitlab.com/colisweb-open-source/scala/approvals-scala"))

// Remove all additional repository other than Maven Central from POM
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / sonatypeCredentialHost := "s01.oss.sonatype.org"
ThisBuild / sonatypeRepository := "https://s01.oss.sonatype.org/service/local"

ThisBuild / publishTo := {
  if (isSnapshot.value)
    Some("snapshots" at "https://s01.oss.sonatype.org/content/repositories/snapshots")
  else sonatypePublishToBundle.value
}


publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)
