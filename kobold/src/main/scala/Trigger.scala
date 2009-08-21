package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Trigger extends WrappedFactory[NWObject, Trigger]((wrapped) => new Trigger(wrapped))

	class Trigger private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Trigger](wrapped, Some(Trigger)) with GameObject[Trigger]
				with HasLock with HasTrap with HasLocation {
		ensureObjectType(ObjectType.Trigger)
	}
}
