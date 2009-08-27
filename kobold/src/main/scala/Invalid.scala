package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Invalid extends WrappedFactory[NWObject, Invalid]((wrapped) => new Invalid(wrapped)) {
		class InvalidInstance extends G[InvalidInstance](new NWObject(0x7f000000), None) {
			override def toStringProperties = List()
		}
		lazy private val instance = new InvalidInstance
		def apply() = instance
	}

	class Invalid private[kobold] (wrapped: NWObject) extends G[Invalid](wrapped, Some(Invalid)) {
		ensureObjectType()
	}
}
