import util._


class Co {
  /*
  def main(args: Array[String]) {
    val map = Map("newyork" -> "nicks","los" -> "laker")
    val basketteam = map.get("newtyork");
    println(basketteam);
    println(map.get("maami"));
  }
  
  */
 
     
}
object main extends App{
    println("Hello， World!")
    val tuple = ("jinglining",29,"man")
    println(tuple._1)
    val myVIPList = "Ted" :: "Amanda" :: "Luke" :: "Don" :: "Martin" :: Nil
    /*
    def count(VIPs : List[String]) : Int =
    {
      if (VIPs.isEmpty)
        0
      else
       
        count(VIPs.tail) + 1
    }
    
    */
    var foundAmanda = false
    def count(VIPs : List[String]) : Int =
    {
      VIPs match
      {
        case "Amanda" :: t =>
          System.out.println("Hey, Amanda!"); foundAmanda = true; count(t) + 1
        case h :: t => count(t) + 1//将提取列表头部并绑定到变量 h，而其余部分（尾部）则绑定到 t
        case Nil => 0
      }
    }
    println(count(myVIPList))
    
    import scala.annotation.tailrec
    
	def factorial(n: Int): Int = {
	@tailrec def factorialAcc(acc: Int, n: Int): Int = {
	if (n <= 1) acc
	else factorialAcc(n * acc, n - 1)
	}
	factorialAcc(1, n)
	}
    println("factorial(1)-----"+factorial(1))
 }