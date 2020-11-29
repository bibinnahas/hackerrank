package hackerrank

object HashMapSetTest extends App {
  val n = 9
  val ar = Array(10, 20, 20, 10, 30, 10, 20, 50)
  val result = scala.collection.mutable.HashSet[(Int, Int)]()
  for (i <- ar.indices) {
    for (j <- (i + 1) until ar.length) {
      result += ar(i) -> ar(j)
      result += ar(j) -> ar(i)
    }
  }
  val mResult = ar.groupBy(identity).mapValues(_.length)
  println(mResult)
}
