package org.birchavenue.projecteuler

object Problem1 extends App {

  println(filterSum(1 to 999))

  def filterSum(r: Range[Int]): Int = r.filter(n => n % 5 == 0 || n % 3 == 0).sum
}
