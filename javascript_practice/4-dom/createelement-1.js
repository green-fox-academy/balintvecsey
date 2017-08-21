'use strict';
// Add an item that says 'The Green Fox' to the asteroid list.
var asteroidList = document.querySelector('ul.asteroids');
var greenAsteroid = document.createElement('li');
greenAsteroid.textContent = 'The Green Fox';
asteroidList.appendChild(greenAsteroid);

// Add an item that says 'The Lamplighter' to the asteroid list.
var lighterAsteroid = document.createElement('li');
lighterAsteroid.textContent = 'The Lamplighter';
asteroidList.appendChild(lighterAsteroid);

// Add a heading saying 'I can add elements to the DOM!' to the .container.
var container = document.querySelector('.container');
var heading = document.createElement('h1');
heading.textContent = 'I can add elements to the DOM!';
container.appendChild(heading);

// Add an image, any image, to the container.
var image = document.createElement('img');
image.src = 'https://media.licdn.com/mpr/mpr/shrink_200_200/AAEAAQAAAAAAAAdQAAAAJDRmN2M3ZDVhLThlZjMtNDJjNC04MjlmLWE1MTA5ZDMzMGFhYQ.png';
container.appendChild(image);
