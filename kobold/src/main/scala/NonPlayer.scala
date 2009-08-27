package es.elv.kobold {
	import NWN._
	import Implicits._

	object NonPlayer extends WrappedFactory[NWObject, NonPlayer]((wrapped) => new NonPlayer(wrapped))

	class NonPlayer private[kobold] (wrapped: NWObject) extends G[NonPlayer](wrapped, Some(NonPlayer))
			with Creature {
		ensureObjectType(ObjectType.Creature)
		
		val plot = P(() => R.proxy.getPlotFlag(this), (v: Boolean) => R.proxy.setPlotFlag(this, v))

		val aiLevel = P(() => R.proxy.getAILevel(this), (level: AILevel) => R.proxy.setAILevel(this, level))

		// def bodyPart(part: BodyPart) = R.proxy.getNonPlayerBodyPart(
	}
}
