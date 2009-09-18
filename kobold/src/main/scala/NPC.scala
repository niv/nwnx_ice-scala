package es.elv.kobold
import NWN._
import Implicits._

object NPC

class NPC (wrapped: NWObject) extends Creature(wrapped) {
	val plot = P(() => R.proxy.getPlotFlag(this), (v: Boolean) => R.proxy.setPlotFlag(this, v))

	val aiLevel = P(() => R.proxy.getAILevel(this), (level: AILevel) => R.proxy.setAILevel(this, level))
	
	val master = P(() => R.proxy.getMaster(this))
}

class Familiar (wrapped: NWObject) extends NPC(wrapped)
class AnimalCompanion (wrapped: NWObject) extends NPC(wrapped)
class Henchman (wrapped: NWObject) extends NPC(wrapped)
class Summon   (wrapped: NWObject) extends NPC(wrapped)
