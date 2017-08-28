
// https://youtu.be/DzFt0YkZo8M
// 46:00


import scala.io._
import scala.collection.mutable.ArrayBuffer


object ScalaClass {
	def main(args: Array[String]) {

		// val rover = new Animal
		// rover.setName("Rover")
		// rover.setSound("Woof")
		// printf("%s says %s\n", rover.getName, rover.getSound)

		// val whiskers = new Animal("Whiskers", "Meow")
		// println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")

		// println(whiskers.toString)

		// val spite = new Dog("Spike", "Woof", "Grrrr")
		// spite.setName("Spike")
		// println(spite.toString)



		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0
		println(fang.move)


		val superman = new Superhero("Superman")
		println(superman.fly)
		println(superman.hitByBullet)
		println(superman.ricochet(2500))

	}

	// no static variable
	// primary constructor
	class Animal(var name: String, var sound: String) {

		// protected var name = "No Name"

		this.setName(name)

		val id = Animal.newIdNum

		def getName() : String = name
		def getSound() : String = sound

		def setName(name : String) {
			// to protect data : no decimal
			if (!(name.matches(".*\\d+.*"))) {
				this.name = name
			} else {
				this.name = "No Name"
			}
		}
		def setSound(sound : String) {
			this.sound = sound
		}

		def this(name: String) {
			this("No Name", "No Sound")
			this.setName(name)
		}
		def this() {
			this("No Name", "No Sound")
		}

		override def toString() : String = {
			return "%s with the id %d says %s".format(this.name, this.id, this.sound)
		}
	}

	object Animal {
		private var idNumber = 0
		private def newIdNum = { idNumber += 1; idNumber }
	}

	// inherit
	class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
		def this(name: String, sound: String) {
			this("Name", sound, "No Growl")
			this.setName(name)
		}
		def this(name: String) {
			this("No Name", "No Sound", "No Growl")
			this.setName(name)
		}
		def this() {
			this("No Name", "No Sound", "No Growl")
		}
		override def toString() : String = {
			return "%s with the id %d says %s of %s".format(this.name, this.id, this.sound, this.growl)
		}
	}

	// abstract class : cannot create object with itself
	abstract class Mammal(val name: String) {
		var moveSpeed : Double
		def move : String
	}

	class Wolf(name: String) extends Mammal(name) {
		var moveSpeed = 35.0
		def move = "This wolf %s runs %.2f mph".format(this.name, this.moveSpeed)

	}


	// trait (cf. java interface)

	trait Flyable {
		def fly : String
	}


	trait BulletProof {
		def hitByBullet : String

		def ricochet(startSpeed : Double) : String = {
			"The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
		}
	}

	class Superhero(val name: String) extends Flyable with BulletProof {
		def fly = "%s flys through the air".format(this.name)
		def hitByBullet = "The bullet bounces off of %s".format(this.name)
	}


}


























