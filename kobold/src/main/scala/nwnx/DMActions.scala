package es.elv.kobold

import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package events {
	case class DMActionsEvent () extends GameEvent
	case class OnDMGiveXP(dm: DM, target: Creature, amount: Int) extends DMActionsEvent
	case class OnDMGiveLevel(dm: DM, target: Creature, amount: Int) extends DMActionsEvent
	case class OnDMGiveGold(dm: DM, target: Creature, amount: Int) extends DMActionsEvent
	case class OnDMCreateItemOnObject(dm: DM, item: Item, on: G) extends DMActionsEvent
	case class OnDMCreateItemAtLocation(dm: DM, item: Item, at: Location) extends DMActionsEvent
	case class OnDMHeal(dm: DM, target: Creature) extends DMActionsEvent

	case class OnDMAppear(dm: DM) extends DMActionsEvent
	case class OnDMDisappear(dm: DM) extends DMActionsEvent
}

package nwnx {

object DMActions extends Core("DMACTIONS") with Plugin {
	import events.ImplicitDowncasts._

	def suppress(o: DM) = set(o, "PREVENT", "1")

	def listen(event: Event) = event match {

		case RawEvent(self, t) => t match {
			case "dmaction" => {
				val actionId = try { get(self, "GETACTIONID", 10).toInt } catch { case _ => 0 }
				lazy val dm = G[DM](self)
				lazy val target1 = getObject(dm, "TARGET_1")
				lazy val target2 = getObject(dm, "TARGET_2")
				val param1  = try { get(dm, "GETPARAM_1", 10).toInt } catch { case _ => 0 }
				val param2  = try { get(dm, "GETPARAM_2", 10).toInt } catch { case _ => 0 }
				lazy val nwnxPosition = stringToVector(get(Module(), "GETPOS", 30))
				lazy val loc = Location(G[Area](target1), nwnxPosition, 0)

				log.debug("actionId=%d".format(actionId))

				actionId match {
					case 1 => param1 match { // message type
						case 10 => // spawn creature
						case 13 => // spawn wp
						case 14 => // spawn enc
						case 15 => // spawn portal
						case 16 => // spawn placeable

						case 36 => // invur
						case 50 => // immortal
						case 37 => // force rest
						case 34 => // goto
						case 35 => // possess
						case 41 => // possess dm
						case 43 => // toggle AI
						case 44 => // toggle lock
						case 46 => // send event enter
						case 47 => // send event exit
						case 33 => // kill
						case 32 => // heal
						case 80 => // jump to point
						case 140 => // alig to good
						case 141 => // alig to evil
						case 142 => // alig to law
						case 143 => // alig to chaos
						case 131 => // jump all players to point
						case 132 => // Modify/Set creature stats
						case 134 => // SetVar*
						case 133 => // GetVar*
						case 139 => // DumpVars
						case 48 => EventSource send OnDMAppear(dm)
						case 49 => EventSource send OnDMDisappear(dm)
						case 135 => // settime
						case 17 => // change difficulty
						case 3 => // find by tag
						case 39 => // find next
						case 1 => // get objects list in area
						case _ => log.warn("unhandled message type: " + param1)
					}
					case 2 => EventSource send OnDMGiveXP(dm, target1, param1)
					case 3 => EventSource send OnDMGiveLevel(dm, target1, param1)
					case 4 => EventSource send OnDMGiveGold(dm, target1, param1)
					case 5 => EventSource send OnDMCreateItemOnObject(dm, target2, target1)
					case 6 => EventSource send OnDMCreateItemAtLocation(dm, target2, loc)
					case 7 => EventSource send OnDMHeal(dm, target1)
					case _ => log.warn("unhandled parsed message: " + actionId)
				}

				R.setRawEventHandled
			}
			case _ =>
		}

		case _ =>
	}
}

}
