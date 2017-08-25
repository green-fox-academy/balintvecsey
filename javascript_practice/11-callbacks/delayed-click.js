'use strict';

let button = document.querySelector('button');
let hiddenMessage = document.querySelector('p');

function showMessage() {
  setTimeout(function() {
    hiddenMessage.removeAttribute('hidden');
  }, 2000);
}

button.addEventListener('click', showMessage);
