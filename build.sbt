name := "ReteRuleEngine"

version := "1.0"

scalaVersion := "2.12.3"

transitiveClassifiers := Seq("sources")

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.0.0" % "runtime" withSources(),
  "org.scalatest" %% "scalatest" % "3.0.4" % "test" withSources(),
  "org.scalacheck" %% "scalacheck" % "1.13.5"  withSources(),
  "junit" % "junit" % "4.12" % "test"  withSources()   
)

libraryDependencies <++= (scalaVersion)(sv =>
  Seq(
    "org.scala-lang" % "scala-reflect" % sv,
    "org.scala-lang" % "scala-compiler" % sv,
	"org.scala-lang" % "scala-reflect" % sv,    
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6"
  ))
 
resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
 
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2"
 
libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-swing" % "2.0.1" withSources(),
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.slf4j" % "slf4j-api" % "1.7.5" withSources(),
    "org.slf4j" % "slf4j-simple" % "1.7.5" withSources()
  )
