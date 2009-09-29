package es.elv.kobold.color
object Color {
	private val TokenRX = """<c(.)(.)(.)>""".r
	val min = 1
	val low = 80
	val mid = 128
	val high = 210
	val max = 255

	def apply(hex: Int) = new Color(hex)
	def apply(tok: String) = tok match {
		case "</c>" => NoColor
		case TokenRX(r, g, b) => {
			val (rr, gg, bb) = (r.toArray, g.toArray, b.toArray)
			new Color(rr(0).toInt, gg(0).toInt, bb(0).toInt)
		}
		case p => throw new IllegalArgumentException("Cannot parse token: " + tok)
	}

	/**
		Strip all colour tags out of the given string.
	*/
	def strip(t: String): String =
		t.replaceAll("<c...>", "").replaceAll("</c>", "")
}

import Color._

/**
	This class describes a colour suitable for NWN inline text colouring.
*/
case class Color(red: Int, green: Int, blue: Int) {
	val r = if (red > Color.max) Color.max else if (red < Color.min) Color.min else red
	val g = if (green > Color.max) Color.max else if (green < Color.min) Color.min else green
	val b = if (blue > Color.max) Color.max else if (blue < Color.min) Color.min else blue

	def this(hex: Int) =
		this(hex >> 16 & 0xff, hex >> 8 & 0xff, hex >> 0 & 0xff)

	/**
		Colourise the enclosed text with this Color.
	*/
	def apply(enclose: String) = toString + enclose + "</c>"

	def darken(by: Int) = Color(r - by, g - by, b - by)
	def lighten(by: Int) = Color(r + by, g + by, b + by)

	def toInt = r * 0xffff + g * 0xff + b
	
	override def toString = "<c" + r.toChar + g.toChar + b.toChar + ">"
}

case object NoColor extends Color(0) {
	override def apply(enclose: String) = toString + enclose
	override def toString = "</c>"
}
