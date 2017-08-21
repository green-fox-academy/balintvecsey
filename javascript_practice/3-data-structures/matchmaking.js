'use strict';
// Join the two array by matching one girl with one boy in the order array
// Exepected output: ["Eve", "Joe", "Ashley", "Fred"...]

var girls = ["Eve","Ashley","Bözsi","Kat","Jane"];
var boys = ["Joe","Fred","Béla","Todd","Neef","Jeff"];
var order = [];
var length = girls.length + boys.length;

for (var i = 0; i < length; i++) {
  if(girls[0] !== undefined) {
    if(i % 2 === 0) {
      order[i] = girls.shift();
    } else {
      order[i] = boys.shift();
    }
  } else {
    order[i] = boys.shift();
  }
}

console.log(order);
