'use strict';
// - Create an array named `s` with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4 with the `.map` method
// - Print the fourth element as a test

var s = [1, 2, 3, 8, 5, 6];
s = s.map(function(element, index){
  return index === 3 ? 4 : element;
})

console.log(s);
console.log(s[3]);
