var http = require('http');
var fs = require('fs'); // filesystem

function onRequrest(request, response) {
    // response.writeHead(200, {'Content-Type': 'text/plain'});
    response.writeHead(200, {'Content-Type': 'text/html'});
    fs.readFile("./index.html", null, function(error, data) {
        if (error) {
            response.writeHead(404);
            response.write("Fole not found!");
        } else {
            response.write(data);
        }
        response.end();
    });
}

http.createServer(onRequrest).listen(8000);