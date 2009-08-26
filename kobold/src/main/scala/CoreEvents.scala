package es.elv.kobold {
	import net.lag._
	import NWN._
	import Implicits._
	import ImplicitDowncasts._
	import scala.collection._

	object ImplicitDowncasts {
		implicit def nw2go[K](o: NWObject): GameObject[K] =
			GameObject(o).asInstanceOf[GameObject[K]]
	}

	package events {
		final case class RawEvent(val self: NWObject, val event: String) extends Event

		abstract case class GameEvent() extends Event

		case class EModuleLoad() extends GameEvent
		case class EModuleHB() extends GameEvent

		case class EItemAcquire(val item: GameObject[Item], val creature: GameObject[Creature], val from: GameObject[_],
			stackSize: Int, firstLoginAfterReset: Boolean) extends GameEvent
		case class EItemUnacquire(val item: GameObject[_], val creature: GameObject[Creature]) extends GameEvent
		case class EItemEquip(val item: GameObject[Item], val creature: GameObject[Creature]) extends GameEvent
		case class EItemUnequip(val item: GameObject[_], val creature: GameObject[Creature]) extends GameEvent
		case class EItemActivate(val item: GameObject[Item], val creature: GameObject[Creature], val targetObject: GameObject[_],
			val targetLocation: Location) extends GameEvent
		case class EItemSpellCastAt(val item: GameObject[Item], val caster: GameObject[Creature], val castItem: GameObject[Item],
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class ECreatureSpawn(val creature: GameObject[Creature]) extends GameEvent
		case class ECreatureDamaged(val creature: GameObject[Creature], val damager: GameObject[Creature]) extends GameEvent
		case class ECreatureHB(val creature: GameObject[Creature]) extends GameEvent
		case class ECreatureAttacked(val creature: GameObject[Creature], val attacker: GameObject[Creature],
			val attackMode: CombatMode, val attackType: SpecialAttack) extends GameEvent
		case class ECreatureConversation(val creature: GameObject[Creature], val speaker: GameObject[_]) extends GameEvent
		case class ECreatureDeath(val creature: GameObject[Creature], val killer: GameObject[Creature]) extends GameEvent
		case class ECreatureDisturbed(val creature: GameObject[Creature], val disturber: GameObject[Creature]) extends GameEvent
		case class ECreatureEndOfRound(val creature: GameObject[Creature]) extends GameEvent
		case class ECreatureHears(val creature: GameObject[Creature], val who: GameObject[Creature]) extends GameEvent
		case class ECreatureSees(val creature: GameObject[Creature], val who: GameObject[Creature]) extends GameEvent
		case class ECreatureNoLongerHears(val creature: GameObject[Creature], val who: GameObject[Creature]) extends GameEvent
		case class ECreatureNoLongerSees(val creature: GameObject[Creature], val who: GameObject[Creature]) extends GameEvent

		case class ECreatureRest(val creature: GameObject[Creature]) extends GameEvent
		case class ECreatureSpellCastAt(val creature: GameObject[Creature], val caster: GameObject[Creature], val castItem: GameObject[Item],
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class EAreaEnter(val area: GameObject[Area], val creature: GameObject[Creature]) extends GameEvent
		case class EAreaLeave(val area: GameObject[Area], val creature: GameObject[Creature]) extends GameEvent
		case class ETransitionClick(val transition: GameObject[_], val creature: GameObject[Creature], val target: GameObject[_]) extends GameEvent /* todo: transition/target = Trigger or Door, but cannot abstract */

		case class EDoorClick(val door: GameObject[Door], val clicker: GameObject[Creature]) extends GameEvent
		case class EDoorLock(val door: GameObject[Door], val locker: GameObject[Creature]) extends GameEvent
		case class EDoorUnlock(val door: GameObject[Door], val unlocker: GameObject[Creature]) extends GameEvent
		case class EDoorOpen(val door: GameObject[Door], val opener: GameObject[Creature]) extends GameEvent
		case class EDoorClosed(val door: GameObject[Door], val closer: GameObject[Creature]) extends GameEvent
		case class EDoorAttacked(val door: GameObject[Door], val attacker: GameObject[Creature]) extends GameEvent
		case class EDoorDamaged(val door: GameObject[Door], val damager: GameObject[_]) extends GameEvent
		case class EDoorDeath(val door: GameObject[Door], val killer: GameObject[_]) extends GameEvent
		case class EDoorFailToOpen(val door: GameObject[Door], val blocked: GameObject[Creature]) extends GameEvent
		case class EDoorSpellCastAt(val door: GameObject[Door], val caster: GameObject[Creature], val castItem: GameObject[Item],
			val spell: Int, val metaMagic: MetaMagic, val harmful: Boolean) extends GameEvent

		case class EPlayerEnter(val player: GameObject[Player]) extends GameEvent
		case class EPlayerLeave(val player: GameObject[Player]) extends GameEvent
		case class EPlayerDying(val player: GameObject[Player]) extends GameEvent
		case class EPlayerDeath(val player: GameObject[Player]) extends GameEvent
		case class EPlayerRest(val player: GameObject[Player]) extends GameEvent
		case class EPlayerLevelUp(val player: GameObject[Player]) extends GameEvent
		case class EPlayerRespawn(val player: GameObject[Player]) extends GameEvent
		case class EPlayerCutsceneAbort(val player: GameObject[Player]) extends GameEvent

		case class ETrapTriggered(val trap: GameObject[_]) extends GameEvent
		case class ETrapDisarmed(val trap: GameObject[_], val disarmer: GameObject[Creature]) extends GameEvent

		case class ESaveCharacter(val player: GameObject[Player]) extends GameEvent
		// case class ECreaturePickpocket(val creature: GameObject[Creature], val target: GameObject[Creature]) extends GameEvent
		case class ECreatureAttack(val creature: GameObject[Creature], val target: GameObject[_]) extends GameEvent
		case class EItemFreeActivate(val creature: GameObject[Creature], val item: GameObject[Item], val target: GameObject[_], val targetLocation: Location) extends GameEvent
		case class ECreatureQuickChat(creature: GameObject[Creature], chat: Int) extends GameEvent
		case class EObjectExamine(val examiner: GameObject[Creature], val target: GameObject[_]) extends GameEvent
		case class ECreatureUseSkill(val creature: GameObject[Creature], val skill: Int, val target: GameObject[_], val targetLocation: Location) extends GameEvent
		case class ECreatureUseFeat(val creature: GameObject[Creature], val feat: Int, val target: GameObject[_], val targetLocation: Location) extends GameEvent
		case class ECreatureToggleMode(val creature: GameObject[Creature], val mode: ActionMode) extends GameEvent
		case class ECreatureCastSpell(val caster: GameObject[Creature], val spell: Int, val target: GameObject[_], val targetLocation: Location) extends GameEvent
		case class ETogglePause(player: GameObject[Player]) extends GameEvent
		case class ECreaturePossessFamiliar(creature: GameObject[Creature]) extends GameEvent

		case class EChatTalk(val speaker: GameObject[_], val text: String) extends GameEvent
		case class EChatShout(val speaker: GameObject[_], val text: String) extends GameEvent
		case class EChatWhisper(val speaker: GameObject[_], val text: String) extends GameEvent
		case class EChatPrivate(val speaker: GameObject[_], val to: GameObject[_], val text: String) extends GameEvent
		case class EChatServer(val speaker: GameObject[_], val text: String) extends GameEvent
		case class EChatParty(val speaker: GameObject[_], val text: String) extends GameEvent
		case class EChatSilentShout(val speaker: GameObject[_], val text: String) extends GameEvent
		case class EChatDM(val speaker: GameObject[_], val text: String) extends GameEvent
	}

	object CoreEvents extends Plugin {
		import scala.concurrent.ops.future
		import events._

		private val factories = List(AOE, Area, NonPlayer, Player, Door, Encounter, Item, Placeable, Store, Trigger, Waypoint)

		def invalidateFactories = future(
			factories.foreach((f) => f.getCache.foreach((k) => k._2.clearCachedPropertiesByPolicy(cachedproperty.CachePolicy.Event)))
		)

		private var lastInvalidateRun: () => Unit = future()

		private val actions: mutable.Map[Class[_], mutable.Set[(Option[GameObject[_]], (Event) => Unit)]] = mutable.Map()

		// Register action to be ran with on as self when eventName on on happens. Hah, parse that.
		def once[T <: GameEvent](on: Class[T], self: Option[GameObject[_]], action: (Event) => Unit) {
			if (!actions.contains(on))
				actions(on) = mutable.Set()
			val v = (self, action)
			actions(on) += v
		}


		def listen(e: Event) = {
			// wait for last future
			lastInvalidateRun()

			e match {
				case r: RawEvent => {
					val e: Event = (r.event match {
						case "module_hb"       => EventSource send new EModuleHB()
						case "module_load"     => EventSource send new EModuleLoad()

						case "transition_click" => EventSource send new ETransitionClick(
							GameObject(r.self), R.proxy.getClickingObject,
							GameObject(R.proxy.getTransitionTarget(r.self)))
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


						case "player_enter" => {
							val player = R.proxy.getEnteringObject
							nwnx.Chat.pcIn(player.asInstanceOf[Player])
							EventSource send new EPlayerEnter(player.asInstanceOf[GameObject[Player]])
						}
						case "player_leave" => {
							val player = GameObject(R.proxy.getExitingObject)
							nwnx.Chat.pcOut(player.asInstanceOf[Player])
							EventSource send new EPlayerLeave(player.asInstanceOf[GameObject[Player]])
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

						case "trap_disarm" => EventSource send new ETrapDisarmed(GameObject(r.self), R.proxy.getLastDisarmed)
						case "trap_triggered" => EventSource send new ETrapTriggered(GameObject(r.self))

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
								case 3 => EventSource send new ECreatureAttack(r.self, GameObject(nwnxTarget))
								case 4 => EventSource send new EItemFreeActivate(r.self, nwnxItem, GameObject(nwnxTarget), nwnxLocation)
								case 5 => EventSource send new ECreatureQuickChat(r.self, nwnxSubType)
								case 6 => EventSource send new EObjectExamine(r.self, GameObject(nwnxTarget))
								case 7 => EventSource send new ECreatureUseSkill(r.self, nwnxSubType, GameObject(nwnxTarget), nwnxLocation)
								case 8 => EventSource send new ECreatureUseFeat(r.self, nwnxSubType, GameObject(nwnxTarget), nwnxLocation)
								case 9 => EventSource send new ECreatureToggleMode(r.self, ActionMode.convert(nwnxSubType))
								case 10 => EventSource send new ECreatureCastSpell(r.self, nwnxSubType, GameObject(nwnxTarget), nwnxLocation)
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
									case  1 => EventSource send new EChatTalk(GameObject(r.self), text)
									case  2 => EventSource send new EChatShout(GameObject(r.self), text)
									case  3 => EventSource send new EChatWhisper(GameObject(r.self), text)
									case  4 => EventSource send new EChatPrivate(GameObject(r.self), to, text)
									case  5 => EventSource send new EChatServer(GameObject(r.self), text)
									case  6 => EventSource send new EChatParty(GameObject(r.self), text)
									case 13 => EventSource send new EChatSilentShout(GameObject(r.self), text)
									case 14 => EventSource send new EChatDM(GameObject(r.self), text)
								}
							}
						}


						case _ => log.warning("Unhandled event received: " + r.event) ; r
					})

					// todo: indirect invocations
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
					if (e.suppressed)
						r.suppress

				}
				case _ =>
			}

			lastInvalidateRun = invalidateFactories
		}
	}
}
