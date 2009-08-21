import NWN._
import net.lag._
import es.elv.kobold._

object Sternenfall {
	def main(args: Array[String]) {
		if (args.size < 1)
			error("Need configuration file as parameter.")

		val conffile = args(0)
		configgy.Configgy.configure(conffile)
		val config = configgy.Configgy.config
		val endpoint_config = config.getString("ice_endpoint", "default -p 5223")

		val plugins = config.getList("plugins")

		val pclasses = plugins.map(p =>
			Class.forName(p).newInstance.asInstanceOf[Plugin]
		).toList

		KoboldStarter.run(endpoint_config, pclasses)
	}
}
