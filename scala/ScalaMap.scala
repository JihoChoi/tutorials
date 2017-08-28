
// https://youtu.be/DzFt0YkZo8M


import scala.io._
import scala.collection.mutable.ArrayBuffer


object ScalaMap {
	def main(args: Array[String]) {

		// immutable
		val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")

		if (employees.contains("Manager")) {
			println("Manager : " + employees("Manager"))
		}

		// mutable
		val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "Sally Smith")
		println("customer 1 : " + customers(100))
		customers(102) = "Megan Swift"
		customers(100) = "Tom Marks"

		for ((k,v) <- customers) {
			printf("%d : %s\n", k, v)
		}



	}

}







