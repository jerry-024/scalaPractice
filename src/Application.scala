object Application {
  
  def generateException(){
    println("Generating exception");
    throw new Exception("Generating exception")
  }
  
  def main(args: Array[String]) {
    {
      tryWithLogging{
        generateException
      }
      println("Exiting Main()");
    }
    def tryWithLogging(s: Any){
      try {
        s
      }
       catch{
         case ex: Exception => ex.printStackTrace()
       }
    }
  }

}
