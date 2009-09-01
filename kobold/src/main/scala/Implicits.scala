package es.elv.kobold {
	import NWN._

	object Implicits {
		implicit def eff2nweff(n: Effect): NWEffect = n.toNWEffect
		implicit def iprpj2nwiprp(n: ItemProperty): NWItemProperty = n.toNWItemProperty
		implicit def go2nwobj(n: G): NWObject = n.wrapped

		implicit def loc2nwloc(l: Location): NWLocation = new NWLocation(l.area.wrapped, l.x, l.y, l.z, l.facing, 0f, 0f)
		implicit def nwloc2loc(l: NWLocation): Location = new Location(new Area(l.area), l.x, l.y, l.z, l.orientationX)
		implicit def vec2nwvec(l: Vector): NWVector = new NWVector(l.x, l.y, l.z)
		implicit def nwloc2loc(l: NWVector): Vector = new Vector(l.x, l.y, l.z)

		implicit def ivec2vec(v: (Double, Double, Double)) = new Vector(v._1, v._2, v._3)
	}
}
