package com.algo.scala.sorts.insertion

object InsertionSort {

  // TODO make changes to have type parameter
  def isort(list: List[Int]): List[Int] =
    if (list.isEmpty) Nil else insert(list.head, list.tail)

  def insert(v: Int, list: List[Int]): List[Int] =
    if (list.isEmpty || v < list.head) v :: list
    else
      list.head :: insert(v, list.tail)

}
