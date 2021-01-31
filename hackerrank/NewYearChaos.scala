package hackerrank

object NewYearChaos {

  def minimumBribes(q: Array[Int]) = {
    var tempArray = Array[Int]()
    tempArray = q

    def helperMethod(q: Array[Int], indexVal: Int, temp: Int, acc: Int): Int = {
      //      println(tempArray.toList)
      if (temp >= q.size - 1) {
        println("in ZERO")
        acc
      }
      else if ((q.indexOf(indexVal) == temp)) {
        println("in ONE")
        println(q.toList)
        println(q.tail.toList)
        println("indexVal: " + indexVal)
        println("acc: " + acc)
        helperMethod(q.tail, indexVal + 1, 0, acc)
      }
      else if (q.indexOf(indexVal) == temp + 2) {
        println("in TWO")
        println(tempArray.toList)
        var tempVariable = q(0)
        var secTempVariable = q(1)
        tempArray(0) = indexVal
        tempArray(1) = tempVariable
        tempArray(2) = secTempVariable
        println(tempArray.tail.toList)
        println("indexVal: " + indexVal)
        println("acc: " + (acc + 2))
        helperMethod(tempArray.tail, indexVal + 1, 0, acc + 2)
      }
      else if (q.indexOf(indexVal) == temp + 1) {
        println("in THREE")
        tempArray = q
        println(tempArray.toList)
        var tempVariable = q(0)
        var secTempVariable = q(1)
        tempArray(0) = secTempVariable
        tempArray(1) = tempVariable
        println(tempArray.tail.toList)
        println("indexVal: " + indexVal)
        println("acc: " + (acc + 1))
        helperMethod(tempArray.tail, indexVal + 1, 0, acc + 1)
      }
      else {
        println("in FOUR")
        println("indexVal: " + indexVal)
        println(q.toList)
        println("acc: " + (acc + 1))
        helperMethod(q, indexVal, temp + 1, acc + 1)
      }
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
      else println(minimumBribes(q))
    }
  }

}