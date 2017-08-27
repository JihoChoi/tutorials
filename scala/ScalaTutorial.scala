// https://youtu.be/DzFt0YkZo8M
// 8/27/2017

import scala.io.StdIn.{readLine, readDouble}
import scala.math._




object ScalaTutorial {
	def main(args: Array[String]) {
		var i = 0;

		while (i <= 10) {
			println(i)
			i += 1;
		}

		do {
			println(i)
			i += 1
		} while (i <= 20)


		val randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		// until vs to
		for (i <- 0 until randLetters.length) {
			println(randLetters(i))
		}

		var aList = List(1, 2, 3, 4, 5)
		for (i <- aList) {
			println(i)
		}


		var evenList = for { i <- 1 to 20
			if (i % 2) == 0
			} yield i

		for (i <- evenList) {
			println(i);

		}

		println("=======================");

		for (i <- 1 to 5; j <- 6 to 10 ) {
			println("i:" + i + " j:" + j)
		}


		// break, continue are not supported in scala
		def printPrimes() {
			val primeList = List(1, 2, 3, 5, 7, 11)
			for (i <- primeList) {

				if (i == 11) {
					return
				}
				if (i != 1) {
					println(i)
				}
			}
		}

		printPrimes


		// var numberGuess = 0
		// var numberGuess2 = 0.0
		// do {
		// 	print("Guess a number ")
		// 	numberGuess = readLine.toInt
		// 	numberGuess2 = readDouble
		// } while ((numberGuess != 1) || (numberGuess2 != 2))

		val name = "Jiho"
		val age = 25
		val weight = 180.5

		println(s"Hello $name")
		println(f"I am ${age + 1} and weigh $weight%.2f")

		printf("'%5d'\n", 5)
		printf("'%-5d'\n", 5)
		// %c %d %f %s

	}
}






