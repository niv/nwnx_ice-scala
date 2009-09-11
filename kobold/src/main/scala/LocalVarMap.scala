package es.elv.kobold
import es.elv.kobold.Implicits._

abstract class LocalVarMap[T](parent: G, getter: (String) => T,
		setter: (String, T) => Unit, deleter: (String) => Unit) {
	def apply(key: String): T = getter(key)
	def update(key: String, value: T) = setter(key, value)
	def -=(key: String) = deleter(key)
}

class LocalStringMap(parent: G) extends LocalVarMap[String](parent,
	(k) => R.proxy.getLocalString(parent, k),
	(k, v) => R.proxy.setLocalString(parent, k, v),
	(k) => R.proxy.deleteLocalString(parent, k)
)

class LocalIntMap(parent: G) extends LocalVarMap[Int](parent,
	(k) => R.proxy.getLocalInt(parent, k),
	(k, v) => R.proxy.setLocalInt(parent, k, v),
	(k) => R.proxy.deleteLocalInt(parent, k)
)

class LocalLongMap(parent: G) extends LocalVarMap[Long](parent,
	(k) => try { R.proxy.getLocalString(parent, "_ice_l_" + k).toLong }
		catch { case p: NumberFormatException => 0 },
	(k, v) => R.proxy.setLocalString(parent, "_ice_l_" + k, v.toString),
	(k) => R.proxy.deleteLocalString(parent, "_ice_l_" + k)
)

class LocalBoolMap(parent: G) extends LocalVarMap[Boolean](parent,
	(k) => if (R.proxy.getLocalInt(parent, "_ice_b_" + k) != 0) true else false,
	(k, v) => R.proxy.setLocalInt(parent, "_ice_b_" + k, if (v) 1 else 0),
	(k) => R.proxy.deleteLocalInt(parent, "_ice_b_" + k)
)

class LocalFloatMap(parent: G) extends LocalVarMap[Float](parent,
	(k) => R.proxy.getLocalFloat(parent, k),
	(k, v) => R.proxy.setLocalFloat(parent, k, v),
	(k) => R.proxy.deleteLocalFloat(parent, k)
)

class LocalLocationMap(parent: G) extends LocalVarMap[Location](parent,
	(k) => R.proxy.getLocalLocation(parent, k),
	(k, v) => R.proxy.setLocalLocation(parent, k, v),
	(k) => R.proxy.deleteLocalLocation(parent, k)
)

class LocalObjectMap(parent: G) extends LocalVarMap[G](parent,
	(k) => G[G](R.proxy.getLocalObject(parent, k)),
	(k, v) => R.proxy.setLocalObject(parent, k, v),
	(k) => R.proxy.deleteLocalObject(parent, k)
)

class LocalVectorMap(parent: G) extends LocalVarMap[Vector](parent,
	(k) => Vector(
		R.proxy.getLocalFloat(parent, "_ice_v_" + k + "_x"),
		R.proxy.getLocalFloat(parent, "_ice_v_" + k + "_y"),
		R.proxy.getLocalFloat(parent, "_ice_v_" + k + "_z")
	),
	(k, v) => {
		R.proxy.setLocalFloat(parent, "_ice_v_" + k + "_x", v.x)
		R.proxy.setLocalFloat(parent, "_ice_v_" + k + "_y", v.y)
		R.proxy.setLocalFloat(parent, "_ice_v_" + k + "_z", v.z)
	},
	(k) => {
		R.proxy.deleteLocalFloat(parent, "_ice_v_" + k + "_x")
		R.proxy.deleteLocalFloat(parent, "_ice_v_" + k + "_y")
		R.proxy.deleteLocalFloat(parent, "_ice_v_" + k + "_z")
	}
)
