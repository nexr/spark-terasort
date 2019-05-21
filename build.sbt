//net.virtualvoid.sbt.graph.Plugin.graphSettings

scalaVersion := "2.11.11"

resolvers += Resolver.url("artifactory", url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
resolvers += "Spray Repository" at "http://repo.spray.cc/"
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.0" % "provided",
  "org.apache.hadoop" % "hadoop-client" % "2.9.2" % "provided",
  "com.google.guava" % "guava" % "14.0.1",
  "org.specs2" %% "specs2" % "3.7" % "test"
)

//  lazy val commonSettings = Seq(
//    organization  := "com.nexr",
//    version       := "0.2",
//    description   := "Simple terasort.",
//    scalaVersion  := "2.11.11",
//    scalacOptions := Seq("-deprecation", "-encoding", "utf8"),
//    resolvers
//  )

//  lazy val app = (project in file(".")).
//    settings(commonSettings: _*).
//    settings(
//      assemblyJarName in assembly := {
//        name.value + "-" + version.value + ".jar"
//      },
//
//      // Drop these jars
//      //excludedJars in assembly := (fullClasspath in assembly) { (cp) =>
//      //  val excludes = Set(
//      //    "jsp-api-2.1-6.1.14.jar",
//      //    "jsp-2.1-6.1.14.jar",
//      //    "jasper-compiler-5.5.12.jar",
//      //    "commons-beanutils-core-1.8.0.jar",
//      //    "commons-beanutils-1.7.0.jar",
//      //    "servlet-api-2.5-20081211.jar",
//      //    "servlet-api-2.5.jar"
//      //  )
//      //  cp filter { jar => excludes(jar.data.getName) }
//      //},
//
//      //mergeStrategy in assembly := (mergeStrategy in assembly) {
//      //    // case "project.clj"                                       => MergeStrategy.discard // Leiningen build files
//      //    case x if x.startsWith("META-INF")                          => MergeStrategy.discard // Bumf
//      //    case x if x.startsWith("hadoop") && x.contains("2.9.2")     => MergeStrategy.discard
//      //    case x if x.endsWith(".html")                               => MergeStrategy.discard // More bumf
//      //    case x if x.endsWith("package-info.class")                  => MergeStrategy.last
//      //    case PathList("com", "esotericsoftware", xs @ _*)           => MergeStrategy.last // For Log$Logger.class
//      //    case x =>
//      //      val oldStrategy = (mergeStrategy in assembly).value
//      //      oldStrategy(x)
//      //}
//    )
