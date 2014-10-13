/*
 * ¿ØÖÆÁ÷Á·Ï°
 */
object ControlTest {
  
  def main(args: Array[String]) {
  
    val map = Map("tom" -> 20,"Jerry" -> 34)
    for((k,v) <- map) print(s"k : ${k}\t v: ${v} \t")
    val a = Array("apple","pear","banana")
    a.foreach(i => println(i.toUpperCase()))
    val a2 = Array.ofDim[Int](2,2)
    a2(0)(0) = 0
    a2(0)(1) = 1
    a2(1)(1) = 2
    a2(1)(0) = 1
    
    for{
      i <- 0 until 2
      j <- 0 until 2 
    } println(s"($i)($j) = ${a2(i)(j)}")
    
    val s = readLine("what do you want: ")
    s match {
      case "start" | "go" => println("starting")
      case "stop" | "quit" => println("ending")
      case _ => println("doing nothing")
    }  
   
}
  

}