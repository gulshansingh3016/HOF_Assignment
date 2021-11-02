package com.knoldus.Square

class SquareList extends Square{
  override def squareList(xs: List[Int]): List[Int] =
    xs match {
      case List() => List()
      case y :: ys => y * y :: squareList(ys)
    }
}