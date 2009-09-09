package es.elv.kobold {
	import NWN._
	import Implicits._

	object PlayerCreature {
		def all: List[PlayerCreature] = R.proxy.allPCs.map(G[PlayerCreature](_)).toList

		def byAccount(account: String) = all.find(_.account == account)
		def byName(name: String) = all.find(_.name == name)
	}
	object Player {
		def all: List[Player] = PlayerCreature.all.filter(_.isInstanceOf[Player]).map(_.asInstanceOf[Player])

		def byAccount(account: String) = all.find(_.account == account)
		def byName(name: String) = all.find(_.name == name)
	}
	object DM {
		def all: List[DM] = PlayerCreature.all.filter(_.isInstanceOf[DM]).map(_.asInstanceOf[DM])

		def byAccount(account: String) = all.find(_.account == account)
		def byName(name: String) = all.find(_.name == name)
	}

	abstract class PlayerCreature (wrapped: NWObject) extends Creature(wrapped) {
		import cachedproperty.CachePolicy._

		val age = P(Indef, () => R.proxy.getAge(this))

		val account = P(Indef, () => R.proxy.getPCPlayerName(this))
		val ipAddress = P(Indef, () => R.proxy.getPCIPAddress(this))
		val publicKey = P(Indef, () => R.proxy.getPCPublicCDKey(this, false))

		def kick = R.proxy.bootPC(this)

		def day2night(transitionTime: Float) = R.proxy.dayToNight(this, transitionTime)
		def night2day(transitionTime: Float) = R.proxy.nightToDay(this, transitionTime)

		def sendToServer(address: String, password: String, waypointTag: String, seamless: Boolean) =
			R.proxy.activatePortal(this, address, password, waypointTag.toUpperCase, seamless)

		// val cameraMode = P(() => R.proxy.getCameraMode

		override def toStringProperties = List(
			"account=" + account(), "key=" + publicKey(), "ip=" + ipAddress()
		)
	}

	class Player (wrapped: NWObject) extends PlayerCreature(wrapped) {
		def giveXP(adjust: Int) = R.proxy.giveXPToCreature(this, adjust)
	}

	class DM (wrapped: NWObject) extends PlayerCreature(wrapped) {
	}
}
