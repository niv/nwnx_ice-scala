package es.elv.kobold {
	import NWN._
	import Implicits._

	object Invalid {
		class InvalidInstance extends Invalid(new NWObject(0x7f000000)) {
			override def toStringProperties = List()
		}
		lazy private val instance = new InvalidInstance
		def apply() = instance
	}

	class Invalid (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType()

		override val cacheClassInstances = false
	}
}
