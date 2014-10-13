package util
case class person(var name: String,var age: Int)
object Person{

	def apply() = new Person("<no name>", 0)
	def apply(name: String) = new Person(name, 0)
}
object WorkSheet3 {
  println("Welcome to the Scala worksheet")
}
