'use strict'

//BMI
var massInKg = 61.5;
var heightInM = 1.77;

console.log(massInKg/(heightInM^2));

//cuboid
var a = 5;
var b = 6;
var c = 7;

console.log("Surface Area: " + 2*((a*b) + (a*c) + (b*c)));
console.log("Volume: " + (a*b*c));

//swap
var a = 123;
var b = 526;

var c = a;
a = b;
b = c;

console.log(a);
console.log(b);
