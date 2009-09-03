package es.elv.kobold
import events._

class Greeter extends Plugin {
	def listen(event: Event) = event match {
		case OnPlayerEnter(p: Creature) => {
			p after(18.0, {
				p floatingText color.White("The ") + color.Orange("kobold") +
					color.White(" bids thee welcome!")

				p message color.Lightgrey(
					"(java version " + System.getProperty("java.vm.version") +
					"/" + System.getProperty("java.runtime.version") +
					" " + System.getProperty("os.arch") +
					", scalac " + util.Properties.versionString + ")"
				)
			})
		}

		case _ =>
	}
}
