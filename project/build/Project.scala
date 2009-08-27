import sbt._


class KoboldProject(info: ProjectInfo) extends ParentProject(info) {
	override def parallelExecution = true

	lazy val nwnxice = project("nwnxice", "NWNXICE java bindings", new NWNXICE(_))
	lazy val kobold = project("kobold", "Kobold core", new Kobold(_), nwnxice)
	lazy val sternenfall = project("sternenfall", "Sternenfall", new Sternenfall(_), nwnxice, kobold)

	class Kobold(info: ProjectInfo) extends DefaultProject(info) {
		val scalatest = "org.scala-tools.testing" % "scalatest" % "0.9.5"
		val configgy = "net.lag" % "configgy" % "1.4" from "http://www.lag.net/repo/net/lag/configgy/1.4/configgy-1.4.jar"
	}

	class NWNXICE(info: ProjectInfo) extends DefaultProject(info) {
	}

	class Sternenfall(info: ProjectInfo) extends DefaultProject(info) {
	}
}
