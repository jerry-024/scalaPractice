
  
  class Animal2 private (val name: String){
    override def toString = "hello, i am a animal"
  }
  object Animal2{
    
    val animal = new Animal2("dog")
    def getInstance = animal
  }


object singleTonTest extends App{
  val animal = Animal2.getInstance
  println(animal)
  val animal2 = Animal2.getInstance
  println(animal2.equals(animal))
}