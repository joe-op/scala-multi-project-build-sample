ThisBuild / organization := "sampleproject"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.12.18"

lazy val root = (project in file("."))
     .aggregate(alpha, beta, gamma)

lazy val alpha = project

lazy val beta = project

lazy val gamma = project