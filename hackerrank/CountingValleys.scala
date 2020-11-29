package hackerrank

import scala.annotation.tailrec

object Result {

  def CountingValleys(steps: Int, path: String): Int = {
    val ar = path.toCharArray
    @tailrec
    def helper (steps: Int, ar: Array[Char], prevDepth: Int, depth: Int, counter: Int, valley: Int): Int = {
      if (counter == 0 && prevDepth == -1 && depth == 0) valley + 1
      else if (counter == 0) valley
      else {
        if ((ar(steps - counter) == 'U') && (prevDepth == -1) && (depth == 0)) {
          helper(steps, ar, depth, depth + 1, counter - 1, valley + 1)
        }
        else if ((ar(steps - counter) == 'D') && (prevDepth == -1) && (depth == 0)) {
          helper(steps, ar, depth, depth - 1, counter - 1, valley + 1)
        }
        else if (ar(steps - counter) == 'U') {
          helper(steps, ar, depth, depth + 1, counter - 1, valley)
        }
        else {
          helper(steps, ar, depth, depth - 1, counter - 1, valley)
        }
      }
    }
    helper(steps, ar, 0, 0, ar.size, 0)
    }
  }

object Solution {
  def main(args: Array[String]): Unit = {
    val steps = 8
    val path = "UDDDUDUU"
    val result = Result.CountingValleys(steps, path)
    println(result)
  }
}
