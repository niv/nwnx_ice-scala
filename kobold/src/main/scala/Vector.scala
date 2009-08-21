package es.elv.kobold {

	case class Vector(val x: Double, val y: Double, val z: Double) {
		require(x >= 0.0)
		require(y >= 0.0)

		lazy val angle = this match {
			case Vector(0, 0, 0) => 0
			case _ => angleTo(Vector(0, 0, 0))
		}

		lazy val magnitude = distanceTo(Vector(0, 0, 0))

		def distanceTo(lo: Vector) =
			Math.sqrt(Math.pow(lo.x - x, 2) + Math.pow(lo.y - y, 2) + Math.pow(lo.z - z, 2))
		
		def positionFrom(distance: Double, angle: Double) =
			new Vector(Math.abs(x + distance * Math.cos(angle)), Math.abs(y + distance * Math.sin(angle)), z)

		def angleTo(lo: Vector) =
			Math.acos(Math.abs((x - lo.x).toInt).toDouble / distanceTo(lo))

		def normalize = this / magnitude

		def +(o: Vector) = Vector(o.x + x, o.y + y, o.z + z)
		def -(o: Vector) = Vector(x - o.x, y - o.y, z - o.z)
		def *(o: Double) = Vector(x * o, y * o, z * o)
		def /(o: Double) = Vector(x / o, y / o, z / o)
		def dot(o: Vector) = x * o.x + y * o.y + z * o.z
	}
}
