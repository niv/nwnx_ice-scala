package es.elv.kobold {
	import NWN._
	import Implicits._

	object Store
	class Store private[kobold] (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType(ObjectType.Store)
	}
}
