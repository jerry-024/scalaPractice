class SumTest {
  
  def sum (f : Int => Int , a : Int , b : Int) : Int =
    
    if (a > b) 0
     else f(a) + sum(f,a+1,b)
     
  def sumInt(a : Int, b: Int) = sum(id,a,b) 
  def sumCubes(a : Int,b: Int) = sum(cube,a,b)
  def sumFactorials(a : Int,b: Int) = sum(fact,a,b)
  
  def id(x : Int) : Int = x
  def cube(x : Int) : Int = x * x * x
  def fact(x : Int) : Int = if (x == 0) 1 else fact(x - 1)
  
 

}
 object sumTestMain2 extends App{
    val sumTest = new SumTest()
    println("sumTest.sumInt(2, 1)---"+sumTest.sumInt(2, 3))
    println("sumTest.sumCubes(2, 1)---"+sumTest.sumCubes(2, 3))
    println("sumTest.sumFactorials(2, 1)---"+sumTest.sumFactorials(2, 3))
  }