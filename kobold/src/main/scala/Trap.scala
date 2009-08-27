package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	class TrapTrigger private[kobold] (wrapped: NWObject) extends G[Trap](wrapped, None)
			with Trap {
		import cachedproperty.CachePolicy._

		override def toStringProperties = super.toStringProperties
	}
}
