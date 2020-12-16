package hackerrank

object HourGlassTwoDArray {

  def main(args: Array[String]): Unit = {
    val mymultiarr= Array.ofDim[Int](6, 6)
    //Assigning the values
    mymultiarr(0)(0) = 1
    mymultiarr(0)(1) = 1
    mymultiarr(0)(2) = 1
    mymultiarr(0)(3) = 2
    mymultiarr(0)(4) = 0
    mymultiarr(0)(5) = 0
    mymultiarr(1)(0) = 0
    mymultiarr(1)(1) = 1
    mymultiarr(1)(2) = 3
    mymultiarr(1)(3) = 0
    mymultiarr(1)(4) = 0
    mymultiarr(1)(5) = 0
    mymultiarr(2)(0) = 1
    mymultiarr(2)(1) = 1
    mymultiarr(2)(2) = 1
    mymultiarr(2)(3) = 0
    mymultiarr(2)(4) = 0
    mymultiarr(2)(5) = 0
    mymultiarr(3)(0) = 19
    mymultiarr(3)(1) = 20
    mymultiarr(3)(2) = 21
    mymultiarr(3)(3) = 22
    mymultiarr(3)(4) = 23
    mymultiarr(3)(5) = 24
    mymultiarr(4)(0) = 25
    mymultiarr(4)(1) = 26
    mymultiarr(4)(2) = 27
    mymultiarr(4)(3) = 28
    mymultiarr(4)(4) = 29
    mymultiarr(4)(5) = 30
    mymultiarr(5)(0) = 31
    mymultiarr(5)(1) = 32
    mymultiarr(5)(2) = 33
    mymultiarr(5)(3) = 34
    mymultiarr(5)(4) = 35
    mymultiarr(5)(5) = 36

    for (i <- 1 to 4) {
      val j = (i - 1, i, i + 1)
      val l = List(mymultiarr(j._1)(j._1), mymultiarr(j._1)(j._2),mymultiarr(j._1)(j._3),mymultiarr(j._2)(j._2),mymultiarr(j._3)(j._1)
        ,mymultiarr(j._3)(j._2),mymultiarr(j._3)(j._3))
      println(l.sum)
      }
    }
}
