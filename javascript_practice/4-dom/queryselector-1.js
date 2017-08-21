'use strict';
// 1. store the element that says 'The King' in the 'king' variable.
// console.log it.
var king = document.getElementById('b325');
console.log('king', king);

// 2. store the element that contains the text 'The Conceited Man'
// in the 'conceited' variable.
// show the result in an 'alert' window.
var conceited = document.querySelector('.b326');
console.log('conceited', conceited);
alert(conceited.outerHTML);

// 3. store 'The Businessman' and 'The Lamplighter'
// in the 'businessLamp' variable.
// console.log each of them.
var businessLamp = document.querySelectorAll('.big');
for (var element of businessLamp) {
  console.log('businessLamp', element);
}

// 4. store 'The King' and 'The Conceited Man'
// in the 'conceitedKing' variable.
// alert them one by one.
var conceitedKing = document.querySelectorAll('.container > div');
for (var element of conceitedKing) {
  console.log('conceitedKing', element);
  alert(element.outerHTML);
}

// 5. store 'The King', 'The Conceited Man' and 'The Lamplighter'
// in the 'noBusiness' variable.
// console.log each of them.
var noBusiness = document.querySelectorAll('div');
for (var element of noBusiness) {
  console.log('noBusiness', element);
}

// 6. store 'The Businessman' in the 'allBizniss' variable.
// show the result in an 'alert' window.
var allBizniss = document.querySelector('p');
console.log('allBizniss', allBizniss);
alert(allBizniss.outerHTML);
