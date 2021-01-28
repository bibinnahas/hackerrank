package hackerrank

object NewYearChaos {

  def minimumBribes(q: Array[Int]) {
    val bit = new Fenwick(q.max)
    println(bit.tree.toList)
    println(bit.update(3, 5))

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt
      val q = stdin.readLine.split(" ").map(_.trim.toInt)
      val chaos = q.zipWithIndex.map { case (x, i) => x - i - 1 }.filter(_ > 2).size > 0
      if (chaos) println("Too chaotic")
      else minimumBribes(q)
    }
  }

  class Fenwick(val size: Int) {
    var tree: Array[Int] = Array.fill(size + 1)(0)

    def update(idx: Int, value: Int): Unit = {
      var id = idx
      while (id <= size) {
        tree(id) += value
        id += (id & -id)
      }
    }
  }

}

