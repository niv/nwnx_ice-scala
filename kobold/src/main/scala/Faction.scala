package es.elv.kobold
import NWN._
import Implicits._

case class Faction(val parent: Creature) extends cachedproperty.CachedProperties {

	val id = P(() => nwnx.Funcs.getFactionId(parent))

	/** All party members of this faction. When accessing a player party, this includes non-players. */
	val members = P(() => R.proxy.allInFaction(leader(), false).map(G[Creature](_)).toList : List[Creature])

	/** The leader of this party. */
	val leader = P(() => G[Creature](R.proxy.getFactionLeader(parent)))

	/** Adjusts how this faction feels about the given Creature. */
	def adjustReputation(target: Creature, adjust: Int) =
		R.proxy.adjustReputation(target, parent, adjust)

	// def adjustReputation(target: Faction, adjust: Int) =
		// R.proxy.adjustFactionReputation(


	val averageGoodEvil = P(() => R.proxy.getFactionAverageGoodEvilAlignment(parent))
	val averageLawChaos = P(() => R.proxy.getFactionAverageLawChaosAlignment(parent))
	val averageLevel = P(() => R.proxy.getFactionAverageLevel(parent))
	val averageXP = P(() => R.proxy.getFactionAverageXP(parent))
	val mostFrequentClass = P(() => R.proxy.getFactionMostFrequentClass(parent))

	val totalGold = P(() => R.proxy.getFactionGold(parent))

	private def facVisPartial(fun: (NWObject, Boolean) => NWObject)(visible: Boolean) =
		P(() => G[Creature](fun(parent, visible)))

	val leastDamagedMember = facVisPartial(R.proxy.getFactionLeastDamagedMember)(false)
	val mostDamagedMember  = facVisPartial(R.proxy.getFactionMostDamagedMember)(false)
	val strongestMember    = facVisPartial(R.proxy.getFactionStrongestMember)(false)
	val weakestMember      = facVisPartial(R.proxy.getFactionWeakestMember)(false)
	val bestACMember       = facVisPartial(R.proxy.getFactionBestAC)(false)
	val worstACMember      = facVisPartial(R.proxy.getFactionWorstAC)(false)

	val leastDamagedVisibleMember = facVisPartial(R.proxy.getFactionLeastDamagedMember)(true)
	val mostDamagedVisibleMember  = facVisPartial(R.proxy.getFactionMostDamagedMember)(true)
	val strongestVisibleMember    = facVisPartial(R.proxy.getFactionStrongestMember)(true)
	val weakestVisibleMember      = facVisPartial(R.proxy.getFactionWeakestMember)(true)
	val bestACVisibleMember       = facVisPartial(R.proxy.getFactionBestAC)(true)
	val worstACVisibleMember      = facVisPartial(R.proxy.getFactionWorstAC)(true)
}

trait FactionMember {
	this: Creature =>

	/** Retrieve the associated Faction instance. */
	val faction = P(cachedproperty.CachePolicy.Indef, () => Faction(this))
}

trait NPCFactionMember extends FactionMember {
	this: NPC =>

	/** Make this NPC join factionOfs faction (leaving the current one). */
	def joinFaction(factionOf: NPC) = R.proxy.changeFaction(this, factionOf)

	/** Make this NPC join the given Faction (leaving the current one). */
	def joinFaction(faction: Faction) = R.proxy.changeFaction(this, faction.parent)

	/** Make this NPC join a standard faction (leaving the current one). */
	def joinFaction(faction: StandardFaction) = R.proxy.changeToStandardFaction(this, faction)
}

trait PCFactionMember extends FactionMember {
	this: PlayerCreature =>

	/** Make this player join the party of partyOf. */
	def joinParty(partyOf: PlayerCreature) = R.proxy.addToParty(this, partyOf)

	/** Make this player leave their party, if any. */
	def leaveParty = R.proxy.removeFromParty(this)
}
