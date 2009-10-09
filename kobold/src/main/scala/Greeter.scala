package es.elv.kobold
import events._

object Greeter extends Plugin {
	def listen(event: Event) = event match {
		case OnPlayerEnter(p: Creature) => {
			p.after(18000) {
				p floatingText config.getString("greetingText")

				p message config.getString("versionText").format(
					"(java version " + System.getProperty("java.vm.version") +
					"/" + System.getProperty("java.runtime.version") +
					" " + System.getProperty("os.arch") +
					", scalac " + util.Properties.versionString + ")"
				)
			}
		}

		case _ =>
	}
}
