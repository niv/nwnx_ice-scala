package es.elv.kobold
import NWN._
import Implicits._
import events._

/**
	A base trait for managing NWObject action queues.
*/
trait ActionQueue {
	this: G =>

	/**
		Assign a block of code to run in this
		objects' context.
		Roughly equivalent to AssignCommand()
	*/
	def assign(what: => Unit) {
		R assign (this, what)
	}

	/**
		Assign a block of code to run in this
		objects' context after delay milliseconds.
		Roughly equivalent to DelayCommand()
	*/
	def after(delay: Long, what: => Unit) {
		R delay (this, delay.toFloat / 1000, what)
	}

	/** Clear the action queue on this object, including combat state. */
	def clearActions: Unit = clearActions(true)

	/** Clear the action queue on this object. */
	def clearActions(combatToo: Boolean) = assign {
		R.proxy.clearAllActions(combatToo)
	}

	/** Queue a wait action on this object. */
	def doWait(msec: Long) = assign {
		R.proxy.actionWait(msec.toFloat / 1000)
	}

	/** Returns the current Action this object is busy with. */
	def currentAction = R.proxy.getCurrentAction(this)

	/** Alias for !busy */
	def idle = !busy

	/** Returns true if this object is doing anything except standing around. */
	def busy = currentAction != Action.InvalidAction

	/** Queue a lock action on this object. */
	def doLock(what: G with Lock) = assign {
		R.proxy.actionLockObject(what)
	}
}
