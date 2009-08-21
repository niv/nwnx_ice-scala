import sbt._


class KoboldProject(info: ProjectInfo) extends ParentProject(info) {
	val scalatest = "org.scala-tools.testing" % "scalatest" % "0.9.5"

	lazy val nwnxice = project("nwnxice", "NWNXICE glue code")
	lazy val kobold = project("kobold", "Kobold Core", nwnxice)
	lazy val sternenfall = project("sternenfall", "Sternenfall", nwnxice, kobold)
}
