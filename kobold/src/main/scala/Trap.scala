package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	class Trap private[kobold] (wrapped: NWObject) extends Wrapped[NWObject, Trap](wrapped, None)
			with GameObject[Trap] with HasTrap {
		import cachedproperty.CachePolicy._

		override def toStringProperties = super.toStringProperties
	}
}
