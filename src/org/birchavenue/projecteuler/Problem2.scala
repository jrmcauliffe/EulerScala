package org.birchavenue.projecteuler

object Problem2 extends App {

  val fibs: Stream[Long] = 1 #:: 2 #:: fibs.zip(fibs.tail).map { n => n._1 + n._2 }
  val result = fibs.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum
  
  println(result)
  
}