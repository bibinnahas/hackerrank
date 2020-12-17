package hackerrank
import java.io._

object ArrayLeftRotation {

  // Complete the rotLeft function below.
//  def rotateArray(A: Array[Int], K: Int): Array[Int] = {
//    if (A.isEmpty) A
//    else rotate(A.toList, K).toArray
//  }
//
//  def rotate(l: List[Int], K: Int): List[Int] = {
//    if (K == 0) l
//    else rotate(rotateStepwise(l), K - 1)
//  }
//
//  def rotateStepwise(l: List[Int]) = {
//    //l.take(l.size - 1).+:(l.last)
//    l.tail ++ l.take(1)
//  }
//
//  def recursiveRotateStepwise(l: List[Int], n: Int): List[Int] = {
//    def helper(l: List[Int], n: Int, acc: List[Int]): List[Int] = {
//      if (n == 0) acc
//      else helper(rotateStepwise(l), n - 1, rotateStepwise(l))
//    }
//    helper(l, n, List())
//  }

  def rotateArraySlice(ll: Array[Int], n: Int, d: Int): Array[Int] = {
    ll.slice(d, n) ++ ll.slice(0, d)
  }

  def main(args: Array[String]) {

    val stdin = scala.io.StdIn
    //val printWriter = new PrintWriter(sys.env.getOrElse("OUTPUT_PATH",""))
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val nd = stdin.readLine.split(" ")
    val n = nd(0).trim.toInt
    val d = nd(1).trim.toInt
    val a = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = rotateArraySlice(a, n, d)
    //val t1 = System.nanoTime
    //println(result.toList)
    printWriter.println(result.mkString(" "))
    printWriter.close()
    //println((System.nanoTime - t1))


  }
}
