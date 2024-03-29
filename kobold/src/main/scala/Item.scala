package es.elv.kobold
import NWN._
import Implicits._

trait Equippable {
	this: Item =>
}

abstract class GItemFactory[K <: G] extends GFactory[K](ObjectType.Item) {
	protected def create(resref: String, on: G, newTag: String, stacksize: Int) =
		G[G](R.proxy.createItemOnObject(resref, on, stacksize, newTag))

	def apply(resref: String, on: G, newTag: String, stacksize: Int) =
		create(resref, on, newTag, stacksize)
}

abstract class GRefItemFactory[K <: G](val resref: String)
		extends GItemFactory[K] {

	def apply(on: G): G =
		apply(on, "", 1)
	def apply(on: G, stacksize: Int): G =
		apply(on, "", stacksize)
	def apply(on: G, newTag: String): G =
		apply(on, newTag, 1)
	def apply(on: G, newTag: String, stacksize: Int): G =
		create(resref, on, newTag, stacksize)
}

abstract class GRefTagItemFactory[K <: G](resref: String, val tag: String)
		extends GRefItemFactory[K](resref) {

	override def create(resref: String, on: G, newTag: String, stacksize: Int) =
		super.create(resref, on, tag, stacksize)
}


object Item extends GItemFactory[Item]

abstract class Item (wrapped: NWObject) extends G(wrapped)
		with Position {
	ensureObjectType(ObjectType.Item)

	val baseType = P(() => R.proxy.getBaseItemType(this))

	val plot = P(() => R.proxy.getPlotFlag(this), (v: Boolean) => R.proxy.setPlotFlag(this, v))

	val identified = P(() => R.proxy.getIdentified(this), (is: Boolean) => R.proxy.setIdentified(this, is))
	val stolen = P(() => R.proxy.getStolenFlag(this), (is: Boolean) => R.proxy.setStolenFlag(this, is))

	val possessor = P(() => G[G](R.proxy.getItemPossessor(this)))

	val goldValue = P(() => R.proxy.getGoldPieceValue(this))

	def properties: List[ItemProperty] =
		R.proxy.allItemProperties(this).toList.map(ItemProperty(_))

	// Apply a temporary itemProperty to this object.
	def <+(e: ItemProperty, duration: Float) = addPropertyIntelligently(e, duration)

	// Apply a permanent itemProperty to this object.
	def <*(e: ItemProperty) = addPropertyIntelligently(e, 0)

	def addPropertyIntelligently(p: ItemProperty, duration: Float) = {
		val durationType = if (duration > 0) DurationType.Temporary else DurationType.Permanent
		val matching = properties.filter(v => v.durationType == durationType &&
				v.iprpType == p.iprpType && v.subType == p.subType)

		matching.foreach(this removeProperty _)

		addProperty(p, duration)
	}

	def addProperty(p: ItemProperty, duration: Float) =
		R.proxy.addItemProperty(if (duration > 0) DurationType.Temporary else DurationType.Permanent, p, this, duration)
	def removeProperty(p: ItemProperty) = R.proxy.removeItemProperty(this, p)

	def weight = R.proxy.getWeight(this)

	def copy(toInventory: G): G =
		G(R.proxy.copyItem(this, toInventory, true))
}

abstract class Weapon(wrapped: NWObject) extends Item(wrapped) with Equippable

class MeleeWeapon(wrapped: NWObject) extends Weapon(wrapped)
class RangedWeapon(wrapped: NWObject) extends Weapon(wrapped)
class Shield(wrapped: NWObject) extends Item(wrapped) with Equippable
class Armor(wrapped: NWObject) extends Item(wrapped) with Equippable
class Helmet(wrapped: NWObject) extends Item(wrapped) with Equippable
class Ammunition(wrapped: NWObject) extends Item(wrapped) with Equippable
class ThrownWeapon(wrapped: NWObject) extends Weapon(wrapped)
class Stave(wrapped: NWObject) extends Weapon(wrapped)
class Potion(wrapped: NWObject) extends Weapon(wrapped)
class Scroll(wrapped: NWObject) extends Weapon(wrapped)
class ThievesTools(wrapped: NWObject) extends Weapon(wrapped)
class MiscItem(wrapped: NWObject) extends Weapon(wrapped)
class Wand(wrapped: NWObject) extends Weapon(wrapped)
class Rod(wrapped: NWObject) extends Weapon(wrapped)
class TrapItem(wrapped: NWObject) extends Weapon(wrapped)
class MiscUnequippableItem(wrapped: NWObject) extends Weapon(wrapped)
// class Container(wrapped: NWObject) extends Weapon(wrapped)
class HealersKit(wrapped: NWObject) extends Weapon(wrapped)

class UnclassifiedItem(wrapped: NWObject) extends Item(wrapped)
