package es.elv.kobold
import NWN._
import Implicits._

object Trigger

class Trigger (wrapped: NWObject) extends G(wrapped)
			with Lock with Trap with Position {
	ensureObjectType(ObjectType.Trigger)
}
