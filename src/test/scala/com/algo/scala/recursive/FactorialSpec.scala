package com.algo.scala.recursive

import org.scalatest.FlatSpec

class FactorialSpec extends FlatSpec {

  "factorial test with fact0" should "pass" in {
    assert(Factorial.fact0(1) == 1)
    assert(Factorial.fact0(2) == 2)
    assert(Factorial.fact0(3) == 6)
    assert(Factorial.fact0(5) == 120)
    assert(Factorial.fact0(10) == (2 to 10).product)
    assert(Factorial.fact0(30) == (2 to 30).product)
  }

  "factorial test with fact1" should "pass" in {
    assert(Factorial.fact1(1) == 1)
    assert(Factorial.fact1(2) == 2)
    assert(Factorial.fact1(3) == 6)
    assert(Factorial.fact1(5) == 120)
    assert(Factorial.fact1(10) == (2 to 10).product)
    assert(Factorial.fact1(30) == (2 to 30).product)
  }

  "factorial test with fact2" should "pass" in {
    assert(Factorial.fact2(1) == 1)
    assert(Factorial.fact2(2) == 2)
    assert(Factorial.fact2(3) == 6)
    assert(Factorial.fact2(5) == 120)
    assert(Factorial.fact2(10) == (2 to 10).product)
    assert(Factorial.fact2(30) == (2 to 30).product)
  }

  "factorial test with fact3" should "pass" in {
    assert(Factorial.fact3(1) == 1)
    assert(Factorial.fact3(2) == 2)
    assert(Factorial.fact3(3) == 6)
    assert(Factorial.fact3(5) == 120)
    assert(Factorial.fact3(10) == (2 to 10).product)
    assert(Factorial.fact3(30) == (2 to 30).product)
  }


}
