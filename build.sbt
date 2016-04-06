name := """play-parcel"""

version := "0.1.5"

lazy val root = (project in file(".")).enablePlugins(PlayScala, PlaySwagger)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2,
  "org.scalacheck" %% "scalacheck"        % "1.12.4",
  "org.specs2"     %% "specs2-scalacheck" % "3.6"
)

resolvers += "zalando-bintray"  at "https://dl.bintray.com/zalando/maven"

resolvers += Resolver.url("sbt-plugins", url("http://dl.bintray.com/zalando/sbt-plugins"))(Resolver.ivyStylePatterns)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
