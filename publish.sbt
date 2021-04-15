//Global configuration
sonatypeCredentialHost := "s01.oss.sonatype.org"
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"

credentials += Credentials(
  "Sonatype Nexus Repository Manager",
  "s01.oss.sonatype.org",
  sys.env.getOrElse("SONATYPE_USERNAME", "unused"),
  sys.env.getOrElse("SONATYPE_PASSWORD", "unused")
)

version := sys.env.getOrElse("CI_COMMIT_TAG", "0.0.1-SNAPSHOT").replaceAll("v", "")

publishConfiguration := publishConfiguration.value.withOverwrite(true)
publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true)

//Per build generic configuration
ThisBuild / organization := "com.colisweb"
ThisBuild / organizationName := "Colisweb"
ThisBuild / organizationHomepage := Some(url("https://gitlab.com/colisweb-open-source"))
ThisBuild / publishMavenStyle := true

ThisBuild / pomIncludeRepository := { _ => false } // Remove all additional repository other than Maven Central from POM
ThisBuild / publishTo := {
  if (isSnapshot.value)
    Some("snapshots" at "https://s01.oss.sonatype.org/content/repositories/snapshots")
  else sonatypePublishToBundle.value
}

//Per build specific informations
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://gitlab.com/colisweb-open-source/scala/approvals-scala"),
    "scm:git@gitlab.com:colisweb-open-source/scala/approvals-scala.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id = "tyrcho",
    name = "Michel Daviot",
    email = "tyrcho@colisweb.com",
    url = url("https://github.com/tyrcho")
  )
)


ThisBuild / description := "Some description about your project."
ThisBuild / licenses := Seq("GPL-3.0" -> url("https://opensource.org/licenses/GPL-3.0"))
ThisBuild / homepage := Some(url("https://gitlab.com/colisweb-open-source/scala/approvals-scala"))

