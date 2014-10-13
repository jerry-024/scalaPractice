package util
import math.abs
object exercise {
 
		val tolerance = 0.0001            //> tolerance  : Double = 1.0E-4
		def isClosedEnough(x: Double, y: Double) =
			abs((x - y) / x) / x < tolerance
                                                  //> isClosedEnough: (x: Double, y: Double)Boolean
  	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  		def iterate(guess: Double): Double = {
  			val next = f(guess)
  			if(isClosedEnough(guess,next)) next
  			else iterate(next)
  		
  		}
  				iterate(firstGuess)
  	}                                         //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  	
  	def sqrt(x: Double) = fixedPoint(y => (y + x / y)/ 2)(1)
                                                  //> sqrt: (x: Double)Double
    sqrt(2)                                       //> res0: Double = 1.4142135623746899
    
  	
}