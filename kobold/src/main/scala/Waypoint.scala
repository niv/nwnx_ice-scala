package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Waypoint extends WrappedFactory[NWObject, Waypoint]((wrapped) => new Waypoint(wrapped))
	class Waypoint private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Waypoint](wrapped, Some(Waypoint)) with G[Waypoint] {
		ensureObjectType(ObjectType.Waypoint)
	}
}
