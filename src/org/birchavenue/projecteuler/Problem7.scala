package org.birchavenue.projecteuler

object Problem7 extends App {

  def primes: Stream[Int] = {

    def findNextPrime(primes: List[Int]) = {
      var i = primes.head + 1
      while (primes.exists(x => i % x == 0)) { i += 1 }
      i
    }

    def prim(primes: List[Int]): Stream[Int] = primes match {
      case Nil => 2 #:: prim(List(2))
      case _ => {
        val next = findNextPrime(primes)
        next #:: prim(next :: primes)
      }
    }

    prim(Nil)
  }

  val result = primes.drop(10000).head

  println(result)
}