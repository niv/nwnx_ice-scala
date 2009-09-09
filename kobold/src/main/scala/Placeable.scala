package es.elv.kobold {
	import NWN._
	import Implicits._

	object Placeable extends GFactory[Placeable](ObjectType.Placeable)

	class Placeable (wrapped: NWObject) extends G(wrapped)
			with Position with Effects with Lock with Trap {
		ensureObjectType(ObjectType.Placeable)
	}
}
