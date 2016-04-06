resolvers += Resolver.url("sbt-plugins", url("http://dl.bintray.com/zalando/sbt-plugins"))(Resolver.ivyStylePatterns)

resolvers += "zalando-bintray"  at "https://dl.bintray.com/zalando/maven"

resolvers += "scalaz-bintray"   at "http://dl.bintray.com/scalaz/releases"

addSbtPlugin("com.typesafe.play" % "sbt-plugin"       % "2.4.3")

addSbtPlugin("de.zalando"        % "sbt-play-swagger" % "0.1.5")