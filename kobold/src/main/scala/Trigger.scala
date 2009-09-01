package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Trigger

	class Trigger private[kobold] (wrapped: NWObject) extends G(wrapped)
				with Lock with Trap with Position {
		ensureObjectType(ObjectType.Trigger)
	}
}
