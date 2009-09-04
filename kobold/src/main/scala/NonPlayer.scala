package es.elv.kobold {
	import NWN._
	import Implicits._

	object NonPlayer

	class NonPlayer private[kobold] (wrapped: NWObject) extends Creature(wrapped) {
		val plot = P(() => R.proxy.getPlotFlag(this), (v: Boolean) => R.proxy.setPlotFlag(this, v))

		val aiLevel = P(() => R.proxy.getAILevel(this), (level: AILevel) => R.proxy.setAILevel(this, level))
	}
}
