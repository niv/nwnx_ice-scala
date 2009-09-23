package es.elv.kobold

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import events._

abstract class Persistable[T] extends NWN.Persistable

trait Plugin extends Observer {
	lazy protected val log = Kobold.logger()

	/**
		The default config name of this plugin. override to change, but not recommended.
		Defaults to "fully.qualified.class.Name.properties".
	*/
	private val configName = getClass.getName.toString.replace("$", "") +
		".properties"

	lazy protected val config = getConfig(configName)

	/** Get a configuration object with the given name. */
	protected def getConfig(name: String) = {
		val c = new org.apache.commons.configuration.PropertiesConfiguration(name)
		c.setThrowExceptionOnMissing(true)
		if (Kobold.config.getBoolean("reloadConfigOnChange", true))
			c.setReloadingStrategy(new org.apache.commons.configuration.reloading.FileChangedReloadingStrategy)
		c
	}

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

	override def toString = this.getClass.getName.toString
}

object Kobold {
	lazy private[kobold] val log = logger()

	val config = new org.apache.commons.configuration.PropertiesConfiguration("kobold.properties")
	config.setThrowExceptionOnMissing(true)
	if (config.getBoolean("reloadConfigOnChange", true))
		config.setReloadingStrategy(new org.apache.commons.configuration.reloading.FileChangedReloadingStrategy)

	private var plugins: List[Plugin] = List()

	def logger() = {
		val className = new Throwable().getStackTrace()(2).getClassName
		LoggerFactory.getLogger(className)
	}

	def loadPlugin(p: String): Unit =
		loadPlugin(Class.forName(p + "$").getField("MODULE$").get(null).asInstanceOf[Plugin])

	def loadPlugin(p: Plugin): Unit =
		if (!plugins.contains(p)) {
			EventSource register p
			plugins = p :: plugins
			p.onLoad
		}

	def unloadPlugin(p: Plugin) {
		p.onUnload
		plugins = plugins.remove(_ == p)
		EventSource unregister p
	}


	def main(args: Array[String]) {
		val endpoint = config.getString("ice.endpoint")

		log.debug("ICE endpoint listening at: " + endpoint)

		val plugins = config.getStringArray("plugins")

		log.info("Loading all plugins ..")
		Kobold loadPlugin CoreEvents
		Kobold loadPlugin Imp
		plugins.foreach(Kobold loadPlugin _)

		val iceprop = config.getProperties("ice.properties")
		val ic: Ice.Communicator = Ice.Util.initialize
		val props = ic.getProperties
		val propNames = iceprop.propertyNames
		while (propNames.hasMoreElements) {
			val nx: String = propNames.nextElement.asInstanceOf[String]
			log.debug("Set ice.property: " + nx + "=" + iceprop.getProperty(nx))
			props.setProperty(nx, iceprop.getProperty(nx))
		}

		val adapter: Ice.ObjectAdapter =
			ic.createObjectAdapterWithEndpoints(
				"Client", endpoint)

		val obj: Ice.Object = R

		adapter.add(obj, ic.stringToIdentity("Client"))

		log.info("Starting up.")
		adapter.activate()
	}
}
