
// https://youtu.be/DzFt0YkZo8M


import scala.io._

import java.io.PrintWriter

object ScalaExceptionHandling {
	def main(args: Array[String]) {


		def dividNums(num1 : Int, num2 : Int) = try {
			(num1 / num2)
		} catch {
			case ex : java.lang.ArithmeticException => "Cannot divide by zero"
		} finally {
			// clean up after exception
		}

		println("3/0 = " + dividNums(3, 0))
	}

}







