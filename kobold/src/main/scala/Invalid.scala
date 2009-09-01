package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Invalid {
		class InvalidInstance extends G(new NWObject(0x7f000000)) {
			override def toStringProperties = List()
		}
		lazy private val instance = new InvalidInstance
		def apply() = instance
	}

	class Invalid private[kobold] (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType()
	}
}
