package es.elv.kobold {
	import NWN._
	import Implicits._

	object NonPlayer

	class NonPlayer (wrapped: NWObject) extends Creature(wrapped) {
		val plot = P(() => R.proxy.getPlotFlag(this), (v: Boolean) => R.proxy.setPlotFlag(this, v))

		val aiLevel = P(() => R.proxy.getAILevel(this), (level: AILevel) => R.proxy.setAILevel(this, level))
	}

	abstract class NonPlayerWithMaster (wrapped: NWObject) extends NonPlayer(wrapped) {
		val master = P(() => R.proxy.getMaster(this))
	}

	class Familiar (wrapped: NWObject) extends NonPlayerWithMaster(wrapped)
	class AnimalCompanion (wrapped: NWObject) extends NonPlayerWithMaster(wrapped)
	class Henchman (wrapped: NWObject) extends NonPlayerWithMaster(wrapped)
	class Summon   (wrapped: NWObject) extends NonPlayerWithMaster(wrapped)
}
