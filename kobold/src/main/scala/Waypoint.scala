package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Waypoint
	class Waypoint private[kobold] (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType(ObjectType.Waypoint)
	}
}
