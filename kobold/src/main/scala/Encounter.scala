package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Encounter extends WrappedFactory[NWObject, Encounter]((wrapped) => new Encounter(wrapped))
	class Encounter private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Encounter](wrapped, Some(Encounter)) with G[Encounter] {
		ensureObjectType(ObjectType.Encounter)
	}
}
