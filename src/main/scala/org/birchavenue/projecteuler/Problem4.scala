package org.birchavenue.projecteuler

object Problem4 extends App {

  val numbers = (1 to 999).toList
  val searchSpace = numbers.flatMap(x => numbers.map(_*x))
  
  def isPalindrome(s: String) = {
    s == s.reverse
  }
  
  val result = searchSpace.filter(n => isPalindrome(n.toString)).sorted.last
  
  println(result)
  
}