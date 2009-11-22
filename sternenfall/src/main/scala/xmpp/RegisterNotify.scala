package org.sternenfall.kobold.xmpp

import es.elv.kobold._

object RegisterNotify extends Plugin {
	private val db = getConfig("xmpp.notifyLists.properties")
	db.setAutoSave(true)

	private def formatPlayer(p: PlayerCreature): String =
		"%s (%s)%s".format(p.name(), p.account(),
			p match { case dm: DM => " (DM)" case _ => "" })

	private val XMPPReply = """@ ?([^ ]+) (.+)""".r

	def listen(event: events.Event) = event match {
		case events.OnPlayerEnter(p: PlayerCreature) =>
			notifyPlayers(config.getString("msg.playerEnter").format(formatPlayer(p)))

		case events.OnPlayerLeave(p: PlayerCreature) =>
			notifyPlayers(config.getString("msg.playerLeave").format(formatPlayer(p)))

		case events.OnChatTalk(p: PlayerCreature, t: String) => if (t.substring(0, 1) == "@") {
			t match {
				case XMPPReply(toAcc, msg) => jidOfAccount(toAcc.toLowerCase) match {
					case None => p message config.getString("msg.noXMPPSet")

					case Some(jid) =>  {
						XMPPService sendMessage (jid, config.getString("msg.msgToJabber").format(p.account(), msg))
						p message config.getString("msg.sentToJabber")
					}
				}

				case _ => p message config.getString("msg.syntax")
			}
			nwnx.Chat.suppress(p)
			event.stop
		}

		case _ =>
	}

	private def accountOfJid(jid: String): Option[String] = {
		val names = db.getKeys("map")
		while (names.hasNext) {
			names.next match {
				case s: String => if (db.getString(s) == jid)
					return Some(s.replace("map.", ""))
				case x => log.error("unidentified element in map: " + x)
			}
		}
		None
	}

	private def jidOfAccount(account: String): Option[String] =
		if (db.containsKey("map." + account.toLowerCase))
			Some(db.getString("map." + account.toLowerCase))
		else
			None

	private def notifyPlayers(m: String) =
		for (jid <- db.getStringArray("notify.players"))
			XMPPService sendMessage (jid, m)

	XMPPService.registerCommand("register", config.getString("help.register"), "", (c, a) => {
		val jid = c.getParticipant.split("/")(0)
		val n = (jid :: db.getStringArray("notify.players").toList).filter(_.trim != "").removeDuplicates
		db.setProperty("notify.players", n.toArray)
		c sendMessage config.getString("msg.registered").format(jid)
	})

	XMPPService.registerCommand("unregister", config.getString("help.unregister"), "", (c, a) => {
		val jid = c.getParticipant.split("/")(0)
		val n = (db.getStringArray("notify.players").toList - jid).filter(_.trim != "").removeDuplicates
		db.setProperty("notify.players", n.toArray)
		c sendMessage config.getString("msg.unregistered").format(jid)
	})

	private val msgRx = """([^ ]+?) (.+)""".r
	XMPPService.registerCommand("@", config.getString("help.msg"), "", (c, a) => {
		a match {
			case msgRx(account, message) => {
				val jid = c.getParticipant.split("/")(0).toLowerCase

				accountOfJid(jid) match {
					case None => c sendMessage config.getString("msg.noAddress")

					case Some(accOfSender) => {
						R schedule {
							PlayerCreature.byAccount(account) match {
								case Some(p) => {
									p floatingText config.getString("msg.msg").format(c.getParticipant, message)
									p message config.getString("msg.toAnswer").format(accOfSender.toLowerCase)
									c sendMessage config.getString("msg.sentToIG")
								}
								case None => c sendMessage config.getString("msg.notOnline")
							}
						}

					}

				}
			}

			case _ =>
				c sendMessage "Expected parameters: Accountname Message .."
		}
	})

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
