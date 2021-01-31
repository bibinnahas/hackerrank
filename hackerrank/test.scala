package hackerrank

import java.io._

object test {

  def main(args: Array[String]) {
//    println("xxxxx: "+(1 & -1))
//    println("xxxxx: "+(2 & -2))
//    println("xxxxx: "+(3 & -3))
//    println("xxxxx: "+(4 & -4))
//    println("xxxxx: "+(5 & -5))
//    println("xxxxx: "+(6 & -6))
//    println("xxxxx: "+(7 & -7))
//    println("xxxxx: "+(8 & -8))
    val a = 5
    var id = a
    id += (id & -id)
    println(id)
    var id1 = a
    id1 -= (id1 & -id1)
    println(id1)
  }
}
