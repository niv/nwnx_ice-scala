package es.elv.kobold

import NWN._
import net.lag._
import es.elv.kobold._

object Runner {
	lazy private val log = logging.Logger.get

	def main(args: Array[String]) {
		if (args.size < 1)
			error("No configuration specified. Syntax: KoboldStarter my.conf")

		configgy.Configgy.configure(args(0))
		val config = configgy.Configgy.config
		val endpoint = config.getString("ice_endpoint", "default -p 5223")

		log.debug("ICE endpoint listening at: " + endpoint)

		val plugins = config.getList("plugins")
		val pclasses = plugins.map(p =>
			Class.forName(p).newInstance.asInstanceOf[Plugin]
		)

		val ic: Ice.Communicator = Ice.Util.initialize
		val props = ic.getProperties
		props.setProperty("Ice.ThreadPool.Client.Size", "2")
		props.setProperty("Ice.ThreadPool.Client.SizeMax", "15")
		props.setProperty("Ice.ThreadPool.Server.Size", "2")
		props.setProperty("Ice.ThreadPool.Server.SizeMax", "15")

		val adapter: Ice.ObjectAdapter =
			ic.createObjectAdapterWithEndpoints(
				"Client", endpoint)

		val obj: Ice.Object = R

		adapter.add(obj, ic.stringToIdentity("Client"))

		log.info("Loading all plugins ..")
		Kobold loadPlugin CoreEvents
		Kobold loadPlugin new Imp
		pclasses.foreach(Kobold loadPlugin _)
		log.info("Starting up.")
		adapter.activate()
	}
}
