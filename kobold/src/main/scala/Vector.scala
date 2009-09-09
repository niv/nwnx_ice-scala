package es.elv.kobold {

	object Vector {
		/** The origin vector: (0, 0, 0) */
		val origin = Vector(0f, 0f, 0f)
	}

	/**
		A Vector represents a point in 3d-space. This is equivalent
		to the nwscript "vector" datatype.
	*/
	case class Vector(val x: Float, val y: Float, val z: Float) {
		/** The angle of this Vector. */
		lazy val angle: Float = this match {
			case Vector(0, 0, 0) => 0
			case _ => angleTo(Vector(0f, 0f, 0f))
		}

		/** The magnitude of this Vector. */
		lazy val magnitude = distanceTo(Vector.origin)

		/** Calculates the distance from this Vector to to another Vector. */
		def distanceTo(lo: Vector) =
			Math.sqrt(Math.pow(lo.x - x, 2) + Math.pow(lo.y - y, 2) + Math.pow(lo.z - z, 2)).toFloat
		
		/** Creates a new Vector at the position distance units away at the given angle. */
		def positionFrom(distance: Float, angle: Float) =
			new Vector(Math.abs(x + distance * Math.cos(angle)).toFloat, Math.abs(y + distance * Math.sin(angle)).toFloat, z)

		/** Calculates the angle to another Vector. */
		def angleTo(lo: Vector): Float =
			Math.acos(Math.abs((x - lo.x).toInt).toDouble / distanceTo(lo)).toFloat

		/** Returns the normalised unit-Vector. */
		def normalize = this / magnitude

		/** Add another vector to this one, returning a new Vector. */
		def +(o: Vector) = Vector(o.x + x, o.y + y, o.z + z)
		/** Substract another vector from this one, returning a new Vector. */
		def -(o: Vector) = Vector(x - o.x, y - o.y, z - o.z)
		/** Multiply another vector with this one, returning a new Vector. */
		def *(o: Float) = Vector(x * o, y * o, z * o)
		/** Divide this Vector with another one, returning a new Vector. */
		def /(o: Float) = Vector(x / o, y / o, z / o)
		/** Create the dot product between this Vector and the given one. */
		def dot(o: Vector) = x * o.x + y * o.y + z * o.z
	}
}
