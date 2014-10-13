object Test1 {

  def main(args: Array[String]): Unit = {
    println(List(1 , 2, 3).map { i =>
      Some(i)
    })
    def foo(xOption: Option[String]) = {
      xOption match {
        case Some(str) => println(str)
        case None => println("Пе")
      }
    }
  }
}