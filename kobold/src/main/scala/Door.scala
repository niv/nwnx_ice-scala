package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Door extends WrappedFactory[NWObject, Door]((wrapped) => new Door(wrapped))
	class Door private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Door](wrapped, Some(Door)) with GameObject[Door]
			with VisualEffects with Lock with Trap {
		ensureObjectType(ObjectType.Door)
	}
}
