/*
object Timer1 {

  def oncePerSecond () : Unit = {
    
    while(true){
      println("Time flies when you're having fun(ctionally)...")
      Thread.sleep(1000)
    }
  }
  def oncePerSecond2(callback : () => Unit) :Unit = {
    
    while(true){
      callback()
      Thread.sleep(1000)
      
    }
  }
  def timerFile () : Unit = println("Time flies when you're having fun(ctionally)...")
  def main(args: Array[String]) {
  
    oncePerSecond2(() => println("Time flies when you're having fun(ctionally)...") )
}
}

*/
object Timer1
{
  def main(args: Array[String]): Unit = {
    args.filter( (arg:String) => arg.startsWith("G") )
        .foreach( (arg:String) => Console.println("Found " + arg) )
  }
}