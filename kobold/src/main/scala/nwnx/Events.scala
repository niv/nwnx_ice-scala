package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package events {
	case class OnSaveCharacter(val player: G) extends GameEvent
	// case class OnCreaturePickpocket(val creature: G, val target: G) extends GameEvent
	case class OnCreatureAttack(val creature: G, val target: G) extends GameEvent
	case class OnItemFreeActivate(val item: G, val creature: G, val target: G, val targetLocation: Location) extends GameEvent
	case class OnCreatureQuickChat(creature: G, chat: Int) extends GameEvent
	case class OnObjectExamine(val examiner: G, val target: G) extends GameEvent
	case class OnCreatureUseSkill(val creature: G, val skill: Int, val target: G, val targetLocation: Location) extends GameEvent
	case class OnCreatureUseFeat(val creature: G, val feat: Int, val target: G, val targetLocation: Location) extends GameEvent
	case class OnCreatureToggleMode(val creature: G, val mode: ActionMode, val desiredState: Boolean) extends GameEvent
	case class OnCreatureCastSpell(val caster: G, val spell: Int, val target: G, val targetLocation: Location) extends GameEvent
	case class OnTogglePause(player: G) extends GameEvent
	case class OnCreaturePossessFamiliar(creature: G) extends GameEvent
}

package nwnx {

object Events extends Core("EVENTS") with Plugin {
	import events.ImplicitDowncasts._

	def suppress = set(Module(), "BYPASS", "1")
	
	def listen(event: Event) = event match {

		case RawEvent(self, t) => t match {
			case "nwnx_event" => {
				val nwnxType = get(Module(), "GET_EVENT_ID", 10).trim.toInt
				val nwnxSubType = get(Module(), "GET_EVENT_SUBID", 10).trim.toInt
				val nwnxItem = getObject(Module(), "ITEM")
				val nwnxTarget = getObject(Module(), "TARGET")
				val nwnxPosition = stringToVector(get(Module(), "GET_EVENT_POSITION", 30))

				val area = G[G](R.proxy.getArea(self))
				val nwnxLocation = if (area.valid)
					Location(area.asInstanceOf[Area], nwnxPosition, 0)
				else
					InvalidLocation()

				nwnxType match {
					case 1 => EventSource send new OnSaveCharacter(self)
					// case 2 => EventSource send new OnCreaturePickpocket(self, nwnxTarget)
					case 3 => EventSource send new OnCreatureAttack(self, G(nwnxTarget))
					case 4 => EventSource send new OnItemFreeActivate(nwnxItem, self, G(nwnxTarget), nwnxLocation)
					case 5 => EventSource send new OnCreatureQuickChat(self, nwnxSubType)
					case 6 => EventSource send new OnObjectExamine(self, G(nwnxTarget))
					case 7 => EventSource send new OnCreatureUseSkill(self, nwnxSubType, G(nwnxTarget), nwnxLocation)
					case 8 => EventSource send new OnCreatureUseFeat(self, nwnxSubType, G(nwnxTarget), nwnxLocation)
					case 9 => EventSource send new OnCreatureToggleMode(self,
						ActionMode.convert(nwnxSubType), !R.proxy.getActionMode(self, ActionMode.convert(nwnxSubType)))
					case 10 => EventSource send new OnCreatureCastSpell(self, nwnxSubType, G(nwnxTarget), nwnxLocation)
					case 11 => EventSource send new OnTogglePause(self)
					case 12 => EventSource send new OnCreaturePossessFamiliar(self)
					case _ => log.error("Unhandled nwnx_event: " + nwnxType)
				}

				R.setRawEventHandled
			}

			case _ =>
		}
		
		case _ =>
	}
}

}
