package com.knoldus.Square

class SquareListMap extends Square {
  override def squareList(xs: List[Int]): List[Int] = xs.map(n => n * n)
}
