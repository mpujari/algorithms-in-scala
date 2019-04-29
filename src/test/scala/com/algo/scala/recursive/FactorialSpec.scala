package com.algo.scala.recursive

import org.scalatest.FlatSpec
import com.algo.scala.recursive.Factorial._

class FactorialSpec extends FlatSpec {

  val values = Map(
    1 -> 1,
    2 -> 2,
    3 -> 6,
    5 -> 120,
    10 -> (2 to 10).product,
    30 -> (2 to 30).product
  )

  "factorial test with fact0" should "pass" in {
    values foreach { e =>
      assert(fact0(e._1) == e._2)
    }
  }

  "factorial test with fact1" should "pass" in {
    values foreach { e =>
      assert(fact1(e._1) == e._2)
    }
  }

  "factorial test with fact2" should "pass" in {
    values foreach { e =>
      assert(fact2(e._1) == e._2)
    }
  }

  "factorial test with fact3" should "pass" in {
    values foreach { e =>
      assert(fact3(e._1) == e._2)
    }
  }

}
