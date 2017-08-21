'use strict'
// Turn the party on and off by clicking the button.
var button = document.querySelector('button');
var body = document.querySelector('body');

function partyOn() {
  if(body.classList.contains('party')) {
    body.classList.remove('party');
  } else {
    body.classList.add('party');
  }
}

button.addEventListener('click', partyOn);
