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

class LocalBoolMap(parent: G) {
	def apply(key: String): Boolean =
		if (R.proxy.getLocalInt(parent, "_ice_b_" + key) == 0) false else true
	def update(key: String, value: Boolean) =
		R.proxy.setLocalInt(parent, "_ice_b_" + key, if (value) 1 else 0)
	def -=(key: String) =
		R.proxy.deleteLocalInt(parent, "_ice_b_" + key)
}

class LocalFloatMap(parent: G) {
	def apply(key: String): Double =
		R.proxy.getLocalFloat(parent, key)
	def update(key: String, value: Double) =
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
