package com.algo.scala.recursive

import scala.annotation.tailrec

object Factorial {

  // Using function literal
  def fact0(n: Int): Int = {
    lazy val f0: ((Int, Int) => Int) = (n, p) =>  { if(n <= 1) p else f0(n - 1, n * p) }
    if (n <= 1) 1 else f0(n, 1)
  }

  // using def tailrec
  def fact1(n: Int): Int = {
    @tailrec def f1(n: Int, p: Int): Int = if(n <= 1) p else f1(n - 1, n * p)
    if (n <= 1) 1 else f1(n, 1)
  }

  // default impl
  def fact2(n: Int): Int = {
    if (n <= 1) 1 else n * fact2(n - 1)
  }

  // ;)
  def fact3(n: Int): Int = (2 to n).product

}