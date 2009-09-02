package es.elv.kobold {
	import net.lag._
	import NWN._
	import Implicits._
	import ImplicitDowncasts._
	import scala.collection._

	object ImplicitDowncasts {
		implicit def nwn2go[K <: G](o: NWObject): K = G[K](o)
	}

	package events {
		final case class RawEvent(val self: NWObject, val event: String) extends Event
		final case class AnyEvent(val self: G, val event: String) extends Event

		abstract case class GameEvent() extends Event

		case class OnStartup() extends GameEvent

		case class OnModuleLoad() extends GameEvent
		case class OnModuleHB() extends GameEvent

		case class OnItemAcquire(val item: G, val creature: G, val from: G,
			stackSize: Int, firstLoginAfterReset: Boolean) extends GameEvent
		case class OnItemUnacquire(val item: G, val creature: G) extends GameEvent
		case class OnItemEquip(val item: G, val creature: G) extends GameEvent
		case class OnItemUnequip(val item: G, val creature: G) extends GameEvent
		case class OnItemActivate(val item: G, val creature: G, val targetObject: G,
			val targetLocation: Location) extends GameEvent
		case class OnItemSpellCastAt(val item: G, val caster: G, val castItem: G,
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class OnCreatureSpawn(val creature: G) extends GameEvent
		case class OnCreatureDamaged(val creature: G, val damager: G) extends GameEvent
		case class OnCreatureHB(val creature: G) extends GameEvent
		case class OnCreatureAttacked(val creature: G, val attacker: G,
			val attackMode: CombatMode, val attackType: SpecialAttack) extends GameEvent
		case class OnCreatureConversation(val creature: G, val speaker: G) extends GameEvent
		case class OnCreatureDeath(val creature: G, val killer: G) extends GameEvent
		case class OnCreatureBlocked(val creature: G, val blocker: G) extends GameEvent
		case class OnCreatureDisturbed(val creature: G, val disturber: G) extends GameEvent
		case class OnCreatureEndOfRound(val creature: G) extends GameEvent
		case class OnCreatureHears(val creature: G, val who: G) extends GameEvent
		case class OnCreatureSees(val creature: G, val who: G) extends GameEvent
		case class OnCreatureNoLongerHears(val creature: G, val who: G) extends GameEvent
		case class OnCreatureNoLongerSees(val creature: G, val who: G) extends GameEvent

		case class OnCreatureRest(val creature: G) extends GameEvent
		case class OnCreatureSpellCastAt(val creature: G, val caster: G, val castItem: G,
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class OnAreaEnter(val area: G, val creature: G) extends GameEvent
		case class OnAreaLeave(val area: G, val creature: G) extends GameEvent
		case class OnTransitionClick(val transition: G, val creature: G, val target: G) extends GameEvent /* todo: transition/target = Trigger or Door, but cannot abstract */

		case class OnDoorClick(val door: G, val clicker: G) extends GameEvent
		case class OnDoorLock(val door: G, val locker: G) extends GameEvent
		case class OnDoorUnlock(val door: G, val unlocker: G) extends GameEvent
		case class OnDoorOpen(val door: G, val opener: G) extends GameEvent
		case class OnDoorClosed(val door: G, val closer: G) extends GameEvent
		case class OnDoorAttacked(val door: G, val attacker: G) extends GameEvent
		case class OnDoorDamaged(val door: G, val damager: G) extends GameEvent
		case class OnDoorDeath(val door: G, val killer: G) extends GameEvent
		case class OnDoorFailToOpen(val door: G, val blocked: G) extends GameEvent
		case class OnDoorSpellCastAt(val door: G, val caster: G, val castItem: G,
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class OnPlayerEnter(val player: G) extends GameEvent
		case class OnPlayerLeave(val player: G) extends GameEvent
		case class OnPlayerDying(val player: G) extends GameEvent
		case class OnPlayerDeath(val player: G) extends GameEvent
		case class OnPlayerRest(val player: G) extends GameEvent
		case class OnPlayerLevelUp(val player: G) extends GameEvent
		case class OnPlayerRespawn(val player: G) extends GameEvent
		case class OnPlayerCutsceneAbort(val player: G) extends GameEvent

		case class OnTrapTriggered(val trap: G) extends GameEvent
		case class OnTrapDisarmed(val trap: G, val disarmer: G) extends GameEvent

		case class OnSaveCharacter(val player: G) extends GameEvent
		// case class OnCreaturePickpocket(val creature: G, val target: G) extends GameEvent
		case class OnCreatureAttack(val creature: G, val target: G) extends GameEvent
		case class OnItemFreeActivate(val creature: G, val item: G, val target: G, val targetLocation: Location) extends GameEvent
		case class OnCreatureQuickChat(creature: G, chat: Int) extends GameEvent
		case class OnObjectExamine(val examiner: G, val target: G) extends GameEvent
		case class OnCreatureUseSkill(val creature: G, val skill: Int, val target: G, val targetLocation: Location) extends GameEvent
		case class OnCreatureUseFeat(val creature: G, val feat: Int, val target: G, val targetLocation: Location) extends GameEvent
		case class OnCreatureToggleMode(val creature: G, val mode: ActionMode) extends GameEvent
		case class OnCreatureCastSpell(val caster: G, val spell: Int, val target: G, val targetLocation: Location) extends GameEvent
		case class OnTogglePause(player: G) extends GameEvent
		case class OnCreaturePossessFamiliar(creature: G) extends GameEvent

		case class OnChatTalk(val speaker: G, val text: String) extends GameEvent
		case class OnChatShout(val speaker: G, val text: String) extends GameEvent
		case class OnChatWhisper(val speaker: G, val text: String) extends GameEvent
		case class OnChatPrivate(val speaker: G, val to: G, val text: String) extends GameEvent
		case class OnChatServer(val speaker: G, val text: String) extends GameEvent
		case class OnChatParty(val speaker: G, val text: String) extends GameEvent
		case class OnChatSilentShout(val speaker: G, val text: String) extends GameEvent
		case class OnChatDM(val speaker: G, val text: String) extends GameEvent
	}

	object CoreEvents extends Plugin {
		import scala.concurrent.ops.future
		import events._

		private val actions: mutable.Map[Class[_], mutable.Set[(Option[G], (Event) => Unit)]] = mutable.Map()

		private var firstEvent = false

		// Register action to be ran with on as self when eventName on on happens. Hah, parse that.
		def once[T <: Event](onEvent: Class[T], self: Option[G], action: (Event) => Unit) {
			if (!actions.contains(onEvent))
				actions(onEvent) = mutable.Set()
			val v = (self, action)
			actions(onEvent) += v
		}
		

		def listen(e: Event) = {
			if (!firstEvent) {
				firstEvent = true
				EventSource send new OnStartup()
			}

			e match {
				case r: RawEvent => {
					val ee = EventSource send new AnyEvent(r.self, r.event)

					val e: Event = (r.event match {
						case "module_hb"       => EventSource send new OnModuleHB()
						case "module_load"     => EventSource send new OnModuleLoad()

						case "transition_click" => EventSource send new OnTransitionClick(
							G(r.self), R.proxy.getClickingObject,
							G(R.proxy.getTransitionTarget(r.self)))
						case "area_enter" => EventSource send new OnAreaEnter(
							r.self, R.proxy.getEnteringObject)
						case "area_leave" => EventSource send new OnAreaLeave(
							r.self, R.proxy.getExitingObject)

						case "item_acquire"    => {
							val it = R.proxy.getModuleItemAcquired
							EventSource send new OnItemAcquire(
								R.proxy.getItemPossessor(it), R.proxy.getModuleItemAcquiredFrom,
								it, R.proxy.getModuleItemAcquiredStackSize,
								R.proxy.getObjectType(R.proxy.getModuleItemAcquiredBy) == ObjectType.InvalidObject)
						}
						case "item_unacquire"  => EventSource send new OnItemUnacquire(
							R.proxy.getModuleItemLostBy, R.proxy.getModuleItemLost)
						case "item_equip"      => EventSource send new OnItemEquip(
							R.proxy.getPCItemLastEquipped, R.proxy.getItemPossessor(R.proxy.getPCItemLastEquipped))
						case "item_unequip"    => EventSource send new OnItemUnequip(
							R.proxy.getPCItemLastUnequipped, R.proxy.getPCItemLastUnequippedBy)
						case "item_spell_cast_at" => EventSource send new OnItemSpellCastAt(
							r.self, R.proxy.getLastSpellCaster, R.proxy.getSpellCastItem,
							R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)
						case "item_activate"   => EventSource send new OnItemActivate(
							R.proxy.getItemActivator, R.proxy.getItemActivated,
							R.proxy.getItemActivatedTarget, R.proxy.getItemActivatedTargetLocation)

						case "creature_spawn"  => EventSource send new OnCreatureSpawn(r.self)
						case "creature_hb"     => EventSource send new OnCreatureHB(r.self)
						case "creature_attacked" => EventSource send new OnCreatureAttacked(
							r.self, R.proxy.getLastAttacker(r.self), R.proxy.getLastAttackMode(r.self),
							R.proxy.getLastAttackType(r.self))
						case "creature_conversation" => EventSource send new OnCreatureConversation(
							r.self, R.proxy.getLastSpeaker)
						case "creature_damaged" => EventSource send new OnCreatureDamaged(
							r.self, R.proxy.getLastDamager(r.self))
						case "creature_death" => EventSource send new OnCreatureDeath(
							r.self, R.proxy.getLastKiller)
						case "creature_blocked" => EventSource send new OnCreatureBlocked(
							r.self, R.proxy.getBlockingDoor)
						case "creature_disturbed" => EventSource send new OnCreatureDisturbed(
							r.self, R.proxy.getLastDisturbed)
						case "creature_endofround" => EventSource send new OnCreatureEndOfRound(
							r.self)
						case "creature_perceive" => {
							val (heard, seen, inaudible, vanished) = (
								R.proxy.getLastPerceptionHeard, R.proxy.getLastPerceptionSeen,
								R.proxy.getLastPerceptionInaudible, R.proxy.getLastPerceptionVanished
							)
							require(List(heard, seen, inaudible, vanished).count(_ == true) == 1)
							if (heard) EventSource send new OnCreatureHears(r.self, R.proxy.getLastPerceived)
							else if (seen) EventSource send new OnCreatureSees(r.self, R.proxy.getLastPerceived)
							else if (inaudible) EventSource send new OnCreatureNoLongerHears(r.self, R.proxy.getLastPerceived)
							else EventSource send new OnCreatureNoLongerSees(r.self, R.proxy.getLastPerceived)
						}
						case "creature_rest" => EventSource send new OnCreatureRest(r.self)
						case "creature_spell_cast_at" => EventSource send new OnCreatureSpellCastAt(
							r.self, R.proxy.getLastSpellCaster, R.proxy.getSpellCastItem,
							R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)


						case "player_login" => {
							val player: G = G(r.self)
							nwnx.Chat.pcIn(player)
							EventSource send new OnPlayerEnter(player)
						}
						case "player_logout" => {
							val player: G = G(r.self)
							nwnx.Chat.pcOut(player)
							EventSource send new OnPlayerLeave(player)
						}
						case "player_dying" => EventSource send new OnPlayerDying(R.proxy.getLastPlayerDying)
						case "player_death" => EventSource send new OnPlayerDeath(R.proxy.getLastPlayerDied)
						case "player_rest" => EventSource send new OnPlayerRest(R.proxy.getLastPCRested)
						case "player_levelup" => EventSource send new OnPlayerLevelUp(R.proxy.getPCLevellingUp)
						case "player_respawn" => EventSource send new OnPlayerRespawn(R.proxy.getLastRespawnButtonPresser)
						case "player_cutscene_abort" => EventSource send new OnPlayerCutsceneAbort(R.proxy.getLastPCToCancelCutscene)

						case "door_click" => EventSource send new OnDoorClick(r.self, R.proxy.getClickingObject)
						case "door_lock" => EventSource send new OnDoorLock(r.self, R.proxy.getLastLocked)
						case "door_unlock" => EventSource send new OnDoorUnlock(r.self, R.proxy.getLastUnlocked)
						case "door_open" => EventSource send new OnDoorOpen(r.self, R.proxy.getLastOpenedBy)
						case "door_closed" => EventSource send new OnDoorClosed(r.self, R.proxy.getLastClosedBy)
						case "door_attacked" => EventSource send new OnDoorAttacked(r.self, R.proxy.getLastAttacker(r.self))
						case "door_damaged" => EventSource send new OnDoorDamaged(r.self, R.proxy.getLastDamager(r.self))
						case "door_death" => EventSource send new OnDoorDeath(r.self, R.proxy.getLastKiller)
						case "door_fail_to_open" => EventSource send new OnDoorFailToOpen(r.self, R.proxy.getClickingObject)
						case "door_spell_cast_at" => EventSource send new OnDoorSpellCastAt(r.self, R.proxy.getLastSpellCaster,
								R.proxy.getSpellCastItem, R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)

						case "trap_disarm" => EventSource send new OnTrapDisarmed(G(r.self), R.proxy.getLastDisarmed)
						case "trap_triggered" => EventSource send new OnTrapTriggered(G(r.self))

						// NWNX
						// case "player_chat" => EventSource send new E

						case "nwnx_event" => {
							val nwnxType = nwnx.Core.get(Module(), "EVENTS", "GET_EVENT_ID", 10).trim.toInt
							val nwnxSubType = nwnx.Core.get(Module(), "EVENTS", "GET_EVENT_SUBID", 10).trim.toInt
							val nwnxItem = nwnx.Core.getObject(Module(), "EVENTS", "ITEM")
							val nwnxTarget = nwnx.Core.getObject(Module(), "EVENTS", "TARGET")
							val nwnxPosition = {
								val svec = nwnx.Core.get(Module(), "EVENTS", "GET_EVENT_POSITION", 30)
								if (svec.size == 26) {
									val (x, y, z) = (svec.substring(0, 8).toDouble, svec.substring(9, 17).toDouble,
										svec.substring(18, 26).toDouble)
									Vector(x, y, z)
								} else {
									Vector(0, 0, 0)
								}
							}
							val nwnxLocation = Location(G[Area](R.proxy.getArea(r.self)), nwnxPosition, 0)

							nwnxType match {
								case 1 => EventSource send new OnSaveCharacter(r.self)
								// case 2 => EventSource send new OnCreaturePickpocket(r.self, nwnxTarget)
								case 3 => EventSource send new OnCreatureAttack(r.self, G(nwnxTarget))
								case 4 => EventSource send new OnItemFreeActivate(r.self, nwnxItem, G(nwnxTarget), nwnxLocation)
								case 5 => EventSource send new OnCreatureQuickChat(r.self, nwnxSubType)
								case 6 => EventSource send new OnObjectExamine(r.self, G(nwnxTarget))
								case 7 => EventSource send new OnCreatureUseSkill(r.self, nwnxSubType, G(nwnxTarget), nwnxLocation)
								case 8 => EventSource send new OnCreatureUseFeat(r.self, nwnxSubType, G(nwnxTarget), nwnxLocation)
								case 9 => EventSource send new OnCreatureToggleMode(r.self, ActionMode.convert(nwnxSubType))
								case 10 => EventSource send new OnCreatureCastSpell(r.self, nwnxSubType, G(nwnxTarget), nwnxLocation)
								case 11 => EventSource send new OnTogglePause(r.self)
								case 12 => EventSource send new OnCreaturePossessFamiliar(r.self)
								case _ => log.warning("Unhandled nwnx_event: " + r.event) ; r
							}
						}

						case "nwnx_chat" => {
							/*
							MSG_TALK = 1,
							MSG_SHOUT = 2,
							MSG_WHISPER = 3,
							MSG_PRIVATE = 4,
							MSG_SERVER = 5,
							MSG_PARTY = 6,
							MSG_SILENT_SHOUT = 13,
							MSG_DM = 14,
							MSG_MODE_DM = 16;
							*/
							val allText = nwnx.Core.get(r.self, "CHAT", "TEXT", 1024)
							val modeWithDM = allText.substring(0, 2).trim.toInt
							val mode = if (modeWithDM > 16) modeWithDM - 16 else modeWithDM
							val toId = allText.substring(2, 12).trim.toInt
							val text = allText.substring(12)
							val to = if (mode == 4) nwnx.Chat.getPC(toId) else Invalid()

							mode match {
								case  1 => EventSource send new OnChatTalk(G(r.self), text)
								case  2 => EventSource send new OnChatShout(G(r.self), text)
								case  3 => EventSource send new OnChatWhisper(G(r.self), text)
								case  4 => EventSource send new OnChatPrivate(G(r.self), to, text)
								case  5 => EventSource send new OnChatServer(G(r.self), text)
								case  6 => EventSource send new OnChatParty(G(r.self), text)
								case 13 => EventSource send new OnChatSilentShout(G(r.self), text)
								case 14 => EventSource send new OnChatDM(G(r.self), text)
							}
						}


						case _ => log.warning("Unhandled event received: " + r.event) ; r
					})

					if (actions.contains(e.getClass)) {
						actions(e.getClass).foreach(x => {
							val (self, handler) = (x._1, x._2)
							if ((self.isDefined && r.self.id == self.get.wrapped.id) || self.isEmpty) {
								actions(e.getClass) -= x
								handler(e)
							}
						})
					}

					if (e.stopped)
						r.stop
				}
				case _ =>
			}
		}
	}
}
