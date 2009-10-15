package es.elv.kobold
import NWN._
import Implicits._

package events {
	/** Sent out whenever a GameObject gets added to the cache. */
	case class OnCached(o: G) extends Event

	/** Sent out whenever a GameObject gets invalidated in the cache. */
	case class OnInvalidated(o: G) extends Event
}

abstract class GSelector[K <: G] {
}

abstract class GFactory[K <: G](val objectType: ObjectType) extends GSelector[K] {
	protected def create(resref: String, where: Location, useAnimation: Boolean, newTag: String) = {
		val r = G[G](R.proxy.createObject(objectType, resref, where, useAnimation, newTag))
		if (r.valid()) {
			r.ll("koboldCreatedAt") = System.currentTimeMillis
			postCreate(r.asInstanceOf[K])
		}
		r
	}

	def apply(resref: String, where: Location): G =
		apply(resref, where, false, "")
	def apply(resref: String, where: Location, useAnimation: Boolean): G =
		apply(resref, where, useAnimation, "")
	def apply(resref: String, where: Location, useAnimation: Boolean, newTag: String): G =
		create(resref, where, useAnimation, newTag)

	/** Override this for post-creation hook. Note that this will not fire if instanciation fails. */
	protected def postCreate(o: K) {}
}

abstract class GRefFactory[K <: G](objectType: ObjectType, val resref: String)
		extends GFactory[K](objectType) {

	def apply(where: Location): G =
		apply(where, false, "")
	def apply(where: Location, useAnimation: Boolean): G =
		apply(where, useAnimation, "")
	def apply(where: Location, useAnimation: Boolean, newTag: String): G =
		create(resref, where, useAnimation, newTag)
}

abstract class GRefTagFactory[K <: G](objectType: ObjectType, resref: String, val tag: String)
		extends GRefFactory[K](objectType, resref) {

	override def create(resref: String, where: Location, useAnimation: Boolean, newTag: String) =
		super.create(resref, where, useAnimation, tag)
}

object G {
	private val log = Kobold.logger()

	private val cache: collection.mutable.Map[Long, G] =
		collection.mutable.Map()

	private val invalidationTime = Kobold.config.getLong("G.invalidateInvalidAfter")
	private val invalidationOneshotTime = Kobold.config.getLong("G.invalidateOneshotAfter")

	def getCache = cache

	private var objectClasses: List[(NWObject, Boolean, ObjectType, String, String) => Option[G]] = List()

	/**
		Register a factory that produces instances of G.
		You need to be as specific as possible in your matching, or you will break something.
		Return Some(your G) if you want to handle this NWObject with your class.
		Return None if the given NWObject does not match your custom class.
		The parameters passed in are: NWObject, getIsObjectValid, ObjectType, ResRef, Tag
	*/
	def registerCustomClass(factory: (NWObject, Boolean, ObjectType, String, String) => Option[G]) =
		objectClasses = factory :: objectClasses

	private[kobold] def registerObjectClass(factory: (NWObject, Boolean, ObjectType, String, String) => Option[G]) =
		objectClasses = objectClasses ::: List(factory)

	GCoreClasses.registerAll

	/** Invalidate a GameObject and send out an event saying so. */
	private def invalidate(l: Long) = if (cache.contains(l)) {
		val o = cache(l)
		events.EventSource send events.OnInvalidated(o)
		cache -= l
	}

	/** Internal helper for cache invalidation. */
	private def invalidateConditional(l: Long) = if (cache.contains(l))
		if ((cache(l).cacheCount < 2 && cache(l).objAge > invalidationOneshotTime) ||
			(cache(l).objAge > invalidationTime && !cache(l).valid()))
				invalidate(l)

	/**
		Purge the whole cache, removing invalid objects.
		This is a potentially expensive operation.
		Not needed for normal usage.
	*/
	def purgeCache = for ((l,g) <- cache) invalidateConditional(l)

	/**
		Unconditionally clears out the whole cache.
	*/
	def clearCache = for ((l,g) <- cache)
		invalidate(l)

	def clearCachedProperties(p: cachedproperty.CachePolicy.CachePolicy) =
		cache.foreach((k) => k._2.clearCachedPropertiesByPolicy(p))

	def apply[K <: G](n: Long): K =
		apply[K](new NWObject(n))

