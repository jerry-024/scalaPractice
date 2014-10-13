package util
import math.abs
object exercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
 
		val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(81); 
		def isClosedEnough(x: Double, y: Double) =
			abs((x - y) / x) / x < tolerance;System.out.println("""isClosedEnough: (x: Double, y: Double)Boolean""");$skip(238); 
  	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  		def iterate(guess: Double): Double = {
  			val next = f(guess)
  			if(isClosedEnough(guess,next)) next
  			else iterate(next)
  		
  		}
  				iterate(firstGuess)
  	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(64); 
  	
  	def sqrt(x: Double) = fixedPoint(y => (y + x / y)/ 2)(1);System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 
    sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(32); val res$1 = 
		List(1,2,3).reduceLeft(_ - _);System.out.println("""res1: Int = """ + $show(res$1));$skip(33); val res$2 = 
		List(1,2,3).foldLeft(0)(_ - _);System.out.println("""res2: Int = """ + $show(res$2))}
		
		
		
    
    
  	
}
