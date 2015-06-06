name := "MohanLearningGround"

version := "1.0"

scalaVersion := "2.11.6"

transitiveClassifiers := Seq("sources")

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime" withSources(),
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test" withSources(),
  "org.scalacheck" % "scalacheck_2.11" % "1.12.2"  withSources(),
  "junit" % "junit" % "4.12" % "test"  withSources()   
)

libraryDependencies <++= (scalaVersion)(sv =>
  Seq(
    "org.scala-lang" % "scala-reflect" % "2.11.4",
    "org.scala-lang" % "scala-compiler" % "2.11.4",
	"org.scala-lang" % "scala-reflect" % "2.11.4",    
    "org.scala-lang.modules" % "scala-parser-combinators_2.11" % "1.0.3"
  ))
 
resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
 
libraryDependencies += "com.typesafe.scala-logging" % "scala-logging_2.11" % "3.1.0"
 
libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-swing" % "1.0.1" withSources(),
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.slf4j" % "slf4j-api" % "1.7.5" withSources(),
    "org.slf4j" % "slf4j-simple" % "1.7.5" withSources()
  )
