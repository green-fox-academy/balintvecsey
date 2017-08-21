'use strict';
// Remove the king from the list.
var asteroidList = document.querySelector('ul.asteroids');
var kingAsteroid = document.querySelector('li');

asteroidList.removeChild(kingAsteroid);

// Add list items that have the following text contents:
// ['apple', 'bubble', 'cat', 'green fox']
var newList = ['apple', 'bubble', 'cat', 'green fox'];

for (var element of newList) {
  var newListElement = document.createElement('li');
  newListElement.textContent = element;
  asteroidList.appendChild(newListElement);
}
