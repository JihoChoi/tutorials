
// https://youtu.be/NemVc0_pnzM?list=PL55RiY5tL51oGJorjEgl6NVeDbx_fO5jR

var http = require('http');
var module1 = require('./module1');
var module2 = require('./module2');

function onRequrest(request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.write("Hellow World");
    response.write(module1.myString);
    module1.myFunction();
    response.write(module2.myVariable);
    module2.myFunction();
    response.end();
}

http.createServer(onRequrest).listen(8000);
// passing reference to the function


// anonymous functions
/*
http.createServer(function (request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.write("Hellow World");
    response.write(module1.myString);
    module1.myFunction();
    response.write(module2.myVariable);
    module2.myFunction();
    response.end();
}).listen(8000);
*/
