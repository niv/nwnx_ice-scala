package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Store extends WrappedFactory[NWObject, Store]((wrapped) => new Store(wrapped))
	class Store private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Store](wrapped, Some(Store)) with G[Store] {
		ensureObjectType(ObjectType.Store)
	}
}
