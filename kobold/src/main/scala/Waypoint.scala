package es.elv.kobold {
	import NWN._
	import Implicits._

	object Waypoint
	class Waypoint (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType(ObjectType.Waypoint)
	}
}
