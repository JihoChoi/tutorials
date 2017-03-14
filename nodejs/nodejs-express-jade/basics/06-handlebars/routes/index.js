var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'this is my title', condition1: false, anyArray: [1,2,3] });
});

module.exports = router;
