package es.elv.kobold {
	import NWN._
	import Implicits._

	object Item

	class Item (wrapped: NWObject) extends G(wrapped)
			with Position with Inventory {
		ensureObjectType(ObjectType.Item)

		lazy val baseType = R.proxy.getBaseItemType(this)

		val plot = P(() => R.proxy.getPlotFlag(this), (v: Boolean) => R.proxy.setPlotFlag(this, v))

		val identified = P(() => R.proxy.getIdentified(this), (is: Boolean) => R.proxy.setIdentified(this, is))
		val stolen = P(() => R.proxy.getStolenFlag(this), (is: Boolean) => R.proxy.setStolenFlag(this, is))

		val possessor = P(() => G(R.proxy.getItemPossessor(this)))

		val goldValue = P(() => R.proxy.getGoldPieceValue(this))

		def properties: List[ItemProperty] =
			R.proxy.allItemProperties(this).toList.map(ItemProperty(_))

		// Apply a temporary itemProperty to this object.
		def <+(e: ItemProperty, duration: Double) = addPropertyIntelligently(e, duration)

		// Apply a permanent itemProperty to this object.
		def <*(e: ItemProperty) = addPropertyIntelligently(e, 0)

		def addPropertyIntelligently(p: ItemProperty, duration: Double) = {
			val durationType = if (duration > 0) DurationType.Temporary else DurationType.Permanent
			val matching = properties.filter(v => v.durationType == durationType &&
					v.iprpType == p.iprpType && v.subType == p.subType)

			matching.foreach(this removeProperty _)

			addProperty(p, duration)
		}

		def addProperty(p: ItemProperty, duration: Double) =
			R.proxy.addItemProperty(if (duration > 0) DurationType.Temporary else DurationType.Permanent, p, this, duration)
		def removeProperty(p: ItemProperty) = R.proxy.removeItemProperty(this, p)

		def weight = R.proxy.getWeight(this)

		def copy(toInventory: G): G =
			G(R.proxy.copyItem(this, toInventory, true))
	}
}
