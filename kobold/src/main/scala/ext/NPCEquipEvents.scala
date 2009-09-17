package es.elv.kobold

import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

package ext {

/**
	Sends out OnItemEquip and OnItemUnequip for NPCs too. Will delay up until the next
	heartbeat and thus not fire synchronously, and will not fire events for unequip/equip
	sequences cancelling out each other within that window.

	Note that this will fire events only for NPCs where the OnSpawn event has been
	witnessed.
*/
object NPCEquipEvents extends Plugin {
	private val currentlyEquipped: collection.mutable.Map[NPC, List[G]] =
		collection.mutable.Map()

	private def checkDiff(o: NPC) {
		val now = o.equipped()
		val added = now -- currentlyEquipped(o)
		val removed = currentlyEquipped(o) -- now
		for (i <- added)
			log.debug("" + (EventSource send OnItemEquip(i, o)))
		for (i <- removed)
			log.debug("" + (EventSource send OnItemUnequip(i, o)))
		currentlyEquipped(o) = now
	}

	def listen(event: Event) = event match {

		case OnItemUnacquire(i: G, o: NPC) => if (currentlyEquipped.contains(o))
			if (currentlyEquipped(o).contains(i)) {
				EventSource send OnItemUnequip(i, o)
				currentlyEquipped(o) -= i
			}

		case OnInvalidated(o: NPC) => if (currentlyEquipped.contains(o))
			currentlyEquipped -= o

		case OnCreatureSpawn(o: NPC) => if (!currentlyEquipped.contains(o)) {
				currentlyEquipped(o) = List()
				o after (1000, checkDiff(o))
			} else
				log.error("Spawn event for creature already in cache: " + o)

		case OnCreatureHB(o: NPC) => if (currentlyEquipped.contains(o))
			checkDiff(o)

		case _ =>
	}
}

}
