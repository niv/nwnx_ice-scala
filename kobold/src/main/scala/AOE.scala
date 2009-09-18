package es.elv.kobold
import NWN._
import Implicits._

class AOE (wrapped: NWObject) extends G(wrapped) {
	ensureObjectType(ObjectType.AOE)
}
