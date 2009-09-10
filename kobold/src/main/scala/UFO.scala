package es.elv.kobold {
	import NWN._
	import Implicits._

	/**
		A UFO is some object that fails classification, but is
		there nevertheless. This is usually a stray object
		created by nwserver due to a bug or undocumented feature,
		and should not be acted/relied upon. This is simply here
		to stop the classifier from barfing.
	*/
	class UFO (wrapped: NWObject) extends G(wrapped) {
		Kobold.log.warn(this.toString)
	}
}
