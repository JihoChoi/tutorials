	
	// YouTube: JavaScript Fundamentals For Beginners
	// https://www.youtube.com/watch?v=vEROU2XtPR8



	// alert('File Linked');


	// #############################################################
	// Variables and Data Structure 
	// #############################################################
	document.write("<h3>Variables</h3><br>");

	// Number, String, Array, Object

	var test = "this is a test";
	var TEST = "THIS IS A TEST";
	document.write(test + "<br>");
	document.write(TEST + "<br>" + "<br>");

	// camel case
	var myFavoriteNumber;
	// partial case
	var MyFavoriteNumber;
	// underscore 
	var my_favorite_number;


	var colors = ["red", "blue", "green"];
	document.write(colors[0] + "<br>");
	document.write(colors[1] + "<br>");
	document.write(colors[2] + "<br>");
	document.write(colors[3] + "<br>");

	var colors2 = new Array("yellow", "orange");
	document.write(colors2[0] + "<br>");
	document.write(colors2[1] + "<br>");
	document.write(colors2[3] + "<br>" + "<br>");

	document.write(colors + "<br>");
	document.write(colors2 + "<br>");

	colors.push("purple");
	document.write(colors + "<br>" + "<br>");


	var numbers = [5, 77, 6, "seven", "Seven", 'eight', 1, 55];
	document.write(numbers + "<br>");
	document.write(numbers.length + "<br>");
	document.write(numbers.sort() + "<br>");
	document.write(numbers.reverse() + "<br>");


	// #############################################################
	// Loops
	// #############################################################
	document.write("<h3>Loops</h3><br>");

	console.log("Hello, Console Log");
	for (var i = 0; i < 10; i++) {
		// console.log(i);
	}

	var i = 0;
	while (i < 10) {
		// console.log(i);
		i++;
	}

	var numbers = [33, 54, 76, 32, 2, 6];
 
 	numbers.forEach( function(number){ 
 		// console.log(number); 
 	});
 	numbers.forEach( function(element){ 
 		// console.log(element); 
 	});

 	numbers.reverse()

	for (var i = 0; i < numbers.length; i++) {
		// console.log(numbers[i]);
	}


	// #############################################################
	// Conditionals
	// #############################################################
	document.write("<h3>Conditionals</h3><br>");

	// === checks data types also
	if (1 === 1) {
		console.log("1 === 1");
	} 
	var var1 = 3;
	var var2 = 4;
	if (var1 == var2 ) {
		console.log("var1 == var2");
	} else {
		console.log("var1 != var2");
	}

	var fruit = "apple";

	switch(fruit) {
		case "banana":
			console.log("banana");
			break;
		case "apple":
			console.log("apple");
			break;
		case "grapes":
			console.log("grape");
			break;
		default:
			console.log("none");
			break;
	}


	// #############################################################
	// Object
	// #############################################################
	document.write("<h3>Object</h3><br>");

	// Object Literal
	// a literal is a notation for representing a fixed value in source code

	var person = {
		firstName: "Jiho",
		lastName: "Choi",
		age: 24,
		subjects: ["Computer Science", "Math"],
		address: {
			street: "1234 Univ St.",
			city: "West Lafayette",
			state: "IN"
		},
		fullAddress: function() {
			return this.address.street + " " + this.address.city + " " + this.address.state;
		}
	}
	console.log(person.firstName + " " + person.lastName + " is " + person.age + " years old.");
	console.log(person.fullAddress);
	console.log(person.fullAddress());


	// Object Constructor
	var apple = new Object();
	apple.color = "red";
	apple.shape = "round";

	apple.describe = function(){
		return "An apple is the color " + apple.color + " and is the shape " + apple.shape + ".";
	}
	console.log(apple.describe());


	//  Constructor Pattern
	function Fruit(name, color, shape) {
		this.name = name;
		this.color = color;
		this.shape = shape;

		this.describe = function() {
			return "A(n) " + this.name + " is the color " + this.color 
			+ " and is the shape " + this.shape + ".";
		}
	}
	var apple = new Fruit("apple", "red", "round");
	var melon = new Fruit("melon", "green", "round");
	console.log(apple.describe());
	console.log(melon.describe());


	var users = [
		{
			name: "John Doe",
			age: 30
		},
		{
			name: "Jiho Choi",
			age: 24
		}
	];
	console.log(users[0].name);
	console.log(users[1].name);


	// #############################################################
	// Events
	// #############################################################
	document.write("<h3>Events</h3><br>");


	document.write("<button onclick=\"doClick()\">BUTTON JS</button><br><br>");
	document.write("<button onclick=\"this.innerHTML = 'You Clicked B!'\">BUTTON B</button><br><br>");
	document.write("<button onclick=\"changeText1(this)\">BUTTON C</button><br><br>");
	document.write("<button onclick=\"changeText2(this)\">BUTTON D</button><br><br>");

	function doClick() {
		alert("Clicked!");
	}

	function changeText1(id) {
		id.innerHTML = "You Clicked C!"
	}

	function changeText2() {
		var heading = document.getElementById("heading");
		heading.innerHTML = "Text Changed! You Clicked D!";
		console.log(heading);
	}

	function showDate() {
		document.getElementById("time");
		time.innerHTML = Date();
	}

	function clearDate() {
		document.getElementById("time");
		time.innerHTML = "";
	}


	// #############################################################
	// Forms
	// #############################################################
	document.write("<h3>Forms</h3><br>");


	function changeBackground(x) {
		console.log("Hello");
		console.log(x);
		console.log(x.value);

		// var body = document.getElementById("body");
		// body.style.backgroundColor = x.value;
		var heading = document.getElementById("heading");
		heading.style.backgroundColor = x.value;
	}





	// var string1 = "html5_css3_tutorial";
	// var string2 = "HTML5_CSS3_Tutorial";
	// var ls = string2.toLowerCase();
	// document.write(string1 + "<br>");
	// document.write(ls);







