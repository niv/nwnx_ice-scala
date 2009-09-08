package es.elv.kobold {
	import NWN._
	import Implicits._

	object InvalidLocation extends Location(new Area(new NWObject(0x7f000000)), Vector.origin, 0.0) {
		override val valid = false
		def apply() = this
	}

	case class Location(val area: Area, val position: Vector, val facing: Double) {
		val valid = true

		def directionalAdjust(directionMod: Double) =
			new Location(area, position, facing + directionMod)

		/*
		 Returns true if oTo is on "this" side of facing.
		 oFacing has to be in the same area than oTo, or the result will
		 not make any sense.

		   oTo   -|>    = true
		   oTo   <|-    = false
		  (| is a door object, <- indicating the facing)
		*/
		// def onThisSide(test: G, to: G) =

		def distanceTo(lo: Vector) =
			position.distanceTo(lo)

		def distanceTo(lo: Location) = {
			require(lo.area == area)
			position.distanceTo(lo.position)
		}

		// create a location range units away from the current one, heading to o
		def inRangeTo(o: G, range: Double) = 0

		def ^+(e: Int, duration: Double): Unit = vfx(e, DurationType.Temporary, duration)
		def ^^(e: Int): Unit = vfx(e, DurationType.Instant, 0)
		def ^*(e: Int): Unit = vfx(e, DurationType.Permanent, 0)

		def applyEffect(e: Effect, durationType: DurationType, duration: Double) =
			R.proxy.applyEffectAtLocation(durationType, e, this, duration)

		/*def vfx(e: Int): Unit = instantVfx(e)
		def instantVfx(e: Int): Unit = vfx(e, DurationType.Instant, 0)
		def permanentVfx(e: Int): Unit = vfx(e, DurationType.Permanent, 0)
		def temporaryVfx(e: Int, duration: Double) = vfx(e, DurationType.Temporary, duration)*/

		def vfx(e: Int, durationType: DurationType, duration: Double) =
			R.proxy.applyEffectAtLocation(durationType,
				R.proxy.effectVisualEffect(e, false),
				this, duration)

		/** Create a new Location based on this one, with a new area set. */
		def relocate(a: (Area) => Area): Location =
			modify(a, p => position, f => facing)

		/** Create a new Location based on this one, with the position modified. */
		def move(v: (Vector) => Vector): Location =
			modify(a => area, v, f => facing)

		/** Create a new Location based on this one, with the facing modified. */
		def face(f: (Double) => Double): Location =
			modify(a => area, p => position, f)

		/** Create a new Location based on this one. */
		def modify(a: (Area) => Area, v: (Vector) => Vector, f: (Double) => Double): Location =
			Location(a(area), v(position), f(facing))
	}
}
