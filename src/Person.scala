case class Person2(var name: String,var age: Int)
	object Person2{
	
		def apply() = new Person2("<no name>", 0)
		def apply(name: String) = new Person2(name, 0)
	}
  
  object caseClasstest extends App{
	 val a = Person2()  // corresponds to apply()
	 val b = Person2("Pam")  // corresponds to apply(name: String)
	 val c = Person2("William Shatner", 82)
	 println(a)
	 println(b)
	 println(c)
	 a.name = "jing"
	 a.age = 12
	 println(a)
	} 