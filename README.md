<p align='center'>
    <img alt='Write Them First!' src='https://raw.githubusercontent.com/WriteThemFirst/approvals-java/master/etc/logo.png' />
</p>
<p align='center'>
    <a href='https://travis-ci.org/WriteThemFirst/approvals-scala'>
        <img src='https://travis-ci.org/WriteThemFirst/approvals-scala.svg?branch=master' />
    </a>
    <a href='https://bintray.com/writethemfirst/maven/approvals-scala'>
        <img src='https://img.shields.io/bintray/v/writethemfirst/maven/approvals-scala' />
    </a>
    <a href='https://github.com/WriteThemFirst/approvals-scala/issues/'>
        <img src='https://img.shields.io/github/issues/WriteThemFirst/approvals-scala.svg' />
    </a>
    <a href='https://github.com/WriteThemFirst/approvals-scala/issues?q=is%3Aissue+is%3Aclosed'>
        <img src='https://img.shields.io/github/issues-closed/WriteThemFirst/approvals-scala.svg' />
    </a>
    <a href='https://github.com/WriteThemFirst/approvals-scala'>
        <img src='https://img.shields.io/github/languages/code-size/WriteThemFirst/approvals-scala.svg' />
    </a>
    <a href='https://www.gnu.org/licenses/gpl-3.0'>
        <img src='https://img.shields.io/badge/License-GPL%20v3-blue.svg' />
    </a>
</p>

---

# Approvals-Scala

Approvals-Scala is a lightweight open source assertion/verification library to facilitate unit testing. It alleviates the burden of hand-writing assertions.


# Get Approvals-Scala

Approvals-Scala is released on Bintray.

## Sbt 

In your `build.sbt`, add this dependency:

```scala
resolvers += Resolver.bintrayRepo("writethemfirst", "maven")

libraryDependencies += "com.github.writethemfirst" % "approvals-scala" % "1.0.1"
```

### Multi-modules project

If you use this library in a project with several modules, you likely want to store approved files in folders relative to the appropriate submodule.

In order for approvals to detect which module is currently tested, you need the sbt JVM to be forked for each module :

```scala
ThisBuild / Test / fork := true
```

## Sample project

First, if you'd just want a sample project to see it in action, [we have one for you](https://github.com/WriteThemFirst/approvals-demo-scala)!

# Help/Contribute

This project is completely open to any contributions!
*(and remember: feedback is a valuable contribution!)*

Do not hesitate to:

1. [Submit issues](https://github.com/WriteThemFirst/approvals-scala/issues/new)
  about any feedbacks you may have about the library,
2. [Send us a Pull Request](https://github.com/WriteThemFirst/approvals-scala/pulls)
  with any contribution you think about,
3. [Have a look at open issues](https://github.com/WriteThemFirst/approvals-scala/issues)
  if you want to find a topic to work on,

Before contributing though, please have a look
at our [Code of Conduct](CODE_OF_CONDUCT.md) *(because we value humans and their differences)*
and to our [Contribution Guide](CONTRIBUTING.md) *(because we think that a few rules allow to work faster and safer)*.

Do not hesitate to discuss anything from those documents if you feel they need any modification though.

# License

Our code is released under [GNU General Public License v3.0](LICENSE).
