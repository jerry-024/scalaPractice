class Ration(a : Int,b : Int) {
  
  private def gcd(x : Int , y : Int) : Int = {
    if(x == 0) y
    else if(x < 0) gcd(-x , y)
    else if(y < 0) gcd(x,-y)
    else gcd(y%x,x)
  }
  private val g = gcd(a,b)
  val number = a/g
  val denom = b/g
  def +(that : Ration) = new Ration(number * that.denom + that.number * denom , denom * that.denom)
  def -(that :Ration) = new Ration(number * that.denom - that.number * denom , denom * that.denom)
  def *(that :Ration) = new Ration(number * that.number , denom * that.denom)
  def /(that:Ration) =
    new Ration(number * that.denom, denom * that.number)

  override def toString() =
    "Rational: [" + number + " / " + denom + "]"
}

object runRation extends App {
  val r1 = new Ration(1,2)
  val r2 = new Ration(2,6)
  val r3 = r1 + r2
  val r4 = r1 - r2
  val r5 = r1 * r2
  val r6 = r1 / r2
  Console.println(s"r1 = ${r1}")
  Console.println(s"r2 = ${r2}")
  Console.println(s"r3 = ${r3}")
  Console.println(s"r4 = ${r4}")
  Console.println(s"r5 = ${r5}")
  Console.println(s"r6 = ${r6}")
}