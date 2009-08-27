package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object AOE extends WrappedFactory[NWObject, AOE]((wrapped) => new AOE(wrapped))
	class AOE private[kobold] (wrapped: NWObject) extends G[AOE](wrapped, Some(AOE)) {
		ensureObjectType(ObjectType.AOE)
	}
}
