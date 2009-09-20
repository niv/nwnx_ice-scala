package es.elv.kobold
import NWN._
import Implicits._

object GCoreClasses { def registerAll {

G.registerObjectClass((o, v, t, r, ta) => if (o.id == 0) Some(Module()) else None)
G.registerObjectClass((o, v, t, r, ta) => if (o.id == 0x7f000000) Some(Invalid()) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Store) Some(new Store(o)) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Trigger) Some(new Trigger(o)) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Store) Some(new Store(o)) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Placeable) if (R.proxy.getHasInventory(o))
	Some(new Placeable(o) with Inventory) else Some(new Placeable(o)) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Door) Some(new Door(o)) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Waypoint) Some(new Waypoint(o)) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Encounter) Some(new Encounter(o)) else None)
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.AOE) Some(new AOE(o)) else None)

G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Item) Some(R.proxy.getBaseItemType(o) match {
	case BaseItem.CreatureBludgeonWeapon => new CreatureBludgeonWeapon(o)
	case BaseItem.CreaturePierceWeapon => new CreaturePierceWeapon(o)
	case BaseItem.CreatureItem => new CreatureItem(o)
	case BaseItem.CreatureSlashWeapon => new CreatureSlashWeapon(o)
	case BaseItem.CreatureSlashPierceWeapon => new CreatureSlashPierceWeapon(o)

	case BaseItem.Amulet => new Amulet(o)
	case BaseItem.Armor => new Armor(o)
	case BaseItem.Arrow => new Arrow(o)
	case BaseItem.BastardSword => new BastardSword(o)
	case BaseItem.Battleaxe => new Battleaxe(o)
	case BaseItem.Belt => new Belt(o)
	case BaseItem.BlankMagicWand => new BlankMagicWand(o)
	case BaseItem.BlankScroll => new BlankScroll(o)
	case BaseItem.Bolt => new Bolt(o)
	case BaseItem.Book => new Book(o)
	case BaseItem.Boots => new Boots(o)
	case BaseItem.Bracer => new Bracer(o)
	case BaseItem.Bullet => new Bullet(o)
	case BaseItem.Cloak => new Cloak(o)
	case BaseItem.Club => new Club(o)
	case BaseItem.CraftBase => new CraftBase(o)
	case BaseItem.CraftCompBase => new CraftCompBase(o)
	case BaseItem.CraftCompSmall => new CraftCompSmall(o)
	case BaseItem.CraftedMagicWand => new CraftedMagicWand(o)
	case BaseItem.CraftedPotion => new CraftedPotion(o)
	case BaseItem.CraftedScroll => new CraftedScroll(o)
	case BaseItem.Dagger => new Dagger(o)
	case BaseItem.Dart => new Dart(o)
	case BaseItem.DireMace => new DireMace(o)
	case BaseItem.DoubleAxe => new DoubleAxe(o)
	case BaseItem.DwarvenWaraxe => new DwarvenWaraxe(o)
	case BaseItem.EmptyPotion => new EmptyPotion(o)
	case BaseItem.Encampment => new Encampment(o)
	case BaseItem.Gem => new Gem(o)
	case BaseItem.Gloves => new Gloves(o)
	case BaseItem.Gold => new Gold(o)
	case BaseItem.Greataxe => new Greataxe(o)
	case BaseItem.GreatSword => new GreatSword(o)
	case BaseItem.Grenade => new Grenade(o)
	case BaseItem.Halberd => new Halberd(o)
	case BaseItem.Handaxe => new Handaxe(o)
	case BaseItem.HealersKit => new HealersKit(o)
	case BaseItem.HeavyCrossbow => new HeavyCrossbow(o)
	case BaseItem.HeavyFlail => new HeavyFlail(o)
	case BaseItem.Helmet => new Helmet(o)
	case BaseItem.Kama => new Kama(o)
	case BaseItem.Katana => new Katana(o)
	case BaseItem.Key => new Key(o)
	case BaseItem.Kukri => new Kukri(o)
	case BaseItem.Lance => new Lance(o)
	case BaseItem.LargeBox => new LargeBox(o)
	case BaseItem.LargeShield => new LargeShield(o)
	case BaseItem.LightCrossbow => new LightCrossbow(o)
	case BaseItem.LightFlail => new LightFlail(o)
	case BaseItem.LightHammer => new LightHammer(o)
	case BaseItem.LightMace => new LightMace(o)
	case BaseItem.Longbow => new Longbow(o)
	case BaseItem.Longsword => new Longsword(o)
	case BaseItem.MagicRod => new MagicRod(o)
	case BaseItem.MagicStaff => new MagicStaff(o)
	case BaseItem.MagicWand => new MagicWand(o)
	case BaseItem.MiscLarge => new MiscLarge(o)
	case BaseItem.MiscMedium => new MiscMedium(o)
	case BaseItem.MiscSmall => new MiscSmall(o)
	case BaseItem.MiscThin => new MiscThin(o)
	case BaseItem.MoonOnAStick => new MoonOnAStick(o)
	case BaseItem.Morningstar => new Morningstar(o)
	case BaseItem.Potion => new Potion(o)
	case BaseItem.Quarterstaff => new Quarterstaff(o)
	case BaseItem.Rapier => new Rapier(o)
	case BaseItem.Ring => new Ring(o)
	case BaseItem.Scimitar => new Scimitar(o)
	case BaseItem.Scythe => new Scythe(o)
	case BaseItem.Shortbow => new Shortbow(o)
	case BaseItem.ShortSpear => new ShortSpear(o)
	case BaseItem.ShortSword => new ShortSword(o)
	case BaseItem.Shuriken => new Shuriken(o)
	case BaseItem.Sickle => new Sickle(o)
	case BaseItem.Sling => new Sling(o)
	case BaseItem.SmallShield => new SmallShield(o)
	case BaseItem.SpellScroll => new SpellScroll(o)
	case BaseItem.ThievesTools => new ThievesTools(o)
	case BaseItem.ThrowingAxe => new ThrowingAxe(o)
	case BaseItem.Torch => new Torch(o)
	case BaseItem.TowerShield => new TowerShield(o)
	case BaseItem.TrapKit => new TrapKit(o)
	case BaseItem.Trident => new Trident(o)
	case BaseItem.Trumpet => new Trumpet(o)
	case BaseItem.TwobladedSword => new TwobladedSword(o)
	case BaseItem.Warhammer => new Warhammer(o)
	case BaseItem.Whip => new Whip(o)

	case _ => new UnclassifiedItem(o)
}) else None)

