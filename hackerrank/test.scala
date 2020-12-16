package hackerrank

import java.io._

object test {

  // Complete the hourglassSum function below.
  def hourglassSum(mymultiarr: Array[Array[Int]]): Int = {
    var acc = 0
    for (i <- 1 to 5) {
      val j = (i - 1, i, i + 1)
      for (iN <- 1 to 4) {
        if (j._3 != 6) {
          //val jN = (iN - 1, iN, iN + 1)
          val l = List(mymultiarr(iN - 1)(j._1), mymultiarr(iN - 1)(j._2),mymultiarr(iN - 1)(j._3),mymultiarr(iN)(j._2),mymultiarr(iN + 1)(j._1)
            ,mymultiarr(iN + 1)(j._2),mymultiarr(iN + 1)(j._3))
          if (l.sum > acc) {
            acc = l.sum
          }
        }
      }
    }
    acc
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val arr = Array.ofDim[Int](6, 6)
    for (i <- 0 until 6) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }
    println(hourglassSum(arr))
  }
}
