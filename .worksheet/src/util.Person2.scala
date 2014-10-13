package util

class Person(firstName: String, lastName: String) {
	
	println("the constructor begins")
	// some class fields
	private val HOME = System.getProperty("user.home")
	var age = 0
	// some methods
	override def toString = s"$firstName $lastName is $age years old"
	def printHome { println(s"HOME = $HOME") }
	def printFullName { println(this) }  // uses toString
	printHome
	printFullName
	println("still in the constructor")
	
}
case class Person2(var name : String, var age: Int)

object worksheet2 {
  println("Welcome to the Scala worksheet")
  
  def doubleif(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) {
	if (test1 && test2) {
	codeBlock
	}
	}
	doubleif(17<18)(13<14)(println("hhaha"))
	val p = new Person("jim","jerry")
	p.age = 30
	println(p.age)
	p.age_$eq(29)
	println(p.age)
	class Pers(name : String ){ def getName{println(name)}}
	val per = new Pers("jing")

  
	
	
	
	
	
	
	
 
}
