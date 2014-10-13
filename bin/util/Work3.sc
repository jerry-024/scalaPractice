package util

import scala.xml.include.sax.Main
import scala.xml.include.sax.Main

object Work3 {
		var factor = 3                    //> factor  : Int = 3
		val mulitude = (i: Int) => i * factor
                                                  //> mulitude  : Int => Int = <function1>
		def main(args: Array[String]){
			println("mulitude(1) value = " + mulitude(1))
			println("mulitude(2) value = " + mulitude(2))
		}                                 //> main: (args: Array[String])Unit
		
}