organization := "test"

lazy val root = (project in file(".")) aggregate(maths, mathsweb, remote, remoteweb)

lazy val maths = project

lazy val remote = project

lazy val remoteweb = project webappDependsOn (remote)

lazy val mathsweb = project webappDependsOn (maths)
