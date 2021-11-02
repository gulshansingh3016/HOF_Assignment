package com.knoldus.Square

object SquareRun extends App{

  val square = new SquareList
  println(square.squareList(List(1,3,2,4,5,6)))

  val squareHOF = new SquareListMap
  println(squareHOF.squareList(List(2,9,4,5)))
}