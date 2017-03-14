var http = require('http');
var app = require('./app');

http.createServer(app.handleRequrest).listen(8000);