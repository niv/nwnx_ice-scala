package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

object SurfaceType {
	val Invalid        = -1

	val Dirt           = 1
	val Obscuring      = 2
	val Grass          = 3
	val Stone          = 4
	val Wood           = 5
	val Water          = 6
	val NoWalk         = 7
	val Transparent    = 8
	val Carpet         = 9
	val Metal          = 10
	val Puddles        = 11
	val Swamp          = 12
	val Mud            = 13
	val Leaves         = 14
	val Lava           = 15
	val BottomlessPit  = 16
	val DeepWater      = 17
	val Door           = 18
	val Snow           = 19
	val Sand           = 20
	val BareBones      = 21
	val StoneBridge    = 22
	val Trigger        = 30
}

object ScriptHandler {
	object Creature {
		val Heartbeat       = 0
		val Perception      = 1
		val SpellcastAt     = 2
		val Attacked        = 3
		val Damaged         = 4
		val Disturbed       = 5
		val CombatRoundEnd  = 6
		val Conversation    = 7
		val Spawn           = 8
		val Rested          = 9
		val Death           = 10
		val UserDefined     = 11
		val Blocked         = 12
	}
	object Placeable {
		val Close          = 0
		val Damage         = 1
		val Death          = 2
		val Heartbeat      = 4
		val Disturbed      = 5
		val Lock           = 6
		val Attacked       = 7
		val Open           = 8
		val SpellcastAt    = 9
		val Unlock         = 11
		val Used           = 12
		val UserDefined    = 13
		val Click          = 15
	}
	object Module {
		val Heartbeat        = 0
		val UserDefined      = 1
		val Load             = 2
		val ClientEnter      = 4
		val ClientLeave      = 5
		val ActivateItem     = 6
		val AcqurateItem     = 7
		val UnacqurateItem   = 8
		val PlayerDeath      = 9
		val PlayerDying      = 10
		val PlayerRespawn    = 11
		val PlayerRest       = 12
		val PlayerLevelup    = 13
		val CursceneAbort    = 14
		val EquipItem        = 15
		val UnequipItem      = 16
		val PlayerChat       = 17
	}
	object Area {
		val Heartbeat           = 0
		val UserDefined         = 1
		val Enter               = 2
		val Exit                = 3
	}
	object Door {
		val Open                = 0
		val Close               = 1
		val Damaged             = 2
		val Death               = 3
		val Heartbeat           = 5
		val Locked              = 6
		val Attacked            = 7
		val SpelcastAt          = 8
		val Unlocked            = 10
		val UserDefined         = 11
		val TransitionClick     = 12
		val FailToOpen          = 14
	}
	object Store {
		val Open               = 0
		val Close              = 1
	}
	object Trigger {
		val Heartbeat       = 0
		val Enter           = 1
		val Exit            = 2
		val UserDefined     = 3
		val TransitionClick = 6
	}
	object Encounter {
		val Enter          = 0
		val Exit           = 1
		val Heartbeat      = 2
		val Exhausted      = 3
		val UserDefined    = 4
	}
}

package nwnx {

object FuncsExt extends Core("FUNCSEXT") {
	import scala.collection._

	/** Returns the SurfaceType at the given location.
		Will fail with return value Invalid/-1 for invalid locations. */
	def getSurfaceAt(where: Location) =
		setGet(where.area, "GETSURFACE", vectorToString(where.position)).toInt

	def getHandler(o: G, handler: Int) =
		setGet(o, "GETSCRIPT", handler.toString + " " * 12)

	def setHandler(o :G, handler: Int, script: String) =
		set(o, "SETSCRIPT", handler.toString + ":" + script + " " * 12)
}

}
