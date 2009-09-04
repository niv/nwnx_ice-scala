package es.elv.kobold {
	import NWN._
	import Implicits._

	class AOE private[kobold] (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType(ObjectType.AOE)
	}
}
