'use strict';
// Write a program that prints the following fruits:
// apple -> immediately
// pear -> after 1 seconds
// melon -> after 3 seconds
// grapes -> after 5 seconds

function printFruit(name, seconds) {
  setTimeout(function () {
    console.log(name);
  }, seconds * 1000)
}

printFruit('apple');
printFruit('pear', 1);
printFruit('melon', 3);
printFruit('grapes', 5);
