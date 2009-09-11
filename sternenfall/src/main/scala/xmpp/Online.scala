package org.sternenfall.kobold.xmpp

import es.elv.kobold._

object Online extends Plugin {
	def listen(event: events.Event) = {}

	private def formatPlayer(p: PlayerCreature) =
		"%s (%s)".format(p.name(), p.account())

	XMPPService.registerCommand("online", "Shows online players.", "", (c, a) => {
		R schedule {
			val players = PlayerCreature.all()
			c sendMessage "Online: " + (if (players.size == 0)
				"Noone."
			else
				players map (formatPlayer(_)) mkString(", "))
		}
	}, "o")
}
