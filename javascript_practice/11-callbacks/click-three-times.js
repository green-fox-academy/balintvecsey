'use strict';

let button = document.querySelector('button');
let hiddenMessage = document.querySelector('p');
let timePassed = false;
let clickCounter = 0;

function checkTimeAndClick() {
  if(clickCounter >= 3 && timePassed) {
    hiddenMessage.removeAttribute('hidden');
  }
}

function countClicking() {
  clickCounter++;
  checkTimeAndClick();
}

setTimeout(function() {
  timePassed = true;
  checkTimeAndClick();
}, 5000);

button.addEventListener('click', countClicking);
