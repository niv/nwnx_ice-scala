package es.elv.kobold
import NWN._
import Implicits._

/**
	A base RacialType extractor, which subclasses allow
	extracting RacialTypes of the given type, like so:
	<br/>
	<tt>case OnCreatureHB(Dwarf(o)) => // match only dwarves</tt>
*/
abstract class RacialTypeExtractor(t: RacialType) {
	def unapply(o: Creature) =
		if (o.racialType() == t) Some(o) else None
}

object Dwarf extends RacialTypeExtractor(RacialType.DwarfRace)
object Elf extends RacialTypeExtractor(RacialType.ElfRace)
object Gnome extends RacialTypeExtractor(RacialType.GnomeRace)
object Halfling extends RacialTypeExtractor(RacialType.HalflingRace)
object Halfelf extends RacialTypeExtractor(RacialType.HalfelfRace)
object Halforc extends RacialTypeExtractor(RacialType.HalforcRace)
object Human extends RacialTypeExtractor(RacialType.HumanRace)
object Aberration extends RacialTypeExtractor(RacialType.AberrationRace)
object Animal extends RacialTypeExtractor(RacialType.AnimalRace)
object Beast extends RacialTypeExtractor(RacialType.BeastRace)
object Construct extends RacialTypeExtractor(RacialType.ConstructRace)
object Dragon extends RacialTypeExtractor(RacialType.DragonRace)
object Goblinoid extends RacialTypeExtractor(RacialType.HumanoidGoblinoidRace)
object Monstrous extends RacialTypeExtractor(RacialType.HumanoidMonstrousRace)
object Orc extends RacialTypeExtractor(RacialType.HumanoidOrcRace)
object Reptilian extends RacialTypeExtractor(RacialType.HumanoidReptilianRace)
object Elemental extends RacialTypeExtractor(RacialType.ElementalRace)
object Fey extends RacialTypeExtractor(RacialType.FeyRace)
object Giant extends RacialTypeExtractor(RacialType.GiantRace)
object MagicalBeast extends RacialTypeExtractor(RacialType.MagicalBeastRace)
object Outsider extends RacialTypeExtractor(RacialType.OutsiderRace)
object Shapechanger extends RacialTypeExtractor(RacialType.ShapechangerRace)
object Undead extends RacialTypeExtractor(RacialType.UndeadRace)
object Vermin extends RacialTypeExtractor(RacialType.VerminRace)
object Ooze extends RacialTypeExtractor(RacialType.OozeRace)
