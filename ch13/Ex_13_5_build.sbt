// 코드 13-5 build.sbt

name := """test_project"""

version := "1.0-SANPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	jdbc,
	cache,
	ws,
	"org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
	"com.typesafe.play" %% "anorm" % "2.5.0"
	"mysql" % "mysql-connector-java" % "5.1.34"
)

resolvers += "scalaz-bintray" at "http://d1.bintray.com/scalaz/releases"
