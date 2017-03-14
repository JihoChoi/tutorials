
// Node.js
// https://youtu.be/JH4qVqplC8E?list=PL55RiY5tL51oGJorjEgl6NVeDbx_fO5jR


var http = require('http');

function onRequrest(request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.write("Hellow World");
    response.end();
}

http.createServer(onRequrest).listen(8000);

