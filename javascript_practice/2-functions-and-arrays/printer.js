'use strict';
// - Create a function called `printer`
//   which logs to the console the input parameters
//   (can have multiple number of arguments)

function printer() {
  for (var i = 0; i < arguments.length; i++) {
    console.log(arguments[i]);
  }
}

function printerWithForEach() {
  var args = Array.from(arguments);

  args.forEach(function(element) {
    console.log(element);
  })
}

function printerWithForEach2(...args) {
  args.forEach(function(element) {
    console.log(element);
  })
}

printer('labda', 2, 4, true);
console.log('==================');
printerWithForEach('labda', 2, 4, true);
console.log('==================');
printerWithForEach2('labda', 2, 4, true);
