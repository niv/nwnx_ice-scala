package es.elv.kobold {
	import NWN._
	import Implicits._
	import scala.collection._

	object Tlk {
		private val cache: mutable.Map[Int, String] = mutable.Map()

		def apply(ref: Int): String = apply(ref, Gender.MaleGender)
		def apply(ref: Int, gender: Gender) = {
			if (!cache.contains(ref))
				cache(ref) = R.proxy.getStringByStrRef(ref, gender)

			cache(ref)
		}
	}
}
