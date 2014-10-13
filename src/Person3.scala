case class Person3(var userName: String,var password: String){
  var age = 0
  var firstName = ""
  var lastName = ""
  var address: Option[Address] = None 
  
}
case class Address(city: String,state: String)

object test4 extends App{
  val i = 5
  val p = Person3("jing","jing")
  p.address = Some(Address("sh","sh"))
  p.address.foreach { a =>
	println(a.city)
	println(a.state)
}
  test4.i
}
