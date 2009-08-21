import NWN._
import net.lag._
import es.elv.kobold._


object KoboldStarter {
	def run(endpoint: String, plugins: List[Plugin]) {
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
		adapter.activate()

		Kobold loadPlugin CoreEvents
		plugins.foreach(Kobold loadPlugin _)
	}
}
