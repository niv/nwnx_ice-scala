package es.elv.kobold {
	import NWN._
	import Implicits._

	class TrapTrigger (wrapped: NWObject) extends G(wrapped)
			with Trap {
		import cachedproperty.CachePolicy._

		override def toStringProperties = super.toStringProperties
	}
}
