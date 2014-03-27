package org.birchavenue.projecteuler

object Problem1 extends App {
  
  val result = (1 to 999).toList.filter(n => n % 5 == 0 || n % 3 == 0).sum
  println(result)
  
}