import util.control.Breaks._
import scala.annotation.switch
object BreakAndContinueDemo extends App{

  println("----breakexample---")
  breakable{
    for(i <- 1 to 10){
      println(i)
      if(i > 4) break
    }
  }
  println("-----continueexample----")
  val searchKey = "peter pick pear"
  var numP = 0
  for(i <- 0 until searchKey.length){
    breakable{
      if(searchKey.charAt(i) != 'p') break else numP += 1
    }
  }
  println(s"p出现的次数：$numP")
  val count = searchKey.count(_ == 'p')
  println(s"count = $count")
  
  val i = 3
	val x = (i : @switch) match{
		case 1 => "One"
		case 2 => "two"
		case _ => None
	}
	println(s"x = $x")
	val numberToMonth = Map(
	    1 -> "January" ,
	    2 -> "February"
	)
	val MonthName = numberToMonth(1);
	println(s"MonthName:$MonthName")
}