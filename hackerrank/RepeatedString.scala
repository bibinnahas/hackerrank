package hackerrank

object RepeatedString {
//
//  def repeatString(c: String, n: Long): String = {
//    def helper(c: String, n: Long, acc: String): String = {
//      if (n == 0) acc
//      else helper(c, n - 1, acc + c)
//    }
//    helper(c, n, "")
//  }

  def main(args: Array[String]): Unit = {
    val s = "a"
    val n = 100000000000L
    val i = n / s.length
    val numA = s.toList.count(_ == 'a')
    val rem = (n % s.length).toInt
    val numARem = s.substring(0, rem).toList.count(_ == 'a')
    val t = (numA * i) + numARem
    print(t)
  }
}
