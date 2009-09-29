package es.elv.kobold.ext

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._

/**
	This plugin keeps track of Creature idle and standing-still times.
	For normal NPCs, this is done on their heartbeat, and for players,
	every (configured) milliseconds, or each tick, whichever is smaller.
*/
object IdleState extends Plugin {

	private def playerCreatureInterval = config.getLong("playerCreatureInterval")

	private val lastActivityAt: collection.mutable.Map[Creature, Long] =
		collection.mutable.Map()
	
	private val lastMovementAt: collection.mutable.Map[Creature, Long] =
		collection.mutable.Map()

	/**
		Returns the number of milliseconds the given Creature is idle,
		or 0 if no idle time has been recorded.
	*/
	def idleFor(o: Creature): Long = if (lastActivityAt.contains(o))
		(System.currentTimeMillis - lastActivityAt(o)) else 0

	/**
		Returns the number of milliseconds the given Creature was immobile
		at it's current location, or 0 if no time has yet been recorded.
	*/
	def immobileFor(o: Creature): Long = if (lastMovementAt.contains(o))
		(System.currentTimeMillis - lastMovementAt(o)) else 0

	/**
		Resets the idle time for the given Creature.
	*/
	def resetIdle(o: Creature) =
		lastActivityAt(o) = System.currentTimeMillis
	
	/**
		Resets the standing-still time for the given Creature.
	*/
	def resetMovement(o: Creature) = {
		o.llo("idleStateLastLoc") = o.location()
		lastMovementAt(o) = System.currentTimeMillis
	}

	private def checkHB(p: Creature) {
		if (p.location() != p.llo("idleStateLastLoc"))
			resetMovement(p)
		else if (p.busy) resetIdle(p)
	}

	Schedule every (playerCreatureInterval, {
		for (p <- PlayerCreature.all()) checkHB(p)
	})

	def listen(event: Event) = event match {
		case OnInvalidated(g: Creature) => {
			lastActivityAt -= g
			lastMovementAt -= g
		}

		case OnChatTalk(self: Creature, _) => resetIdle(self)
		case OnChatWhisper(self: Creature, _) => resetIdle(self)
		case OnChatShout(self: Creature, _) => resetIdle(self)
		case OnChatParty(self: Creature, _) => resetIdle(self)
		case OnChatPrivate(self: Creature, _, _) => resetIdle(self)

		case OnCreatureHB(o: Creature) => checkHB(o)

		case _ =>
	}

}
