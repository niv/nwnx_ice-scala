package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Invalid extends WrappedFactory[NWObject, Invalid]((wrapped) => new Invalid(wrapped)) {
		class InvalidInstance extends Wrapped[NWObject, InvalidInstance](new NWObject(0x7f000000), None)
			with GameObject[InvalidInstance] {
			override def toStringProperties = List()
		}
		private val instance = new InvalidInstance
		def apply() = instance
	}

	class Invalid private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Invalid](wrapped, Some(Invalid)) with GameObject[Invalid] {
		ensureObjectType()
	}
}
