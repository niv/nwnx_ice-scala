package org.sternenfall.kobold

import NWN._
import es.elv.kobold._
import es.elv.kobold.events._

object FixHide extends Plugin {
	private val hideWaitTime = config.getLong("hideWaitTime")
	private val hideDenyMessage = config.getString("hideDenyMessage")
	private val hideAttemptsWarn = config.getInt("hideAttemptsWarn")
	private val hideAttemptsPunish = config.getInt("hideAttemptsPunish")
	private val hideAttemptsWarnMessage = config.getString("hideAttemptsWarnMessage")
	private val hideAttemptsPunishMessage = config.getString("hideAttemptsPunishMessage")

	def listen(event: Event) = event match {
		case OnCreatureToggleMode(o: Creature, ActionMode.StealthMode, true) => {
			val diff = System.currentTimeMillis - o.ll("lastHideActivation")
			val attempts = o.li("lastHideActivationAttempts") + 1
			if (diff < hideWaitTime) {
				o message hideDenyMessage.format((hideWaitTime - diff).toDouble / 1000)
				o.li("lastHideActivationAttempts") = attempts
				
				if (hideAttemptsPunish > 0 && attempts >= hideAttemptsPunish) {
					o message hideAttemptsPunishMessage
					o <+ (Effect.knockdown.supernatural, 30f)
				}

				if (hideAttemptsWarn > 0 && attempts >= hideAttemptsWarn)
					o message hideAttemptsWarnMessage

				nwnx.Events.suppress
			} else {
				o.ll("lastHideActivation") = System.currentTimeMillis
				o.li("lastHideActivationAttempts") = 0
			}
		}
		case _ =>
	}
}
