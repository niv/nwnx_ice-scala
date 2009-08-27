package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Waypoint extends WrappedFactory[NWObject, Waypoint]((wrapped) => new Waypoint(wrapped))
	class Waypoint private[kobold] (wrapped: NWObject) extends G[Waypoint](wrapped, Some(Waypoint)) {
		ensureObjectType(ObjectType.Waypoint)
	}
}
