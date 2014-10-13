object NumberTest {
  
  /*
   * 1 将字符串转为Int
   */
  def toInt(str : String) : Option[Int] ={
    try {
    		Some(str.toInt)
    	} catch {
    	  case e : NumberFormatException => None
    	}
  }
 /*
  * 判断两数是否相等
  */
  def ~=(x : Double,y : Double,presion : Double ) = {
    if((x - y).abs < presion)true 
    else false
    
  }
    
  def main(args: Array[String]) {
  
    val a = NumberTest.toInt("123").head
    val b = NumberTest.toInt("abc")
    println(s"a = ${a},b = ${b}")
    val aString = "aa"
    toInt(aString) match {
    	
      case Some(n) => println(n)
      case None => println("bow, this is not number")
    
  }
    val a1 = 0.1 + 0.2
    println(s"~=(a1,0.3,0.001)=${~=(a1,0.3,0.001)}")
    
    val r = new scala.util.Random
    val range = 0 to r.nextInt(10)
    range.foreach(println)
    val r1 = r.nextPrintableChar
    println(f"r1 = ${r1} ")
    
}

}