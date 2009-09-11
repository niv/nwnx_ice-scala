package es.elv.kobold.color {
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

	case object Mediumturquoise extends Color(0x48d1cc)
	case object Maroon extends Color(0x800000)
	case object Darkslategray extends Color(0x2f4f4f)
	case object Antiquewhite extends Color(0xfaebd7)
	case object Aquamarine extends Color(0x7fffd4)
	case object Seagreen extends Color(0x2e8b57)
	case object Burlywood extends Color(0xdeb887)
	case object Yellow extends Color(0xffff00)
	case object Skyblue extends Color(0x87ceeb)
	case object Royalblue extends Color(0x4169e1)
	case object Lightgrey extends Color(0xd3d3d3)
	case object Navy extends Color(0x000080)
	case object Cornsilk extends Color(0xfff8dc)
	case object Silver extends Color(0xc0c0c0)
	case object Darkseagreen extends Color(0x8fbc8f)
	case object Mediumslateblue extends Color(0x7b68ee)
	case object Bisque extends Color(0xffe4c4)
	case object Plum extends Color(0xdda0dd)
	case object Sandybrown extends Color(0xf4a460)
	case object Aqua extends Color(0x00ffff)
	case object Paleturquoise extends Color(0xafeeee)
	case object Azure extends Color(0xf0ffff)
	case object Lightgoldenrodyellow extends Color(0xfafad2)
	case object Rosybrown extends Color(0xbc8f8f)
	case object Lavenderblush extends Color(0xfff0f5)
	case object Lightpink extends Color(0xffb6c1)
	case object Indigo extends Color(0x4b0082)
	case object Beige extends Color(0xf5f5dc)
	case object Lightsalmon extends Color(0xffa07a)
	case object Mediumpurple extends Color(0x9370d8)
	case object Orangered extends Color(0xff4500)
	case object Turquoise extends Color(0x40e0d0)
	case object Palegreen extends Color(0x98fb98)
	case object Mediumseagreen extends Color(0x3cb371)
	case object YellowGreen extends Color(0x9acd32)
	case object Darkmagenta extends Color(0x8b008b)
	case object Palegoldenrod extends Color(0xeee8aa)
	case object Chartreuse extends Color(0x7fff00)
	case object Lawngreen extends Color(0x7cfc00)
	case object Darksalmon extends Color(0xe9967a)
	case object Violet extends Color(0xee82ee)
	case object Seashell extends Color(0xfff5ee)
	case object Hotpink extends Color(0xff69b4)
	case object Lightcoral extends Color(0xf08080)
	case object Darkslateblue extends Color(0x483d8b)
	case object Slateblue extends Color(0x6a5acd)
	case object Gray extends Color(0x808080)
	case object Darkred extends Color(0x8b0000)
	case object Darkgray extends Color(0xa9a9a9)
	case object Firebrick extends Color(0xb22222)
	case object Deepskyblue extends Color(0x00bfff)
	case object Lightsteelblue extends Color(0xb0c4de)
	case object Chocolate extends Color(0xd2691e)
	case object Blueviolet extends Color(0x8a2be2)
	case object Cornflowerblue extends Color(0x6495ed)
	case object Goldenrod extends Color(0xdaa520)
	case object Floralwhite extends Color(0xfffaf0)
	case object Mediumvioletred extends Color(0xc71585)
	case object Mediumspringgreen extends Color(0x00fa9a)
	case object Oldlace extends Color(0xfdf5e6)
	case object Honeydew extends Color(0xf0fff0)
	case object Mediumblue extends Color(0x0000cd)
	case object Olivedrab extends Color(0x688e23)
	case object Slategray extends Color(0x708090)
	case object Cadetblue extends Color(0x5f9ea0)
	case object Orchid extends Color(0xda70d6)
	case object Teal extends Color(0x008080)
	case object Peru extends Color(0xcd853f)
	case object Orange extends Color(0xffa500)
	case object Palevioletred extends Color(0xd87093)
	case object Whitesmoke extends Color(0xf5f5f5)
	case object Tomato extends Color(0xff6347)
	case object Crimson extends Color(0xdc143c)
	case object Snow extends Color(0xfffafa)
	case object Darkcyan extends Color(0x008b8b)
	case object Indianred extends Color(0xcd5c5c)
	case object Cyan extends Color(0x00ffff)
	case object Black extends Color(0x000000)
	case object Wheat extends Color(0xf5deb3)
	case object Tan extends Color(0xd2b48c)
	case object Saddlebrown extends Color(0x8b4513)
	case object Gainsboro extends Color(0xdcdcdc)
	case object Darkkhaki extends Color(0xbdb76b)
	case object Red extends Color(0xff0000)
	case object Blue extends Color(0x0000ff)
	case object Midnightblue extends Color(0x191970)
	case object Navajowhite extends Color(0xffdead)
	case object Coral extends Color(0xff7f50)
	case object Darkblue extends Color(0x00008b)
	case object Purple extends Color(0x800080)
	case object Lightblue extends Color(0xadd8e6)
	case object Darkviolet extends Color(0x9400d3)
	case object Lightgreen extends Color(0x90ee90)
	case object Blanchedalmond extends Color(0xffebcd)
	case object Darkgreen extends Color(0x006400)
	case object Moccasin extends Color(0xffe4b5)
	case object Ivory extends Color(0xfffff0)
	case object Lightskyblue extends Color(0x87cefa)
	case object Dimgray extends Color(0x696969)
	case object Greenyellow extends Color(0xadff2f)
	case object Khaki extends Color(0xf0e68c)
	case object Thistle extends Color(0xd8bfd8)
	case object Aliceblue extends Color(0xf0f8ff)
	case object Darkorchid extends Color(0x9932cc)
	case object Mistyrose extends Color(0xffe4e1)
	case object Magenta extends Color(0xff00ff)
	case object Papayawhip extends Color(0xffefd5)
	case object Limegreen extends Color(0x32cd32)
	case object Darkturquoise extends Color(0x00ced1)
	case object Green extends Color(0x008000)
	case object Mediumauqamarine extends Color(0x66cdaa)
	case object Ghostwhite extends Color(0xf8f8ff)
	case object Powderblue extends Color(0xb0e0e6)
	case object Springgreen extends Color(0x00ff7f)
	case object Sienna extends Color(0xa0522d)
	case object Darkorange extends Color(0xff8c00)
	case object Brown extends Color(0xa52a2a)
	case object Forestgreen extends Color(0x228b22)
	case object Peachpuff extends Color(0xffdab9)
	case object Lightseagreen extends Color(0x20b2aa)
	case object Mintcream extends Color(0xf5fffa)
	case object Lightslategray extends Color(0x778899)
	case object Fuchsia extends Color(0xff00ff)
	case object Darkolivegreen extends Color(0x556b2f)
	case object Steelblue extends Color(0x4682b4)
	case object Salmon extends Color(0xfa8072)
	case object Lemonchiffon extends Color(0xfffacd)
	case object Linen extends Color(0xfaf0e6)
	case object deeppink extends Color(0xff1493)
	case object Darkgoldenrod extends Color(0xb8860b)
	case object Lightcyan extends Color(0xe0ffff)
	case object White extends Color(0xffffff)
	case object Dodgerblue extends Color(0x1e90ff)
	case object Pink extends Color(0xffc0cb)
	case object Gold extends Color(0xffd700)
	case object Mediumorchid extends Color(0xba55d3)
	case object Lime extends Color(0x00ff00)
	case object Lavender extends Color(0xe6e6fa)
	case object Olive extends Color(0x808000)
	case object Lightyellow extends Color(0xffffe0)

}
