package es.elv.kobold {
	import NWN._
	import Implicits._

	object Door
	class Door (wrapped: NWObject) extends G(wrapped)
			with VisualEffects with Lock with Trap {
		ensureObjectType(ObjectType.Door)
	}
}
