package org.sternenfall.kobold

import es.elv.kobold._
import es.elv.kobold.events._
object ChatColors extends Plugin {
	private val EmoteColorRX = """\*(.*)\*""".r

	private val dtextColor = color.Color(config.getString("colors.text"))
	private val demoteColor = color.Color(config.getString("colors.emote"))
	private val demphasisColor = color.Color(config.getString("colors.emphasis"))
	private val demphEmoteColor = color.Color(config.getString("colors.emoteEmphasis"))

	private val allowPlayerOverride = config.getBoolean("allowPlayerOverride")

	def colorize(t: String, textColor: color.Color, emoteColor: color.Color, emphasisColor: color.Color,
			emphEmoteColor: color.Color, mod: (color.Color) => color.Color): String = {
		var inEmote = false
		var inEmphasis = false

		if (t.substring(0, 1) == "#")
			return mod(textColor) + t.substring(1)

		val chars = t.split("").toList.drop(1)
		mod(textColor) + chars.map(ch =>
			ch match {
				case "*" => {
					inEmote = !inEmote
					if (inEmote)
						mod(emoteColor) + ch
					else
						ch + (if (inEmphasis)
							mod(emphasisColor)
						 else
							mod(textColor))
				}
				case "_" => {
					inEmphasis = !inEmphasis
					if (inEmphasis)
						if (inEmote)
							mod(emphEmoteColor)
						else
							mod(emphasisColor)
					else
						if (inEmote)
							mod(emoteColor)
						else
							mod(textColor)

				}
				case n => n
			}
		).mkString
	}

	def ovr(talker: Creature, to: G, text: String, mode: Int, mod: (color.Color) => color.Color) {
		val te = if (allowPlayerOverride && talker.li("colorOverrideText") > 0) new color.Color(talker.li("colorOverrideText")) else dtextColor
		var em = if (allowPlayerOverride && talker.li("colorOverrideEmote") > 0) new color.Color(talker.li("colorOverrideEmote")) else demoteColor
		var ep = if (allowPlayerOverride && talker.li("colorOverrideEmph") > 0) new color.Color(talker.li("colorOverrideEmph")) else demphasisColor
		var ee = if (allowPlayerOverride && talker.li("colorOverrideEmphemote") > 0) new color.Color(talker.li("colorOverrideEmphEmote")) else demphEmoteColor

		val t = colorize(text, te, em, ep, ee, mod)
		val chan = mode + (if (R.proxy.getIsDM(talker.wrapped)) 16 else 0)
		nwnx.Chat.speakToChannel(talker, chan, t, to)
		nwnx.Chat.suppress(talker)
	}

	def listen(event: Event) = event match {
		case OnChatTalk(talker: G with Creature, text: String) =>
			if (!event.stopped) ovr(talker, Invalid(), text, 1, c => c)

		case OnChatWhisper(talker: G with Creature, text: String) =>
			if (!event.stopped) ovr(talker, Invalid(), text, 3, c => c.darken(75))

		/*case OnChatPrivate(talker: G with Creature, target: G with Creature, text: String) =>
			ovr(talker, target, "#" + text, 4, c => c)*/

		case _ =>
	}
}
