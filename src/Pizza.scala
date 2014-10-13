class Pizza {

  var crustSize = 12
  var crustType = "Thin"
  var who = "jerry" 
  def update(crustSize: Int,crustType: String , who: String){
    this.crustSize = crustSize
    this.crustType = crustType
    this.who = who
  }  
  override def toString = {
    
    "A %d inch %s crust pizza is %s.".format(crustSize, crustType , who)
}
  
  
}
object PizzaTest extends App{
  val p = new Pizza
  println(p)
  p.update(13, "heihei","jing")
  println(p)
  p.update(crustType = "hahah",crustSize = 15,who = "tom")
  println(p)
}