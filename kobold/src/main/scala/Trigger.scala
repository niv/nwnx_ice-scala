package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Trigger extends WrappedFactory[NWObject, Trigger]((wrapped) => new Trigger(wrapped))

	class Trigger private[kobold] (wrapped: NWObject) extends G[Trigger](wrapped, Some(Trigger))
				with Lock with Trap with Position {
		ensureObjectType(ObjectType.Trigger)
	}
}