	def apply[K <: G](o: NWObject): K = {
		invalidateConditional(o.id)

		val x = if (!cache.contains(o.id)) {
			val valid = R.proxy.getIsObjectValid(o)
			val objectType = R.proxy.getObjectType(o)
			val resRef = R.proxy.getResRef(o)
			val tag = R.proxy.getTag(o)

			def selectClass(facList: List[ (NWObject, Boolean, ObjectType, String, String) => Option[G] ]): Option[G] = {
				for (fact <- facList)
					try {
						fact(o, valid, objectType, resRef, tag) match {
							case Some(g) => return Some(g)
							case None =>
						}
					} catch {
						case p: IllegalArgumentException => {
							log.error("while trying to produce: %08x=%s valid=%s ref=%s tag=%s".format(o.id, valid.toString, objectType, resRef, tag), p)
							throw p
						}
					}
				return None
			}

			val kk: G = selectClass(objectClasses) match {
				case Some(g) => g
				case None => throw new Exception("Cannot produce for %08x=%s valid=%s ref=%s tag=%s".format(o.id, valid.toString, objectType, resRef, tag))
			}

			log.debug("%08x=%s valid=%s ref=%s tag=%s -> %s".format(o.id, valid.toString, objectType.toString, resRef, tag, kk.toString))

			kk.valid setNoUpdate valid
			kk.objectType setNoUpdate objectType
			kk.resref setNoUpdate resRef
			kk.tag setNoUpdate tag

			if (kk.cacheClassInstances) {
				events.EventSource send events.OnCached(kk)
				cache(o.id) = kk
			}

			kk.asInstanceOf[K]
		} else {
			cache(o.id).asInstanceOf[K]
		}

		x.cacheCount += 1
		x
	}

	/**
		Returns the first object with the given tag.
	*/
	def byTag(tag: String): G = byTag(tag, 0)

	/**
		Returns the nth object with the given tag.
	*/
	def byTag(tag: String, index: Int): G =
		G(R.proxy.getObjectByTag(tag, index))

	/**
		Returns a list of all objects with the given tag.
	*/
	def allByTag(tag: String): List[G] =
		R.proxy.allByTag(tag).map(G(_)).toList

	/**
		Returns all objects with the given tag of the given klass.
	*/
	def allByTag[K <: G](tag: String, klass: Class[K]): List[K] =
		R.proxy.allByTag(tag).map(x => G[G](x)).
			filter(x => klass.isAssignableFrom(x.getClass)).
			map(x => x.asInstanceOf[K]).toList

}

abstract case class G private[kobold] (wrapped: NWObject) extends cachedproperty.CachedProperties with ActionQueue {
	import cachedproperty.CachePolicy._
	import cachedproperty._

	defaultCachePolicy = Kobold.config.getString("G.defaultCachePolicy") match {
		case "indef" => cachedproperty.CachePolicy.Indef
		case "event" => cachedproperty.CachePolicy.Event
		case "none" => cachedproperty.CachePolicy.None
	}

	/** override this to false in your custom classes to prevent Kobold from caching
		them. Usually not needed. */
	val cacheClassInstances = true

	/** The number of times this instance had been accessed through the cache (Usually in events,
		thus representing the usage). */
	private[kobold] var cacheCount = 0

	val objCreatedAt = System.currentTimeMillis
	def objAge = System.currentTimeMillis - objCreatedAt

	lazy val koboldCreatedAt = ll("koboldCreatedAt")

	val objectType = P(Indef, () => R.proxy.getObjectType(this))

	def ensureObjectType(o: ObjectType*) {
		val m = (o contains objectType()) || (objectType() == ObjectType.InvalidObject)

		require(m, "expect one of " + o.toString + ", got: " + objectType().toString)
	}

	val resref = P(Indef, () => R.proxy.getResRef(this))
	val tag: RWCachedProperty[String] = P(Indef, () => R.proxy.getTag(this), (t: String) => { nwnx.Funcs.setTag(this, t); this.tag.clear() })

	val valid = P( () => R.proxy.getIsObjectValid(this) )

	val name: RWCachedProperty[String] = P(() => R.proxy.getName(this, false), (n: String) => { R.proxy.setName(this, n); this.name.clear() })
	val originalName = P(() => R.proxy.getName(this, true))

	def copy(toLocation: Location, toInventory: G): G =
		G(R.proxy.copyObject(this, toLocation, toInventory, ""))

	def destroy: Unit = destroy(0f)
	def destroy(delay: Float): Unit =
		R.proxy.destroyObject(this, delay)

	val ls   = P(new LocalStringMap(this))
	val li   = P(new LocalIntMap(this))
	val ll   = P(new LocalLongMap(this))
	val lb   = P(new LocalBoolMap(this))
	val lo   = P(new LocalObjectMap(this))
	val lf   = P(new LocalFloatMap(this))
	val lv   = P(new LocalVectorMap(this))
	val llo  = P(new LocalLocationMap(this))

	protected def toStringProperties = List(if (valid()) "valid" else "invalid", "ref=" + resref(), "tag=" + tag())
	override def toString = getClass.getName.toString + "(" + (wrapped.id.toHexString :: "name=" + name() :: toStringProperties).mkString(",") + ")"
}
