

object HelloWorld {
  
  val ary = List(1,2,3,4,5,6,7,8,9)
  
  val strList = List("東京都","神奈川県","千葉")
  
  def main(args: Array[String]): Unit = {
//     for(e <- ary){
//       println(e)
//     }
//     println("---------")
//     
//     ary.foreach {e => println(e)}
     
//     println("---------")
//     ary.zipWithIndex.foreach { case(e: Int, i: Int) => println("%d: %s".format(i, e)) }
//     
     println("---------")
     println(strList.toString())
     strList.zipWithIndex.foreach{ case(e: String, i: Int) => println("%d: %s".format(i, e))}


  }
  
}
