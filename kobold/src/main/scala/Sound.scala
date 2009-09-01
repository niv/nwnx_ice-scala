package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Sound
	class Sound private[kobold] (wrapped: NWObject) extends G(wrapped) {
		ensureObjectType(ObjectType.All)

		require(resref() == "")
		require(name() == "")

		def play = R.proxy.soundObjectPlay(this)
		def stop = R.proxy.soundObjectStop(this)

		def position_=(p: Vector) = R.proxy.soundObjectSetPosition(this, p)
		def volume_=(d: Int) = R.proxy.soundObjectSetVolume(this, d)
		
		override def toStringProperties = List("tag=" + tag())
	}
}
