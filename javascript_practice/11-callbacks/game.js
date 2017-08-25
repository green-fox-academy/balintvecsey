'use strict';

let buttonCreateCandies = document.querySelector('.create-candies');
let buttonBuyLollypops = document.querySelector('.buy-lollypops');
let buttonCandyMachine = document.querySelector('.candy-machine');
let countCandies = document.querySelector('.candies');
let countLollypops = document.querySelector('.lollypops');
let countSpeed = document.querySelector('.speed');
let currentCandies = 0;

function addCandy() {
  countCandies.innerHTML = ++currentCandies;
}

function addLollypop() {
  if(currentCandies >= 100) {
    countLollypops.innerHTML += '🍭';
    currentCandies -= 100;
    countCandies.innerHTML = currentCandies;
  }
}

buttonCreateCandies.addEventListener('click', addCandy);
buttonBuyLollypops.addEventListener('click', addLollypop);
