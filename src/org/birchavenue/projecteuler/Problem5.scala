package org.birchavenue.projecteuler

object Problem5 extends App {
    
  val numbers = (1 to 20).toList
  
  def isDivisible(i: Int, xs: List[Int]): Boolean = {
    xs.dropWhile(i % _ == 0).length == 0
  }

  val result = Stream.from(1).takeWhile(!isDivisible(_,numbers)).length+1
  
  println(result)

}