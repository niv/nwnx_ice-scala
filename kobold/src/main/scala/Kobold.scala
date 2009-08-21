package es.elv.kobold {
	import net.lag._

	abstract class Persistable[T] extends NWN.Persistable

	abstract class Plugin extends Observer {
		def onLoad {}
		def onUnload {}

		private lazy val persistKey = "__" + this.getClass.getName.toString + "_"

		def retrieve[T](key: String, constructor: => Persistable[T]): T = {
			val k = persistKey + key
			val ret = if (R.proxy.hasState(k))
				R.proxy.getState(k)
			else {
				val n = constructor
				R.proxy.putState(k, n)
				n
			}
			ret.asInstanceOf[T]
		}

		def store[T](key: String, p: Persistable[T]) =
			R.proxy.putState(persistKey + key, p.asInstanceOf[NWN.Persistable])
	}

	object Kobold {
		private val log = logging.Logger.get

		private var plugins: List[Plugin] = List()

		def loadPlugin(p: Plugin) {
			EventSource register p
			plugins = p :: plugins
			p.onLoad
		}

		def unloadPlugin(p: Plugin) {
			p.onUnload
			plugins = plugins.remove(_ == p)
			EventSource unregister p
		}

	}
}
