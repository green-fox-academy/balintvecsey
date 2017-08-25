'use strict';

const fruits = [
  'melon',
  'apple',
  'strawberry',
  'blueberry',
  'pear',
  'banana'
];

// Create a new array of consists numbers that shows how many times the 'e' letter
// occurs in the word stored under the same index at the fruits array!
// Please use the map method.

function countingE(x){
  let countE = 0;
  for (let i = 0; i < x.length; i++) {
    if(x.charAt(i) === 'e') {
      countE++;
    }
  }
  return countE;
}

let howManyEInFruits = fruits.map(countingE);
console.log(howManyEInFruits);
