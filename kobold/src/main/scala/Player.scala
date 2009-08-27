package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Player extends WrappedFactory[NWObject, Player]((wrapped) => new Player(wrapped)) {
		def all = R.proxy.allPCs.map(Player(_)).toList

		def byAccount(account: String) = all.find(_.account == account)
		def byName(name: String) = all.find(_.name == name)
	}

	class Player private[kobold] (wrapped: NWObject) extends G[Player](wrapped, Some(Player))
			with Creature {
		ensureObjectType(ObjectType.Creature)

		import cachedproperty.CachePolicy._

		val account = P(Indef, () => R.proxy.getPCPlayerName(this))
		val ipAddress = P(Indef, () => R.proxy.getPCIPAddress(this))
		val publicKey = P(Indef, () => R.proxy.getPCPublicCDKey(this, false))
		
		def giveXP(adjust: Int) = R.proxy.giveXPToCreature(this, adjust)

		val isDM = P(Indef, () => R.proxy.getIsDM(this))

		val age = P(Indef, () => R.proxy.getAge(this))

		def kick = R.proxy.bootPC(this)

		def day2night(transitionTime: Double) = R.proxy.dayToNight(this, transitionTime)
		def night2day(transitionTime: Double) = R.proxy.nightToDay(this, transitionTime)

		def sendToServer(address: String, password: String, waypointTag: String, seamless: Boolean) =
			R.proxy.activatePortal(this, address, password, waypointTag.toUpperCase, seamless)


		// val cameraMode = P(() => R.proxy.getCameraMode
		
		override def toStringProperties = List(
			"account=" + account(), "key=" + publicKey(),
			"dm=" + isDM(), "ip=" + ipAddress()
		)
	}
}
