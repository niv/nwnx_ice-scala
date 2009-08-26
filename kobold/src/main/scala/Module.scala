package es.elv.kobold {
	import NWN._
	import net.lag._
	import Implicits._

	object Module {
		class DateTime(val year: Int, val month: Int, val day: Int, val hour: Int, val minute: Int, val second: Int)

		class ModuleInstance extends Wrapped[NWObject, ModuleInstance](new NWObject(0), None)
			with GameObject[ModuleInstance] with ActionQueue
		lazy private val instance = new ModuleInstance
		def apply() = instance

		def calendar = new DateTime(R.proxy.getCalendarYear, R.proxy.getCalendarMonth,
			R.proxy.getCalendarDay, R.proxy.getTimeHour, R.proxy.getTimeMinute,
			R.proxy.getTimeSecond)

		def calendar_=(datetime: DateTime) {
			R.proxy.setTime(datetime.hour, datetime.minute, datetime.second, 0)
			R.proxy.setCalendar(datetime.year, datetime.month, datetime.day)
		}

	}
}
