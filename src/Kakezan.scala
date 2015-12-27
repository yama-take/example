
object Kakezan {
  
  val ary = List(1,2,3,4,5,6,7,8,9)
  
  def main(args: Array[String]): Unit = {

     println("--掛け算の実行！！-------")
     val maxval = ary.max * ary.max
     val headerSpace = makeBlank(maxval.toString().length() + 1)
     ary.zipWithIndex.foreach { case(e: Int, i: Int) => println(multipleLine(e, headerSpace)) }
  }
  
  def makeBlank(blankCnt: Int): String = {
    var blank = ""
    var i = 0
    while (i < blankCnt) {
      blank += " "
      i += 1
    }
    return blank
  }
  
  /*
   * 
   */
  def multipleLine(bosu: Int, space: String): String = {
    var line = ""
    var num = 0
    for (i <- 0 to ary.length-1) {
      num = bosu * (i +1)
      line +=  makeBlank(space.length() - num.toString().length()) + num
    }
    return line
  }
}
