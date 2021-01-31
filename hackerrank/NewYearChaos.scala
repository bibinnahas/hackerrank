package hackerrank

import scala.annotation.tailrec

object NewYearChaos {

  def rotateArray(A: Array[Int], K: Int): Array[Int] = {
    if (A.isEmpty) A
    else rotate(A.toList, K).toArray
  }

  def rotateStepwise(l: List[Int]) = {
    l.take(l.size - 1).+:(l.last)
  }

  def rotate(l: List[Int], K: Int): List[Int] = {
    if (K == 0) l
    else rotate(rotateStepwise(l), K - 1)
  }

  def minimumBribes(q: Array[Int], size: Int) = {
    var tempArray = Array[Int]()
    tempArray = q

    @tailrec
    def helperMethod(q: Array[Int], indexVal: Int, temp: Int, acc: Int): Int = {
      if (indexVal == size) acc
      else if ((q.indexOf(indexVal) == temp))
        helperMethod(q.tail, indexVal + 1, 0, acc)
      else if ((q.indexOf(indexVal) == temp + 2)) {
        tempArray = q
        var tempVariable = q(0)
        var secTempVariable = q(1)
        tempArray(0) = indexVal
        tempArray(1) = tempVariable
        tempArray(2) = secTempVariable
        helperMethod(tempArray.tail, indexVal + 1, 0, acc + 2)
      }
      else if ((q.indexOf(indexVal) == temp + 1)) {
        tempArray = q
        var tempVariable = q(0)
        var secTempVariable = q(1)
        tempArray(0) = secTempVariable
        tempArray(1) = tempVariable
        helperMethod(tempArray.tail, indexVal + 1, 0, acc + 1)
      }
      else
        helperMethod(rotateArray(q, q.size - q.indexOf(indexVal)).tail, indexVal + 1, 0, acc + q.indexOf(indexVal))
    }

    helperMethod(q, (q.size - (q.size - 1)), 0, 0)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val t = stdin.readLine.trim.toInt
    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt
      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      val chaos = q.zipWithIndex.map { case (x, i) => x - i - 1 }.filter(_ > 2).size > 0
      if (chaos) println("Too chaotic")
      else println(minimumBribes(q, q.size))
    }
  }

}