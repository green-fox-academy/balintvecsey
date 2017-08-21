'use strict';
// Write the image's url to the console.
var image = document.querySelector('img');
console.log(image.getAttribute('src'));

// Replace the image with a picture of yourself.
image.setAttribute('src', 'https://lh5.googleusercontent.com/rwIFAmx8Awx6O53gVGv4C_Duse-7Few1RDVTnQ4xiKROsAtD_WjRPuCOHkB0eyJ-RA0rsfBah-zQOHQ=w1366-h700')

// Make the link point to the Green Fox Academy website.
var link = document.querySelector('a');
link.setAttribute('href', 'https://www.greenfoxacademy.com/');

// Disable the second button.
var secondButton = document.querySelector('.this-one');
secondButton.disabled = true;

// Replace its text with 'Don't click me!'.
secondButton.textContent = 'Don\'t click me!';
