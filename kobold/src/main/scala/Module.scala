package es.elv.kobold
import NWN._
import Implicits._

object Module extends G(new NWObject(0)) {
	class DateTime(val year: Int, val month: Int, val day: Int, val hour: Int, val minute: Int, val second: Int)

	def apply() = this

	def calendar = new DateTime(R.proxy.getCalendarYear, R.proxy.getCalendarMonth,
		R.proxy.getCalendarDay, R.proxy.getTimeHour, R.proxy.getTimeMinute,
		R.proxy.getTimeSecond)

	def calendar_=(datetime: DateTime) {
		R.proxy.setTime(datetime.hour, datetime.minute, datetime.second, 0)
		R.proxy.setCalendar(datetime.year, datetime.month, datetime.day)
	}

	override val valid = P(() => true)
}
