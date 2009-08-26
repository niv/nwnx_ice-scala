package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Placeable extends WrappedFactory[NWObject, Placeable]((wrapped) => new Placeable(wrapped))
	class Placeable private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Placeable](wrapped, Some(Placeable)) with GameObject[Placeable]
			with Position with Effects with Lock with Trap {
		ensureObjectType(ObjectType.Placeable)
	}
}
