package es.elv.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._
import es.elv.kobold.Implicits._

object SurfaceType {
	val Dirt           = 1
	val Obscuring      = 2
	val Grass          = 3
	val Stone          = 4
	val Wood           = 5
	val Water          = 6
	val NoWalk         = 7
	val Transparent    = 8
	val Carpet         = 9
	val Metal          = 10
	val Puddles        = 11
	val Swamp          = 12
	val Mud            = 13
	val Leaves         = 14
	val Lava           = 15
	val BottomlessPit  = 16
	val DeepWater      = 17
	val Door           = 18
	val Snow           = 19
	val Sand           = 20
	val BareBones      = 21
	val StoneBridge    = 22
	val Trigger        = 30
}

package nwnx {

object FuncsExt extends Core("FUNCSEXT") {
	import scala.collection._

	def getSurfaceAt(where: Location) =
		setGet(where.area, "GETSURFACE", vectorToString(where.position)).toInt
}

}
