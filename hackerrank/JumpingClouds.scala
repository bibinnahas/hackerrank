package hackerrank

import scala.annotation.tailrec

object JumpingClouds {

  def jumpingOnClouds(c: Array[Int]): Int = {
    val mainCounter = c.length - 1

    @tailrec
    def helper(c: Array[Int], acc: Int, count: Int, dec: Int): Int = {
      if (dec == 1) acc + 1
      else if (dec == 0) acc
      else if ((c(count - (dec - 1)) == 0) && (c(count - (dec - 2)) == 0)) {
        helper(c, acc + 1, count, dec - 2)
      }
      else if (c(count - (dec - 1)) != 0) {
        helper(c, acc + 1, count, dec - 2)
      }
      else if ((c(count - (dec - 1)) == 0) && (c(count - (dec - 2)) != 0)) {
        helper(c, acc + 1, count, dec - 1)
      }
      else {
        helper(c, acc, count, dec - 1)
      }
    }

    helper(c, 0, mainCounter, mainCounter)
  }

  def main(args: Array[String]): Unit = {
    val n = 6
    val c = Array(0, 0, 0, 0, 0, 0)
    val result = jumpingOnClouds(c)
    println(result)
  }
}
