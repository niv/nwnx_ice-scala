package es.elv.kobold {
	import net.lag._
	import NWN._
	import Implicits._
	import ImplicitDowncasts._
	import scala.collection._

	object ImplicitDowncasts {
		implicit def nw2go[K](o: NWObject): G[K] =
			G(o).asInstanceOf[G[K]]
	}

	package events {
		final case class RawEvent(val self: NWObject, val event: String) extends Event

		abstract case class GameEvent() extends Event

		case class EStartup() extends GameEvent

		case class EModuleLoad() extends GameEvent
		case class EModuleHB() extends GameEvent

		case class EItemAcquire(val item: G[Item], val creature: G[Creature], val from: G[_],
			stackSize: Int, firstLoginAfterReset: Boolean) extends GameEvent
		case class EItemUnacquire(val item: G[_], val creature: G[Creature]) extends GameEvent
		case class EItemEquip(val item: G[Item], val creature: G[Creature]) extends GameEvent
		case class EItemUnequip(val item: G[_], val creature: G[Creature]) extends GameEvent
		case class EItemActivate(val item: G[Item], val creature: G[Creature], val targetObject: G[_],
			val targetLocation: Location) extends GameEvent
		case class EItemSpellCastAt(val item: G[Item], val caster: G[Creature], val castItem: G[Item],
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class ECreatureSpawn(val creature: G[Creature]) extends GameEvent
		case class ECreatureDamaged(val creature: G[Creature], val damager: G[Creature]) extends GameEvent
		case class ECreatureHB(val creature: G[Creature]) extends GameEvent
		case class ECreatureAttacked(val creature: G[Creature], val attacker: G[Creature],
			val attackMode: CombatMode, val attackType: SpecialAttack) extends GameEvent
		case class ECreatureConversation(val creature: G[Creature], val speaker: G[_]) extends GameEvent
		case class ECreatureDeath(val creature: G[Creature], val killer: G[Creature]) extends GameEvent
		case class ECreatureDisturbed(val creature: G[Creature], val disturber: G[Creature]) extends GameEvent
		case class ECreatureEndOfRound(val creature: G[Creature]) extends GameEvent
		case class ECreatureHears(val creature: G[Creature], val who: G[Creature]) extends GameEvent
		case class ECreatureSees(val creature: G[Creature], val who: G[Creature]) extends GameEvent
		case class ECreatureNoLongerHears(val creature: G[Creature], val who: G[Creature]) extends GameEvent
		case class ECreatureNoLongerSees(val creature: G[Creature], val who: G[Creature]) extends GameEvent

		case class ECreatureRest(val creature: G[Creature]) extends GameEvent
		case class ECreatureSpellCastAt(val creature: G[Creature], val caster: G[Creature], val castItem: G[Item],
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class EAreaEnter(val area: G[Area], val creature: G[Creature]) extends GameEvent
		case class EAreaLeave(val area: G[Area], val creature: G[Creature]) extends GameEvent
		case class ETransitionClick(val transition: G[_], val creature: G[Creature], val target: G[_]) extends GameEvent /* todo: transition/target = Trigger or Door, but cannot abstract */

		case class EDoorClick(val door: G[Door], val clicker: G[Creature]) extends GameEvent
		case class EDoorLock(val door: G[Door], val locker: G[Creature]) extends GameEvent
		case class EDoorUnlock(val door: G[Door], val unlocker: G[Creature]) extends GameEvent
		case class EDoorOpen(val door: G[Door], val opener: G[Creature]) extends GameEvent
		case class EDoorClosed(val door: G[Door], val closer: G[Creature]) extends GameEvent
		case class EDoorAttacked(val door: G[Door], val attacker: G[Creature]) extends GameEvent
		case class EDoorDamaged(val door: G[Door], val damager: G[_]) extends GameEvent
		case class EDoorDeath(val door: G[Door], val killer: G[_]) extends GameEvent
		case class EDoorFailToOpen(val door: G[Door], val blocked: G[Creature]) extends GameEvent
		case class EDoorSpellCastAt(val door: G[Door], val caster: G[Creature], val castItem: G[Item],
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class EPlayerEnter(val player: G[Player]) extends GameEvent
		case class EPlayerLeave(val player: G[Player]) extends GameEvent
		case class EPlayerDying(val player: G[Player]) extends GameEvent
		case class EPlayerDeath(val player: G[Player]) extends GameEvent
		case class EPlayerRest(val player: G[Player]) extends GameEvent
		case class EPlayerLevelUp(val player: G[Player]) extends GameEvent
		case class EPlayerRespawn(val player: G[Player]) extends GameEvent
		case class EPlayerCutsceneAbort(val player: G[Player]) extends GameEvent

		case class ETrapTriggered(val trap: G[_]) extends GameEvent
		case class ETrapDisarmed(val trap: G[_], val disarmer: G[Creature]) extends GameEvent

		case class ESaveCharacter(val player: G[Player]) extends GameEvent
		// case class ECreaturePickpocket(val creature: G[Creature], val target: G[Creature]) extends GameEvent
		case class ECreatureAttack(val creature: G[Creature], val target: G[_]) extends GameEvent
		case class EItemFreeActivate(val creature: G[Creature], val item: G[Item], val target: G[_], val targetLocation: Location) extends GameEvent
		case class ECreatureQuickChat(creature: G[Creature], chat: Int) extends GameEvent
		case class EObjectExamine(val examiner: G[Creature], val target: G[_]) extends GameEvent
		case class ECreatureUseSkill(val creature: G[Creature], val skill: Int, val target: G[_], val targetLocation: Location) extends GameEvent
		case class ECreatureUseFeat(val creature: G[Creature], val feat: Int, val target: G[_], val targetLocation: Location) extends GameEvent
		case class ECreatureToggleMode(val creature: G[Creature], val mode: ActionMode) extends GameEvent
		case class ECreatureCastSpell(val caster: G[Creature], val spell: Int, val target: G[_], val targetLocation: Location) extends GameEvent
		case class ETogglePause(player: G[Player]) extends GameEvent
		case class ECreaturePossessFamiliar(creature: G[Creature]) extends GameEvent

		case class EChatTalk(val speaker: G[_], val text: String) extends GameEvent
		case class EChatShout(val speaker: G[_], val text: String) extends GameEvent
		case class EChatWhisper(val speaker: G[_], val text: String) extends GameEvent
		case class EChatPrivate(val speaker: G[_], val to: G[_], val text: String) extends GameEvent
		case class EChatServer(val speaker: G[_], val text: String) extends GameEvent
		case class EChatParty(val speaker: G[_], val text: String) extends GameEvent
		case class EChatSilentShout(val speaker: G[_], val text: String) extends GameEvent
		case class EChatDM(val speaker: G[_], val text: String) extends GameEvent
	}

	object CoreEvents extends Plugin {
		import scala.concurrent.ops.future
		import events._

		val factories: List[WrappedFactory[NWObject, _ <: G[_]]] =
			List(AOE, Area, NonPlayer, Player, Door, Encounter, Item, Placeable, Store, Trigger, Waypoint)

		def invalidateFactories() = future(
			factories.foreach((f) => f.getCache.foreach((k) => k._2.clearCachedPropertiesByPolicy(cachedproperty.CachePolicy.Event)))
		)

		private var lastInvalidateRun: () => Unit = future()

		private val actions: mutable.Map[Class[_], mutable.Set[(Option[G[_]], (Event) => Unit)]] = mutable.Map()

		private var firstEvent = false

		// Register action to be ran with on as self when eventName on on happens. Hah, parse that.
		def once[T <: Event](onEvent: Class[T], self: Option[G[_]], action: (Event) => Unit) {
			if (!actions.contains(onEvent))
				actions(onEvent) = mutable.Set()
			val v = (self, action)
			actions(onEvent) += v
		}
		

		def listen(e: Event) = {
			// wait for last future
			lastInvalidateRun()

			if (!firstEvent) {
				firstEvent = true
				EventSource send new EStartup()
			}

			e match {
				case r: RawEvent => {
					val e: Event = (r.event match {
						case "module_hb"       => EventSource send new EModuleHB()
						case "module_load"     => EventSource send new EModuleLoad()

						case "transition_click" => EventSource send new ETransitionClick(
							G(r.self), R.proxy.getClickingObject,
							G(R.proxy.getTransitionTarget(r.self)))
						case "area_enter" => EventSource send new EAreaEnter(
							r.self, R.proxy.getEnteringObject)
						case "area_leave" => EventSource send new EAreaLeave(
							r.self, R.proxy.getExitingObject)

						case "item_acquire"    => {
							val it = R.proxy.getModuleItemAcquired
							EventSource send new EItemAcquire(
								R.proxy.getItemPossessor(it), R.proxy.getModuleItemAcquiredFrom,
								it, R.proxy.getModuleItemAcquiredStackSize,
								R.proxy.getObjectType(R.proxy.getModuleItemAcquiredBy) == ObjectType.InvalidObject)
						}
						case "item_unacquire"  => EventSource send new EItemUnacquire(
							R.proxy.getModuleItemLostBy, R.proxy.getModuleItemLost)
						case "item_equip"      => EventSource send new EItemEquip(
							R.proxy.getPCItemLastEquipped, R.proxy.getItemPossessor(R.proxy.getPCItemLastEquipped))
						case "item_unequip"    => EventSource send new EItemUnequip(
							R.proxy.getPCItemLastUnequipped, R.proxy.getPCItemLastUnequippedBy)
						case "item_spell_cast_at" => EventSource send new EItemSpellCastAt(
							r.self, R.proxy.getLastSpellCaster, R.proxy.getSpellCastItem,
							R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)
						case "item_activate"   => EventSource send new EItemActivate(
							R.proxy.getItemActivator, R.proxy.getItemActivated,
							R.proxy.getItemActivatedTarget, R.proxy.getItemActivatedTargetLocation)

						case "creature_spawn"  => EventSource send new ECreatureSpawn(r.self)
						case "creature_hb"     => EventSource send new ECreatureHB(r.self)
						case "creature_attacked" => EventSource send new ECreatureAttacked(
							r.self, R.proxy.getLastAttacker(r.self), R.proxy.getLastAttackMode(r.self),
							R.proxy.getLastAttackType(r.self))
						case "creature_conversation" => EventSource send new ECreatureConversation(
							r.self, R.proxy.getLastSpeaker)
						case "creature_damaged" => EventSource send new ECreatureDamaged(
							r.self, R.proxy.getLastDamager(r.self))
						case "creature_death" => EventSource send new ECreatureDeath(
							r.self, R.proxy.getLastKiller)
						case "creature_disturbed" => EventSource send new ECreatureDisturbed(
							r.self, R.proxy.getLastDisturbed)
						case "creature_endofround" => EventSource send new ECreatureEndOfRound(
							r.self)
						case "creature_perceive" => {
							val (heard, seen, inaudible, vanished) = (
								R.proxy.getLastPerceptionHeard, R.proxy.getLastPerceptionSeen,
								R.proxy.getLastPerceptionInaudible, R.proxy.getLastPerceptionVanished
							)
							require(List(heard, seen, inaudible, vanished).count(_ == true) == 1)
							if (heard) EventSource send new ECreatureHears(r.self, R.proxy.getLastPerceived)
							else if (seen) EventSource send new ECreatureSees(r.self, R.proxy.getLastPerceived)
							else if (inaudible) EventSource send new ECreatureNoLongerHears(r.self, R.proxy.getLastPerceived)
							else EventSource send new ECreatureNoLongerSees(r.self, R.proxy.getLastPerceived)
						}
						case "creature_rest" => EventSource send new ECreatureRest(r.self)
						case "creature_spell_cast_at" => EventSource send new ECreatureSpellCastAt(
							r.self, R.proxy.getLastSpellCaster, R.proxy.getSpellCastItem,
							R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)


						case "player_login" => {
							val player = Player(r.self)
							nwnx.Chat.pcIn(player)
							EventSource send new EPlayerEnter(player)
						}
						case "player_logout" => {
							val player = Player(r.self)
							nwnx.Chat.pcOut(player)
							EventSource send new EPlayerLeave(player)
						}
						case "player_dying" => EventSource send new EPlayerDying(R.proxy.getLastPlayerDying)
						case "player_death" => EventSource send new EPlayerDeath(R.proxy.getLastPlayerDied)
						case "player_rest" => EventSource send new EPlayerRest(R.proxy.getLastPCRested)
						case "player_levelup" => EventSource send new EPlayerLevelUp(R.proxy.getPCLevellingUp)
						case "player_respawn" => EventSource send new EPlayerRespawn(R.proxy.getLastRespawnButtonPresser)
						case "player_cutscene_abort" => EventSource send new EPlayerCutsceneAbort(R.proxy.getLastPCToCancelCutscene)

						case "door_click" => EventSource send new EDoorClick(r.self, R.proxy.getClickingObject)
						case "door_lock" => EventSource send new EDoorLock(r.self, R.proxy.getLastLocked)
						case "door_unlock" => EventSource send new EDoorUnlock(r.self, R.proxy.getLastUnlocked)
						case "door_open" => EventSource send new EDoorOpen(r.self, R.proxy.getLastOpenedBy)
						case "door_closed" => EventSource send new EDoorClosed(r.self, R.proxy.getLastClosedBy)
						case "door_attacked" => EventSource send new EDoorAttacked(r.self, R.proxy.getLastAttacker(r.self))
						case "door_damaged" => EventSource send new EDoorDamaged(r.self, R.proxy.getLastDamager(r.self))
						case "door_death" => EventSource send new EDoorDeath(r.self, R.proxy.getLastKiller)
						case "door_fail_to_open" => EventSource send new EDoorFailToOpen(r.self, R.proxy.getClickingObject)
						case "door_spell_cast_at" => EventSource send new EDoorSpellCastAt(r.self, R.proxy.getLastSpellCaster,
								R.proxy.getSpellCastItem, R.proxy.getLastSpell, R.proxy.getMetaMagicFeat, R.proxy.getLastSpellHarmful)

						case "trap_disarm" => EventSource send new ETrapDisarmed(G(r.self), R.proxy.getLastDisarmed)
						case "trap_triggered" => EventSource send new ETrapTriggered(G(r.self))

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
							val nwnxLocation = Location(Area(R.proxy.getArea(r.self)), nwnxPosition, 0)

							nwnxType match {
								case 1 => EventSource send new ESaveCharacter(r.self)
								// case 2 => EventSource send new ECreaturePickpocket(r.self, nwnxTarget)
								case 3 => EventSource send new ECreatureAttack(r.self, G(nwnxTarget))
								case 4 => EventSource send new EItemFreeActivate(r.self, nwnxItem, G(nwnxTarget), nwnxLocation)
								case 5 => EventSource send new ECreatureQuickChat(r.self, nwnxSubType)
								case 6 => EventSource send new EObjectExamine(r.self, G(nwnxTarget))
								case 7 => EventSource send new ECreatureUseSkill(r.self, nwnxSubType, G(nwnxTarget), nwnxLocation)
								case 8 => EventSource send new ECreatureUseFeat(r.self, nwnxSubType, G(nwnxTarget), nwnxLocation)
								case 9 => EventSource send new ECreatureToggleMode(r.self, ActionMode.convert(nwnxSubType))
								case 10 => EventSource send new ECreatureCastSpell(r.self, nwnxSubType, G(nwnxTarget), nwnxLocation)
								case 11 => EventSource send new ETogglePause(r.self)
								case 12 => EventSource send new ECreaturePossessFamiliar(r.self)
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
							if (R.proxy.getLocalInt(r.self, "ice_chat_message_ignore") > 0) {
								R.proxy.setLocalInt(r.self, "ice_chat_message_ignore", 0)
								r

							} else {
								val allText = nwnx.Core.get(r.self, "CHAT", "TEXT", 1024) // R.proxy.getLocalString(r.self, "NWNX!CHAT!TEXT")
								val modeWithDM = allText.substring(0, 2).trim.toInt
								val mode = if (modeWithDM > 16) modeWithDM - 16 else modeWithDM
								val toId = allText.substring(2, 12).trim.toInt
								val text = allText.substring(12)
								val to = if (mode == 4) nwnx.Chat.getPC(toId) else Invalid()

								mode match {
									case  1 => EventSource send new EChatTalk(G(r.self), text)
									case  2 => EventSource send new EChatShout(G(r.self), text)
									case  3 => EventSource send new EChatWhisper(G(r.self), text)
									case  4 => EventSource send new EChatPrivate(G(r.self), to, text)
									case  5 => EventSource send new EChatServer(G(r.self), text)
									case  6 => EventSource send new EChatParty(G(r.self), text)
									case 13 => EventSource send new EChatSilentShout(G(r.self), text)
									case 14 => EventSource send new EChatDM(G(r.self), text)
								}
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

					// log.info(e.toString)

					if (e.stopped)
						r.stop
				}
				case _ =>
			}

			lastInvalidateRun = invalidateFactories()
		}
	}
}
