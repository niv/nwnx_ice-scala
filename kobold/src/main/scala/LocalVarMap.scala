package es.elv.kobold
import es.elv.kobold.Implicits._

class LocalStringMap(parent: G) {
	def apply(key: String): String =
		R.proxy.getLocalString(parent, key)
	def update(key: String, value: String) =
		R.proxy.setLocalString(parent, key, value)
	def -=(key: String) =
		R.proxy.deleteLocalString(parent, key)
}

class LocalIntMap(parent: G) {
	def apply(key: String): Int =
		R.proxy.getLocalInt(parent, key)
	def update(key: String, value: Int) =
		R.proxy.setLocalInt(parent, key, value)
	def -=(key: String) =
		R.proxy.deleteLocalInt(parent, key)
}

class LocalLongMap(parent: G) {
	def apply(key: String): Long =
		try {R.proxy.getLocalString(parent, "_ice_l_" + key).toLong } catch { case p: NumberFormatException => 0 }
	def update(key: String, value: Long) =
		R.proxy.setLocalString(parent, "_ice_l_" + key, value.toString)
	def -=(key: String) =
		R.proxy.deleteLocalString(parent,"_ice_l_" +  key)
}

class LocalBoolMap(parent: G) {
	def apply(key: String): Boolean =
		if (R.proxy.getLocalInt(parent, "_ice_b_" + key) == 0) false else true
	def update(key: String, value: Boolean) =
		R.proxy.setLocalInt(parent, "_ice_b_" + key, if (value) 1 else 0)
	def -=(key: String) =
		R.proxy.deleteLocalInt(parent, "_ice_b_" + key)
}

class LocalFloatMap(parent: G) {
	def apply(key: String): Float =
		R.proxy.getLocalFloat(parent, key)
	def update(key: String, value: Float) =
		R.proxy.setLocalFloat(parent, key, value)
	def -=(key: String) =
		R.proxy.deleteLocalFloat(parent, key)
}

class LocalObjectMap(parent: G) {
	def apply(key: String): G =
		G(R.proxy.getLocalObject(parent, key))
	def update(key: String, value: G) =
		R.proxy.setLocalObject(parent, key, value)
	def -=(key: String) =
		R.proxy.deleteLocalObject(parent, key)
}

class LocalVectorMap(parent: G) {
	def apply(key: String): Vector = Vector(
		R.proxy.getLocalFloat(parent, "_ice_v_" + key + "_x"),
		R.proxy.getLocalFloat(parent, "_ice_v_" + key + "_y"),
		R.proxy.getLocalFloat(parent, "_ice_v_" + key + "_z")
	)
	def update(key: String, value: Vector) {
		R.proxy.setLocalFloat(parent, "_ice_v_" + key + "_x", value.x)
		R.proxy.setLocalFloat(parent, "_ice_v_" + key + "_y", value.y)
		R.proxy.setLocalFloat(parent, "_ice_v_" + key + "_z", value.z)
	}
	def -=(key: String) {
		R.proxy.deleteLocalFloat(parent, "_ice_v_" + key + "_x")
		R.proxy.deleteLocalFloat(parent, "_ice_v_" + key + "_y")
		R.proxy.deleteLocalFloat(parent, "_ice_v_" + key + "_z")
	}
}

class LocalLocationMap(parent: G) {
	def apply(key: String): Location =
		G[G](R.proxy.getLocalObject(parent, "_ice_lo_" + key + "_o")) match {
			case l: Area => Location(l,
				Vector(R.proxy.getLocalFloat(parent, "_ice_lo_" + key + "_x"),
					R.proxy.getLocalFloat(parent, "_ice_lo_" + key + "_y"),
					R.proxy.getLocalFloat(parent, "_ice_lo_" + key + "_z")),
				R.proxy.getLocalFloat(parent, "_ice_lo_" + key + "_f")
			)
			case _ => InvalidLocation()
		}
	def update(key: String, value: Location) {
		R.proxy.setLocalObject(parent, "_ice_lo_" + key + "_o", value.area)
		R.proxy.setLocalFloat(parent, "_ice_lo_" + key + "_x", value.position.x)
		R.proxy.setLocalFloat(parent, "_ice_lo_" + key + "_y", value.position.y)
		R.proxy.setLocalFloat(parent, "_ice_lo_" + key + "_z", value.position.z)
		R.proxy.setLocalFloat(parent, "_ice_lo_" + key + "_f", value.facing)
	}
	def -=(key: String) {
		R.proxy.deleteLocalObject(parent, "_ice_lo_" + key + "_o")
		R.proxy.deleteLocalFloat(parent, "_ice_lo_" + key + "_x")
		R.proxy.deleteLocalFloat(parent, "_ice_lo_" + key + "_y")
		R.proxy.deleteLocalFloat(parent, "_ice_lo_" + key + "_z")
		R.proxy.deleteLocalFloat(parent, "_ice_lo_" + key + "_f")
	}
}
