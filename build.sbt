name := "fp exercises"

version := "0.0.1"

organization := "jon"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq("org.scalactic" %% "scalactic" % "3.0.0",
                            "com.storm-enroute" %% "scalameter" % "0.7",
                            "org.scalatest" %% "scalatest" % "3.0.0" % "test")

testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework")

parallelExecution in Test := false
