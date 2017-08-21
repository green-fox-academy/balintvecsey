'use strict';
// On the click of the button,
// Count the items in the list
// And display the result in the result element.
var list = document.querySelectorAll('li');
var button = document.querySelector('button');
var result = document.querySelector('p');

function showResult() {
  result.textContent = list.length;
}

button.addEventListener('click', showResult);
