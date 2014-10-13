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


object worksheet2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(505); 
  println("Welcome to the Scala worksheet");$skip(118); 
  
  def doubleif(test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit) {
	if (test1 && test2) {
	codeBlock
	}
	};System.out.println("""doubleif: (test1: => Boolean)(test2: => Boolean)(codeBlock: => Unit)Unit""");$skip(42); 
	doubleif(17<18)(13<14)(println("hhaha"));$skip(35); 
	val p = new Person("jim","jerry");System.out.println("""p  : util.Person = """ + $show(p ));$skip(12); 
	p.age = 30;$skip(16); 
	println(p.age);$skip(15); 
	p.age_$eq(29);$skip(16); 
	println(p.age)
	class Pers(name : String ){ def getName{println(name)}};$skip(85); 
	val per = new Pers("jing");System.out.println("""per  : util.worksheet2.Pers = """ + $show(per ))}

  
	
	
	
	
	
	
	
 
}
