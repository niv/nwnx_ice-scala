package es.elv.kobold.color {
	object Color {
		val min = 1
		val low = 80
		val mid = 128
		val max = 210
	}

	import Color._

	case class Color(red: Int, green: Int, blue: Int) {
		val r = if (red > Color.max) Color.max else if (red < Color.min) Color.min else red
		val g = if (green > Color.max) Color.max else if (green < Color.min) Color.min else green
		val b = if (blue > Color.max) Color.max else if (blue < Color.min) Color.min else blue

		def apply(enclose: String) = toString + enclose + "</c>"

		def darken(by: Int) = Color(r - by, g - by, b - by)
		def lighten(by: Int) = Color(r + by, g + by, b + by)
		
		override def toString = "<c" + r.toChar + g.toChar + b.toChar + ">"
	}

	case object Red extends Color(max, min, min)
	case object MidRed extends Color(mid, min, min)
	case object DarkRed extends Color(low, min, min)
	case object Blue extends Color(min, min, max)
	case object LightBlue extends Color(min, mid, max)
	case object DarkBlue extends Color(min, min, low)
	case object Green extends Color(min, max, min)
	case object MidGreen extends Color(min, mid, min)
	case object DarkGreen extends Color(min, low, min)
	case object Yellow extends Color(max, max, min)
	case object DarkYellow extends Color(low, low, min)
	case object Magenta extends Color(max, min, max)
	case object DarkMagenta extends Color(low, min, low)
	case object Teal extends Color(min, max, max)
	case object DarkTeal extends Color(min, low, low)
	case object Orange extends Color(max, mid, min)
	case object LightGrey extends Color(mid, mid, mid)
	case object DarkGrey extends Color(low, low, low)

	case object White extends Color(max, max, max)
	case object Black extends Color(min, min, min)
}
