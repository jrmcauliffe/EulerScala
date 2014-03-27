package org.birchavenue.projecteuler

import scala.math.BigInt

object Problem3 extends App {

  val target = 600851475143L
  
  def factors(n: Long): List[Long] = {
  (2 to math.sqrt(n).toInt).find(n % _ == 0).map(i => i.toLong :: factors(n / i)).getOrElse(List(n))
  }

  val result = factors(target).last
  
  println(result)
  
}