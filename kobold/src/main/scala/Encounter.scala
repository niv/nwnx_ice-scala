package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Encounter
	class Encounter private[kobold] (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType(ObjectType.Encounter)
	}
}
