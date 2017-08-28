

import scala.io._


import scala.math._


object ScalaFunction {
	def main(args: Array[String]) {


		def getSum(num1 : Int = 1, num2 : Int = 2) : Int = {
			return num1 + num2
		}

		def formula(num1 : Int = 1, num2 : Int = 2) : Int = {
			return num1 + num2 * 10
		}

		println("5 + 4 = " + getSum(5,4));

		println("formula : " + formula(num1 = 5, num2 = 4));
		println("formula : " + formula(num2 = 5, num1 = 4));


		def sayHi() : Unit = {
			println("HELLO")
		}
		sayHi


		def getSumAll(args: Int*) : Int = {
			var sum : Int = 0

			for (num <- args) {
				sum += num
			}
			sum
		}

		println("Get sum all : " + getSumAll(1,2,3,4,5))

		def factorial(num : BigInt) : BigInt = {
			if (num <= 1)
				1
			else
				num * factorial(num -1)
		}

		println("Factorial of 5 = " + factorial(5))



		// higher order function
		val log10Func = log10 _

		println(log10Func(1000))


		List(1000.0, 10000.0).map(log10Func).foreach(println)

		List(1,2,3,4,5).map((x : Int) => x * 50).foreach(println)

		List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)


		def time3(num : Int) = num * 3
		def time4(num : Int) = num * 4

		def multIt(func : (Int) => Double, num : Int) = {
			func(num)
		}

		printf("3 * 100 = %.1f\n", multIt(time3, 100))


		val divisorVal = 5
		val divisor5 = (num : Double) => num / divisorVal

		// closure
		println("5/5 = " + divisor5(5.0))

	}


}







