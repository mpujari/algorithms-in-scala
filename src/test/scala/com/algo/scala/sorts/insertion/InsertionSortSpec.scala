package com.algo.scala.sorts.insertion

import org.scalatest.FlatSpec

import com.algo.scala.sorts.insertion.InsertionSort._

class InsertionSortSpec extends FlatSpec {

  "empty list sort" should "return empty list" in {
    assert(isort(List()) == List())
  }

  "list with 1 element" should "sort the list" in {
    assert(isort(List(1)) == List(1))
  }

  "list with 2 element" should "sort the list" in {
    assert(isort(List(1, 2)) == List(1, 2))
    assert(isort(List(2, 1)) == List(1, 2))
  }

  "list which is already sorted" should "same list" in {
    assert(isort(List(1, 2, 3)) == List(1, 2, 3))
  }

  "unordered list" should "get sorted" in {
    assert(isort(List(3, 1, 2)) == List(1, 2, 3))
  }

}