G.registerObjectClass((o, v, t, r, ta) => R.proxy.getWeather(o) match {
	case Weather.InvalidWeather => None
	case _ => Some(new Area(o))
})

/* There seems to be a bug/undocumented feature in nwserver that sometimes spawns
	an object at the location just where a player logged out, of type ALL
	and with resref = "", tag = "" and name of the player. */
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.All && r == "" && ta == "" &&
		R.proxy.getName(o, true) != "" && R.proxy.getDescription(o, true, true) == "") {
	Some(new UFO(o))
} else None)

/* TRUE if oCreature is a DM (Dungeon Master) avatar. Returns FALSE for
	everything else, including creatures controlled by the DM.  */
G.registerObjectClass((o, v, t, r, ta) => if (R.proxy.getIsDM(o)) Some(new DM(o)) else None)

/* Returns ASSOCIATE_TYPE_NONE if the creature is not the associate of anyone. */
G.registerObjectClass((o, v, t, r, ta) => R.proxy.getAssociateType(o) match {
	case AssociateType.AnimalCompanionAssociate => Some(new AnimalCompanion(o))
	case AssociateType.FamiliarAssociate        => Some(new Familiar(o))
	case AssociateType.DominatedAssociate       => Some(new NPC(o))
	case AssociateType.HenchmanAssociate        => Some(new NPC(o))
	case AssociateType.SummonedAssociate        => Some(new Summon(o)) // XXX: summons are only flagged AFTER onCreate
	case AssociateType.NoAssociate              => None
})

/* Returns TRUE if the creature oCreature is currently possessed by a DM character. */
/* Note: GetIsDMPossessed() will return FALSE if oCreature is the DM character. */
G.registerObjectClass((o, v, t, r, ta) => if (R.proxy.getIsDMPossessed(o)) Some(new NPC(o)) else None)

/* Resref is always "" for player characters. */
/* A player controlled character is treated as one of the following: a PC, DM avatars,
	familiars possessed by PCs, monsters possessed by DMs. */
G.registerObjectClass((o, v, t, r, ta) => if (r == "" && R.proxy.getIsPC(o)) Some(new Player(o)) else None)

/* Empty resref: copy of player.  Non-empty: created from template. */
G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Creature) Some(new NPC(o)) else None)

G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.All) r match {
	case "" => Some(new Sound(o))
} else None)

G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.InvalidObject) Some(new Invalid(o)) else None)

} }
