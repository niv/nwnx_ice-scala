package org.sternenfall.kobold.xmpp

import es.elv.kobold._

object Help extends Plugin {
	def listen(event: events.Event) = {}

	XMPPService.registerCommand("help", "This crud.", "", (c, a) => {
		var text = "\nAvailable commands: \n"
		for ((cmd, (help, longHelp, bdy, aliases)) <- XMPPService.commands
				if help.size > 0) {
			text += "  %s: %s\n".format(cmd, help)
			if (aliases.size > 0)
				text += "    Aliases: %s\n".format(aliases.mkString(", "))
		}
		c sendMessage text
	}, "?")
}
