import org.scalatest._
import org.scalatest.matchers._
import es.elv.kobold._

class EngineStructsSpec extends Spec with ShouldMatchers {
	describe("Vector") {
		it("calculates the correct magnitude") {
			val v = Vector(1, 0, 0)
			v.magnitude should equal (1)
			v.magnitude should equal (Math.sqrt(v.dot(v)))
		}

		it("should calculate the proper distance") {
			val a = Vector(0, 0, 0)
			val b = Vector(1, 0, 0)
			a.distanceTo(b) should equal (1)
		}

		it("should calculate the proper angle") {
			Vector(1, 1, 0).angle should equal (0.7853981633974484)
			Vector(0, 0, 0).angle should equal (0)
		}

		it("should equal properly") {
			val a = Vector(0, 0, 0)
			val b = Vector(1, 0, 0)
			a should not equal (b)
			a should not equal (Vector(0, 0, 0.00001))
			a should equal (a)
		}

		it("should add properly") {
			(Vector(1,0,0) + Vector(1,1,0)) should equal (Vector(2,1,0))
		}
		it("should substract properly") {
			(Vector(1,2,0) - Vector(1,1,0)) should equal (Vector(0,1,0))
		}

	}
}
