'use strict';
// Remove the king from the list.
var asteroidList = document.querySelector('ul.asteroids');
var kingAsteroid = document.querySelector('li');

asteroidList.removeChild(kingAsteroid);

// Fill the list based on the following list of objects.
// only add the asteroids to the list.
// each list item should have its category as a class
// and its content as text content.
var planetData = [
  {
    category: 'inhabited',
    content: 'Foxes',
    asteroid: true
  },
  {
    category: 'inhabited',
    content: 'Whales and Rabbits',
    asteroid: true
  },
  {
    category: 'uninhabited',
    content: 'Baobabs and Roses',
    asteroid: true
  },
  {
    category: 'inhabited',
    content: 'Giant monsters',
    asteroid: false
  },
  {
    category: 'inhabited',
    content: 'Sheep',
    asteroid: true
  }
];

for (var planet of planetData) {
  if(planet.asteroid) {
    var asteroid = document.createElement('li');
    asteroid.setAttribute('class', planet.category);
    asteroid.textContent = planet.content;
    asteroidList.appendChild(asteroid);
  }
}
