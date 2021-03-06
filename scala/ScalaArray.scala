

import scala.io._
import scala.collection.mutable.ArrayBuffer


object ScalaArray {
	def main(args: Array[String]) {


		val friends = Array("Bob", "Tom")
		friends(0) = "Sue"
		println("Best friends " + friends(0))


		val friends2 = ArrayBuffer[String]()

		friends2.insert(0, "Phil")
		friends2 += "Mark"
		friends2 ++= Array("Susy", "Paul")
		friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")
		friends2.remove(1, 2) // second index two item

		var friend : String = " "
		for (friend <- friends2) {
			println(friend)
		}

		val favNums = new Array[Int](20)

		for (j <- 0 to (favNums.length - 1)) {
			favNums(j) = j
			println(favNums(j))
		}

		val favNumsTime2 = for (num <- favNums) yield 2 * num
		favNumsTime2.foreach(println)

		var favNumsDiv4 = for (num <- favNums if num %4 == 0) yield num
		favNumsDiv4.foreach(println)


		var multTable = Array.ofDim[Int](10, 10)

		for ( i <- 0 to 9) {
			for ( j <- 0 to 9) {
				multTable(i)(j) = i * j;
			}
		}
		for ( i <- 0 to 9) {
			for ( j <- 0 to 9) {
				printf("%d : %d = %d\n", i, j, multTable(i)(j))
			}
		}

		println("Sum : " + favNums.sum)
		println("Sum : " + favNums.min)
		println("Sum : " + favNums.max)

		val sortedNums = favNums.sortWith(_>_)
		println(sortedNums.deep.mkString(", "))



	}

}







