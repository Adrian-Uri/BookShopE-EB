name := "bookshope-eb"
 
version := "1.0" 
      
lazy val `bookshope-eb` = (project in file(".")).enablePlugins(PlayJava)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
scalaVersion := "2.11.11"

libraryDependencies ++= Seq( javaJdbc , cache , javaWs )
libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )
