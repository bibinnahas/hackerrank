package hackerrank

object SockMerchant {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    val mResult = ar.groupBy(identity).mapValues(_.length)
    mResult.values.map(a => a/2).sum
  }

  def main(args: Array[String]): Unit = {
    val n = 4
    val ar = Array(3, 2, 3, 3, 3)
    println(sockMerchant(n, ar))
  }

}
