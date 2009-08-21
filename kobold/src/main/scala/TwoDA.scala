package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._
	import scala.collection._

	object TwoDA {
		private val cache: mutable.Map[(String, String, Int), String] = mutable.Map()
	
		def apply(table: String, column: String, row: Int) = {
			val key = (table, column, row)
			if (!cache.contains(key))
				cache(key) = R.proxy.get2DAString(table, column, row)

			cache(key)
		}
	}

}
