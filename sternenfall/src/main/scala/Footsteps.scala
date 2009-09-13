package org.sternenfall.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._

object Footstep extends GRefTagFactory[Footstep](ObjectType.Placeable, "x0_tracks", "footsteps")

class Footstep(wrapped: NWObject) extends Placeable(wrapped) {
	require(tag() == "footsteps", "tag = footsteps")

	val owner = P(() => lo("footstepOwner"), (o: G) => lo("footstepOwner") = o)
}

/**
	This plugin simply creates footstep placeables behind
	players walking, in predefined distances. 
	
	Each player can accumulate "wetness", which will make him
	produce footsteps. Players with no wetness will not
	Each surface makes the player accumulate or lose points,
	depending on the type.
*/
object Footsteps extends Plugin {
	import SurfaceType._

	G registerCustomClass ((n, v, o, r, ta) => if (o == ObjectType.Placeable && ta == "footsteps")
		Some(new Footstep(n)) else None
	)

	private val fadeoutTimePerWetpoint = config.getInt("fadeoutTimePerWetpoint")
	private def minimumDistance = config.getFloat("minimumDistance")

	private def minimumWetpoints = config.getInt("minimumWetpoints")
	private def maximumWetpoints = config.getInt("maximumWetpoints")

	private def ticksStandingStill = config.getInt("ticksStandingStill")

	// Add this many wetpoints per step per surface type.
	private val surfaceAdjustments: Map[Int, Int] = Map(
		Sand      -> -4,
		Carpet    -> -3,
		Dirt      -> -1,
		Wood      -> -1,
		Metal     -> -1,
		Stone     -> -1,
		StoneBridge -> -1,
		
		Leaves    -> 0,
		
		Grass     -> +1,

		Puddles   -> +1,
		Mud       -> +2,
		Swamp     -> +4,

		Snow      -> +5,
		Water     -> +25,
		DeepWater -> +25
	)

	private val surfaceAdjustmentsMinimum: Map[Int, Int] = Map(
		Dirt -> 1,
		Sand -> 1,
		Leaves -> 1
	)
	private val tracklessSurfaces = List(Water, DeepWater)

	private val weatherAdjustments: Map[Weather, Int] = Map(
		Weather.RainWeather -> +5,
		Weather.SnowWeather -> +5
	)

	private def doFootsteps(p: Creature) {
		var wetpoints = p.li("footstepWetpoints")
		val surface = p.location().surface

		if (surfaceAdjustments.contains(surface))
			wetpoints += surfaceAdjustments(surface)

		val weather = p.location().area.weather()
		if (weatherAdjustments.contains(weather))
			wetpoints += weatherAdjustments(weather)

		if (wetpoints < minimumWetpoints)
			wetpoints = minimumWetpoints

		if (surfaceAdjustmentsMinimum.contains(surface) && surfaceAdjustmentsMinimum(surface) > wetpoints)
			wetpoints = surfaceAdjustmentsMinimum(surface)
		if (wetpoints > maximumWetpoints)
			wetpoints = maximumWetpoints
		
		p.li("footstepWetpoints") = wetpoints
	
		if (tracklessSurfaces.contains(surface))
			return

		val lastLoc = p.llo("footstepLastLoc")
		if (p.location() == lastLoc) {
			val standStill = p.li("footstepStandingStill")
			if (p.li("footstepStandingStill") > ticksStandingStill)
				return
			p.li("footstepStandingStill") = standStill + 1
		} else
			p.li("footstepStandingStill") = 0

		p.llo("footstepLastLoc") = p.location()

		p.near(minimumDistance, NWN.ObjectType.Placeable, classOf[Footstep]) filter (pla => pla.owner() == p) match {

			case x :: xs => // existing, do nothing.

			case _ => Footstep(p.location() move (_ + Vector(0, 0, 0.01f))) match {

				case pl: Footstep => {
					pl.owner() = p
					pl.plot() = true
					var timeout = fadeoutTimePerWetpoint * wetpoints
					if (p.stealthMode())
						timeout = (timeout.toFloat / 1.5f).toInt
					pl after (timeout, pl.destroy)
				}

				case _ => log.warn("Cannot create footstep.")
			}

		}
	}
	
	private def doesFootsteps(p: Creature) =
		TwoDA("appearance")("HasLegs", p.appearance()) == "1" &&
		!p.hasFeat(201 /*Feat.TracklessStep*/) &&
		p.alive


	def listen(event: Event) = event match {


		case OnTick(_, tick) => {
			val players = PlayerCreature.all() filter (p => p.area().valid() && doesFootsteps(p))
			val npcs: List[NonPlayer] = if (config.getBoolean("handleAllNPCsInArea"))
				players.flatMap(p =>
					p.area().all(ObjectType.Creature, classOf[NonPlayer]))
			else
				players.flatMap(p =>
					p.near(config.getFloat("handleNPCsWithinOfPlayer"), NWN.ObjectType.Creature, classOf[NonPlayer]))

			val selectedNPCs = npcs.removeDuplicates.
				filter(n => n.area().valid() && doesFootsteps(n)).
				take(config.getInt("areaCreaturesLimit"))

			for (p <- players) doFootsteps(p)
			for (p <- selectedNPCs) doFootsteps(p)
		}

		case _ =>
	}
}