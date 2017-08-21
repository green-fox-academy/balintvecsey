'use strict';
// Reverse the string!

var reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI"
var correctOrder = '';

while (reversed.charAt(0) !== '') {
  correctOrder = correctOrder + reversed.charAt(reversed.length - 1);
  reversed = reversed.slice(0, reversed.length - 1);
}
reversed = correctOrder;

console.log(reversed);
