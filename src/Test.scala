
object Test {
  
   abstract class Amount
   case class Dollar(value : Double) extends Amount
   case class Currency(value : Double,uint : String) extends Amount
   case object Nothing extends Amount
   
   def main(args: Array[String]) {
     
    def getValue(x:Any) = {
       x
     } 
    val amt = getValue(new Dollar(12.2)) 
    amt match {
      case Dollar(v) => println("$"+v)
      case Currency(_,u) => println("oh noes, I got"+u)
      case Nothing => println("")
    }
  /*
  class Pair[T<% Ordered[T]](val first : T , val second : T){
    
    def smaller = if (first < second) first else second 
  }
 
    
    val pair = new Pair("aa","bb");
    println(pair.smaller)
    
    */
    /*
    	def until(condition : => Boolean)(block : => Unit){
			if(!condition){
				
				  block
				  until(condition)(block)
			  }
		}
	  
	    def indexOf(input : String , ch : Char) : Int = {
	      
	      var i = 0
	      until(i == input.length()){
	        if(input(i) == ch) return i
	        i +=1
	      }
	      return -1
	      
	    }
	    
	    //print(indexOf("nihao",'h'))
	    def digits(n : Int) : Set[Int] = {
	      if(n < 0) digits(-n)
	      else if (n < 10) Set(n)
	      else digits( n / 10) + (n % 10)
	    }
	    
	    digits(12345023).foreach(println)
	}
*/
    /*
    val name = List("jerry","rose","tom")
    def ulCase(s:String) = Vector(s.toLowerCase(),s.toUpperCase())
    name.map(ulCase).foreach(println)
    name.flatMap(ulCase).foreach(println)
    
    */
   //val a =  List(1,2,3,4,5).reduceRight(_-_)
   //println(a)
    /*
   val freq = scala.collection.mutable.Map[Char,Int]()
   for(c <- "Mississippi") {
     println(c+"----"+freq.getOrElseUpdate(c, 0))
     freq(c) = freq.getOrElseUpdate(c, 0) + 1
     println(c+"----"+freq(c))
   }
   freq.foreach(println)
   
   */
    /*
    val prices = List(10.2,12.5,15.2)
    val quantities = List(10,2,1)
    val list = (prices zip quantities) map {p => p._1*p._2}
    list.foreach(println)
    */
   // def numsFrom(n: BigInt) : Stream[BigInt] = n #:: numsFrom(n+1) 
    //val squares = numsFrom(1).map(x => x*x)
    //println(squares.take(5).force)
    //val tenOrMore = numsFrom(10);
    //println(tenOrMore.tail.tail.tail)
    //for(i <- (0 until 100).par) yield println(i + " ")
    //def getMiddle[T](a : Array[T]) :T = a(a.length/2)
    //getMiddle(Array("jerry","lucy","rose")).foreach(print)
   // val f = getMiddle[String] _
  /*
    def firstLast[A,C](it : C)(implicit ev: C <:< Iterable[A]) = (it.head , it.last)
    
    println(firstLast(List(1,2,3))_2)
    */
     /*
   val scores = scala.collection.mutable.Map("tom" -> 100,"jerry" -> 120,"bob" -> 90)
   
   
   def changeScore(name : String,newScore : Int) = {
    	 scores + (name -> newScore);
   }
   def getScore(name : String) : Int = {
     scores.getOrElse(name, 0)
    // if(scores.contains(name)) scores(name)
     // else 0
   } 
   
   val name = "tom"
   println(changeScore(name, 10))
   val score = getScore(name)
   println(score) 
   scores.foreach(println)
   * 
   */
     /*
    val names = Array("tom","jerry","rose","hahah")
    val scores = Array(100,87,89)
    val pairs = names zip scores
    val pairs2 = names.zip(scores)
    pairs.foreach(println)
    pairs2.foreach(println)
    * 
    */
     /*
     val list = List(1,2,3,4)
     def sum(lst : List[Int]) : Int = lst match{
       
       case Nil => 0
       case h :: t => h + sum(t)
     } 
     println(sum(list))
     * 
     */
     //var tet = (0 -> 0)
     /*
     val pair2 = Array((0,2),(1,3)).toList
     pair2.foreach(println)
     pair2.foreach(x => x._1)
     
     pair2.map {
       case (0, _) => println("0 ...")
       case _ => println("neither is 0")  
     }
   
     val pair = Map(0 -> 0,1->2)
     pair.map{ aa => aa match{
       case (0, _) => println("0 ...")
       case _ => println("neither is 0")  
     }
     }
     
     val list = List(1,2,3,4) match {
       case head :: others => {
    	   <a href="" class="hover">{ head }</a> ++ {
    		   others.map { other =>
    		     <a href="">{ other }</a>
    		   }
    	   }
       } 
       case  _ => Nil
     }
     list.foreach(println)
     */
     /*
     val name = "123"
     val obj = name
     def getValue(x:Any) = {
       x
     }
     val a = getValue("aa")
     a match {
       case x: Int => println("Int")
       case y: String => println("String") 
       case z: BigInt => Int.MaxValue
       case _ => 0
     }
     */
     /*
     Array(1,2,3) match{
       case Array(1) => println("Array(0)")
       case Array(1,_*) => println("Array(1,_*)")
       case _ => println("default")
     }
     val list = List(1,2,3)
     list match {
       
       case 1 :: Nil => println("Array(0)")
       case 1 :: tail => println("Array(1,_*)")
     }
     * 
     */
     /*
     val pattern = "([0-9]+) ([a-z]+)".r
     "33 bottle" match {
       case pattern(num,item) => println("num---"+num+"\nitem---"+item)
       case _ => "hhahah"
     }
     * *
     */
     val (a,b) = BigInt(10) /% 3
     println((a,b))
  }
}