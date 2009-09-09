package es.elv.kobold {
	import NWN._

	object Implicits {
		implicit def eff2nweff(n: Effect): NWEffect = n.toNWEffect
		implicit def iprpj2nwiprp(n: ItemProperty): NWItemProperty = n.toNWItemProperty
		implicit def go2nwobj(n: G): NWObject = n.wrapped

		implicit def loc2nwloc(l: Location): NWLocation = new NWLocation(l.area.wrapped,
			l.position.x, l.position.y, l.position.z, l.facing)

		implicit def nwloc2loc(l: NWLocation): Location = {
			new Location(G[G](l.area) match {
				case x: Area => x
				case x: Invalid => NoArea()
			}, Vector(l.x, l.y, l.z), l.facing)
		}
		implicit def nwloc2loc(l: NWVector): Vector = new Vector(l.x, l.y, l.z)
		implicit def vec2nwvec(l: Vector): NWVector = new NWVector(l.x, l.y, l.z)

		// implicit def ivec2vec(v: (Double, Double, Double)) = Vector(v._1, v._2, v._3)
	}
}
