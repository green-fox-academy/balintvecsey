'use strict';

var example = "In a dishwasher far far away";

// I would like to replace "dishwasher" with "galaxy" in this example
// Please fix it for me!
// Expected ouput: In a galaxy far far away
var wrongWord = 'dishwasher';
var correction = 'galaxy';

if (example.indexOf(wrongWord) !== -1) {
  example = example.replace(wrongWord, correction);
}

console.log(example);
