import sbt._


class KoboldProject(info: ProjectInfo) extends ParentProject(info) {
	override def parallelExecution = true

	lazy val nwnxice = project("nwnxice", "NWNXICE java bindings", new NWNXICE(_))
	lazy val kobold = project("kobold", "Kobold core", new Kobold(_), nwnxice)
	lazy val sternenfall = project("sternenfall", "Sternenfall", new Sternenfall(_), nwnxice, kobold)

	class Kobold(info: ProjectInfo) extends DefaultProject(info) {
		override def compileOptions: Seq[CompileOption] = List( Deprecation, Unchecked, target(Target.Java1_5))
		val scalatest = "org.scala-tools.testing" % "scalatest" % "0.9.5"
		val configgy = "net.lag" % "configgy" % "1.4" % "provided->default" from "http://www.lag.net/repo/net/lag/configgy/1.4/configgy-1.4.jar"

		val slf4japi = "org.slf4j" % "slf4j-api" % "1.5.8" % "provided->default"
		val slf4jlog4j = "org.slf4j" % "slf4j-log4j12" % "1.5.8" % "provided->default"
	}

	class NWNXICE(info: ProjectInfo) extends DefaultProject(info) {
		override def compileOptions: Seq[CompileOption] = List( Deprecation, Unchecked, target(Target.Java1_5))
	}

	class Sternenfall(info: ProjectInfo) extends DefaultProject(info) {
		override def compileOptions: Seq[CompileOption] = List( Deprecation, Unchecked, target(Target.Java1_5))
	}
}
