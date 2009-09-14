package es.elv.kobold {
	import NWN._
	import Implicits._

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
			with Position with Inventory {
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

	class UnclassifiedItem(wrapped: NWObject) extends Item(wrapped)


	class CreatureBludgeonWeapon(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CreatureBludgeonWeapon, "baseItem == CreatureBludgeonWeapon") }
	class CreaturePierceWeapon(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CreaturePierceWeapon, "baseItem == CreaturePierceWeapon") }
	class CreatureItem(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CreatureItem, "baseItem == CreatureItem") }
	class CreatureSlashWeapon(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CreatureSlashWeapon, "baseItem == CreatureSlashWeapon") }
	class CreatureSlashPierceWeapon(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CreatureSlashPierceWeapon, "baseItem == CreatureSlashPierceWeapon") }

	class Amulet(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Amulet, "baseItem == Amulet") }
	class Armor(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Armor, "baseItem == Armor") }
	class Arrow(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Arrow, "baseItem == Arrow") }
	class BastardSword(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.BastardSword, "baseItem == BastardSword") }
	class Battleaxe(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Battleaxe, "baseItem == Battleaxe") }
	class Belt(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Belt, "baseItem == Belt") }
	class BlankMagicWand(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.BlankMagicWand, "baseItem == BlankMagicWand") }
	class BlankScroll(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.BlankScroll, "baseItem == BlankScroll") }
	class Bolt(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Bolt, "baseItem == Bolt") }
	class Book(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Book, "baseItem == Book") }
	class Boots(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Boots, "baseItem == Boots") }
	class Bracer(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Bracer, "baseItem == Bracer") }
	class Bullet(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Bullet, "baseItem == Bullet") }
	class Cloak(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Cloak, "baseItem == Cloak") }
	class Club(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Club, "baseItem == Club") }
	class CraftBase(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CraftBase, "baseItem == CraftBase") }
	class CraftCompBase(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CraftCompBase, "baseItem == CraftCompBase") }
	class CraftCompSmall(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CraftCompSmall, "baseItem == CraftCompSmall") }
	class CraftedMagicWand(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CraftedMagicWand, "baseItem == CraftedMagicWand") }
	class CraftedPotion(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CraftedPotion, "baseItem == CraftedPotion") }
	class CraftedScroll(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.CraftedScroll, "baseItem == CraftedScroll") }
	class Dagger(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Dagger, "baseItem == Dagger") }
	class Dart(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Dart, "baseItem == Dart") }
	class DireMace(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.DireMace, "baseItem == DireMace") }
	class DoubleAxe(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.DoubleAxe, "baseItem == DoubleAxe") }
	class DwarvenWaraxe(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.DwarvenWaraxe, "baseItem == DwarvenWaraxe") }
	class EmptyPotion(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.EmptyPotion, "baseItem == EmptyPotion") }
	class Encampment(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Encampment, "baseItem == Encampment") }
	class Gem(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Gem, "baseItem == Gem") }
	class Gloves(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Gloves, "baseItem == Gloves") }
	class Gold(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Gold, "baseItem == Gold") }
	class Greataxe(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Greataxe, "baseItem == Greataxe") }
	class GreatSword(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.GreatSword, "baseItem == GreatSword") }
	class Grenade(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Grenade, "baseItem == Grenade") }
	class Halberd(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Halberd, "baseItem == Halberd") }
	class Handaxe(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Handaxe, "baseItem == Handaxe") }
	class HealersKit(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.HealersKit, "baseItem == HealersKit") }
	class HeavyCrossbow(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.HeavyCrossbow, "baseItem == HeavyCrossbow") }
	class HeavyFlail(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.HeavyFlail, "baseItem == HeavyFlail") }
	class Helmet(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Helmet, "baseItem == Helmet") }
	class Kama(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Kama, "baseItem == Kama") }
	class Katana(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Katana, "baseItem == Katana") }
	class Key(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Key, "baseItem == Key") }
	class Kukri(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Kukri, "baseItem == Kukri") }
	class Lance(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Lance, "baseItem == Lance") }
	class LargeBox(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.LargeBox, "baseItem == LargeBox") }
	class LargeShield(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.LargeShield, "baseItem == LargeShield") }
	class LightCrossbow(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.LightCrossbow, "baseItem == LightCrossbow") }
	class LightFlail(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.LightFlail, "baseItem == LightFlail") }
	class LightHammer(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.LightHammer, "baseItem == LightHammer") }
	class LightMace(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.LightMace, "baseItem == LightMace") }
	class Longbow(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Longbow, "baseItem == Longbow") }
	class Longsword(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Longsword, "baseItem == Longsword") }
	class MagicRod(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MagicRod, "baseItem == MagicRod") }
	class MagicStaff(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MagicStaff, "baseItem == MagicStaff") }
	class MagicWand(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MagicWand, "baseItem == MagicWand") }
	class MiscLarge(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MiscLarge, "baseItem == MiscLarge") }
	class MiscMedium(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MiscMedium, "baseItem == MiscMedium") }
	class MiscSmall(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MiscSmall, "baseItem == MiscSmall") }
	class MiscThin(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MiscThin, "baseItem == MiscThin") }
	class MoonOnAStick(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.MoonOnAStick, "baseItem == MoonOnAStick") }
	class Morningstar(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Morningstar, "baseItem == Morningstar") }
	class Potion(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Potion, "baseItem == Potion") }
	class Quarterstaff(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Quarterstaff, "baseItem == Quarterstaff") }
	class Rapier(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Rapier, "baseItem == Rapier") }
	class Ring(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Ring, "baseItem == Ring") }
	class Scimitar(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Scimitar, "baseItem == Scimitar") }
	class Scythe(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Scythe, "baseItem == Scythe") }
	class Shortbow(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Shortbow, "baseItem == Shortbow") }
	class ShortSpear(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.ShortSpear, "baseItem == ShortSpear") }
	class ShortSword(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.ShortSword, "baseItem == ShortSword") }
	class Shuriken(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Shuriken, "baseItem == Shuriken") }
	class Sickle(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Sickle, "baseItem == Sickle") }
	class Sling(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Sling, "baseItem == Sling") }
	class SmallShield(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.SmallShield, "baseItem == SmallShield") }
	class SpellScroll(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.SpellScroll, "baseItem == SpellScroll") }
	class ThievesTools(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.ThievesTools, "baseItem == ThievesTools") }
	class ThrowingAxe(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.ThrowingAxe, "baseItem == ThrowingAxe") }
	class Torch(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Torch, "baseItem == Torch") }
	class TowerShield(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.TowerShield, "baseItem == TowerShield") }
	class TrapKit(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.TrapKit, "baseItem == TrapKit") }
	class Trident(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Trident, "baseItem == Trident") }
	class Trumpet(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Trumpet, "baseItem == Trumpet") }
	class TwobladedSword(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.TwobladedSword, "baseItem == TwobladedSword") }
	class Warhammer(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Warhammer, "baseItem == Warhammer") }
	class Whip(wrapped: NWObject) extends Item(wrapped) { require(baseType() == BaseItem.Whip, "baseItem == Whip") }
}
