'use strict'
// Remove the king from the list.
var asteroidList = document.querySelector('ul.asteroids');
var kingAsteroid = document.querySelector('li');

asteroidList.removeChild(kingAsteroid);

// Add 3 list items saying 'The Fox' to the list.
for (var i = 0; i < 3; i++) {
  var greenAsteroid = document.createElement('li');
  greenAsteroid.textContent = 'The Green Fox';
  asteroidList.appendChild(greenAsteroid);
}
