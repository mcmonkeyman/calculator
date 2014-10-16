import com.github.retronym.SbtOneJar._

name := "bc"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.specs2"  %% "specs2" % "2.4" % "test"

libraryDependencies += "commons-lang" % "commons-lang" % "2.6"

oneJarSettings

