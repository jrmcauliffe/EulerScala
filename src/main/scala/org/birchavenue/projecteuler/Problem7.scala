package org.birchavenue.projecteuler

import scala.collection.mutable.PriorityQueue

object Problem7 extends App {

//  val wheel0: Stream[Long] = 1 #:: wheel0
//  val wheel2: Stream[Long] = 2 #:: wheel2
//  val wheel23: Stream[Long] = 2 #:: 4 #:: wheel23
//  val wheel235: Stream[Long] = 4 #:: 2 #:: 4 #:: 2 #:: 4 #:: 6 #:: 2 #:: 6 #:: wheel235
//  val wheel2357: Stream[Long] = 2 #:: 4 #:: 2 #:: 4 #:: 6 #:: 2 #:: 6 #:: 4 #:: 2 #:: 4 #:: 6 #:: 6 #:: 2 #:: 6 #:: 4 #:: 2 #:: 6 #:: 4 #:: 6 #:: 8 #:: 4 #:: 2 #:: 4 #:: 2 #::
//    4 #:: 8 #:: 6 #:: 4 #:: 6 #:: 2 #:: 4 #:: 6 #:: 2 #:: 6 #:: 6 #:: 4 #:: 2 #:: 4 #:: 6 #:: 2 #:: 6 #:: 4 #:: 2 #:: 4 #:: 2 #:: 10 #:: 2 #:: 10 #:: wheel2357
//
//  def spin(n: Long, xs: Stream[Long]): Stream[Long] = n #:: spin(n + xs.head, xs.tail)
//  def sieve(xs: Stream[Long]): Stream[Long] = xs.head #:: sieve((xs.tail) filter (_ % xs.head != 0))
//
//  def genuineSieve(xs: Stream[Long]): Stream[Long] = {
//
//    case class Iter(next: Long, prime: Long) extends Ordered[Iter] {
//      def compare(that: Iter) = that.next compare this.next
//    }
//
//    val table = new PriorityQueue[Iter]
//
//    def gs(xs: Stream[Long]): Stream[Long] = {
//
//      table.isEmpty match {
//        case true => {
//          table.enqueue(Iter(xs.head * xs.head, xs.head))
//          xs.head #:: gs(xs.tail)
//        }
//        case false => {
//          val castOff = new PriorityQueue[Iter]
//          while (table.max.next <= xs.head) {
//            val x = table.dequeue
//            castOff.enqueue(x)
//            table.enqueue(Iter(x.prime + x.next, x.prime))
//          }
//          castOff.isEmpty match {
//            case true => {
//              table.enqueue(Iter(xs.head * xs.head, xs.head))
//              xs.head #:: gs(xs.tail)
//
//            }
//
//            case _ => castOff.min.next == xs.head match {
//              case true => gs(xs.tail)
//              case _ => {
//                table.enqueue(Iter(xs.head * xs.head, xs.head))
//                xs.head #:: gs(xs.tail)
//              }
//
//            }
//          }
//        }
//
//      }
//
//    }
//
//    gs(xs)
//
//  }
//
//  val result = genuineSieve(2 #:: 3 #::5 #::7 #:: spin(11, wheel2357))
//
//  println(result.take(1000).toList)
}