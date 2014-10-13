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


object worksheet2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def doubleif(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) {
	if (test1 && test2) {
	codeBlock
	}
	}                                         //> doubleif: (test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit)Unit
	doubleif(17<18)(13<14)(println("hhaha"))  //> hhaha
	val p = new Person("jim","jerry")         //> the constructor begins
                                                  //| HOME = C:\Users\jing
                                                  //| jim jerry is 0 years old
                                                  //| still in the constructor
                                                  //| p  : util.Person = jim jerry is 0 years old
	p.age = 30
	println(p.age)                            //> 30
	p.age_$eq(29)
	println(p.age)                            //> 29
	class Pers(name : String ){ def getName{println(name)}}
	val per = new Pers("jing")                //> per  : util.worksheet2.Pers = util.worksheet2$$anonfun$main$1$Pers$1@17df01a
                                                  //| 0

  
	
	
	
	
	
	
	
 
}