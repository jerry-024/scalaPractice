package util

import scala.xml.include.sax.Main
/*
object Work3 {
		println("Welcome to the Scala worksheet")
		def main(args: Array[String]){
			println("mulitude(1) value = " + mulitude(1))
			println("mulitude(2) value = " + mulitude(2))
		}
		var factor = 3
		val mulitude = (i: Int) => i * factor
}
*/
object Test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(477); 
   def main(args: Array[String]) {
      println( "muliplier(1) value = " +  multiplier(1) )
      println( "muliplier(2) value = " +  multiplier(2) )
   };System.out.println("""main: (args: Array[String])Unit""");$skip(18); 
   var factor = 3;System.out.println("""factor  : Int = """ + $show(factor ));$skip(42); 
   val multiplier = (i:Int) => i * factor;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ))}
}
