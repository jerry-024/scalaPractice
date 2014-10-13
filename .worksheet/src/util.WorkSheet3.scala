package util
class Person{
	case class person(var name: String,var age: Int)
	object Person{
	
		def apply() = new Person("<no name>", 0)
		def apply(name: String) = new Person(name, 0)
	}
}
object WorkSheet3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(254); 
  println("Welcome to the Scala worksheet")}
}
