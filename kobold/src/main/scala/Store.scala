package es.elv.kobold {
	import NWN._
	import Implicits._

	object Store extends GFactory[Store](ObjectType.Store)

	class Store (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType(ObjectType.Store)
	}
}
