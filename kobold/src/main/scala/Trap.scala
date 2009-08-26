package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	class TrapTrigger private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Trap](wrapped, None)
			with G[Trap] with Trap {
		import cachedproperty.CachePolicy._

		override def toStringProperties = super.toStringProperties
	}
}
