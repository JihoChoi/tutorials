
// https://youtu.be/DzFt0YkZo8M


import scala.io._

import java.io.PrintWriter

object ScalaTuple {
	def main(args: Array[String]) {

		val writer = new PrintWriter("test.txt")
		writer.write("sample text\nsome more random text")
		writer.close()

		val textFromFile = Source.fromFile("test.txt", "UTF-8")

		val lineIterator = textFromFile.getLines

		for( line <- lineIterator) {
			println(line)
		}
	}

}







