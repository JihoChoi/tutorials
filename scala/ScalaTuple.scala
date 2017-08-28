
// https://youtu.be/DzFt0YkZo8M


import scala.io._
import scala.collection.mutable.ArrayBuffer


object ScalaTuple {
	def main(args: Array[String]) {

		var tupleMarge = (103, "Marge Simpson", 10.25)

		printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)

		tupleMarge.productIterator.foreach {i => println(i)}

		println(tupleMarge.toString())
	}

}







