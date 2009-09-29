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

G.registerObjectClass((o, v, t, r, ta) => if (t == ObjectType.Item) {
	val baseType = R.proxy.getBaseItemType(o)

	val category = try {
		TwoDA("baseitems")("Category", baseType).toInt
	} catch {
		case x: NumberFormatException => 0
	}

	Some(category match {
		case 1 => new MeleeWeapon(o)
		case 2 => new RangedWeapon(o)
		case 3 => new Shield(o)
		case 4 => new Armor(o)
		case 5 => new Helmet(o)
		case 6 => new Ammunition(o)
		case 7 => new ThrownWeapon(o)
		case 8 => new Stave(o)
		case 9 => new Potion(o)
		case 10 => new Scroll(o)
		case 11 => new ThievesTools(o)
		case 12 => new MiscItem(o)
		case 13 => new Wand(o)
		case 14 => new Rod(o)
		case 15 => new TrapItem(o)
		case 16 => new MiscUnequippableItem(o)
		// case 17 => new Container(o)
		case 19 => new HealersKit(o)
		case _ => new UnclassifiedItem(o)
	})
} else None)

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
