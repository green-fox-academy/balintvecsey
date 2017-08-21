'use strict';
// - Create (dynamically*) a two dimensional list
//   with the following matrix**. Use a loop!
//
//   0 0 0 1
//   0 0 1 0
//   0 1 0 0
//   1 0 0 0
//
// - Print this two dimensional list to the console
//
// * size should depend on a variable
// ** Relax, a matrix is just like an array

var size = 6;
var zero = '0';
var one = '1';

for (var i = 0; size > 0; size--, i++) {
  console.log(zero.repeat(size - 1) + one + zero.repeat(i));
}
