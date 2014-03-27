package org.birchavenue.projecteuler

object Problem6 extends App {

  val numbers = (1 to 100).toList
    
  def sumOfSquares(l: List[Int]) = l.map(x => x*x).sum
  def squareOfSums(l: List[Int]) = l.sum * l.sum

  val result = squareOfSums(numbers) - sumOfSquares(numbers)
  
  println(result)

}