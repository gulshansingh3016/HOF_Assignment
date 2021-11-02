package com.knoldus.SquareTest

import com.knoldus.Square.{SquareList, SquareListMap}
import org.scalatest.funsuite.AnyFunSuite

class SquareListTest extends AnyFunSuite{

  val list = List(2,4,5,8,9)
  val empty = List()

  val squarelist = new SquareList
  val squareListmap = new SquareListMap

  test("Elements of a list should be squared"){
    assert(squarelist.squareList(list) == list.map(math.pow(_, 2)))
  }

//HOf
  test("Element of list squared using map higher order function"){
    assert(squareListmap.squareList(list) == list.map(math.pow(_, 2)))
  }

  test("Empty list return empty list"){
    assert(squarelist.squareList(empty) == empty)
  }

}
