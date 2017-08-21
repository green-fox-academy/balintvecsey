'use strict';

const images = ['creepy.jpg', 'hungry.png', 'selfie.jpg', 'sloth.jpg', 'thinker.png'];
const path = 'assets/';
let large = document.querySelector('.large');
let next = document.querySelector('.next');
let prev = document.querySelector('.prev');
let smallList = document.querySelectorAll('.list');
let num = 0;

large.style.backgroundImage = 'url(' + path + images[num] + ')';

for (let i = 0; i < 3; i++) {
  smallList[i].style.backgroundImage = 'url(' + path + images[i] + ')';
  smallList[i].addEventListener('click', function(){
    changeSmallToLarge(i);
  })
};

next.addEventListener('click', function(){
  changePic(1);
});
prev.addEventListener('click', function(){
  changePic(-1);
});

function changePic(direction) {
  num += direction;
  if(num === images.length) {
    num = 0;
  } else if(num < 0) {
    num = images.length - 1;
  }

  large.style.backgroundImage = 'url(' + path + images[num] + ')';
  changeSmallPic(num);
  console.log(num);
};

function changeSmallPic(num) {
  let diff = 0;
  if (num >= smallList.length) {
    diff = num - (smallList.length - 1);
  }
  for (let i = 0; i < smallList.length; i++) {
    smallList[i].style.backgroundImage = 'url(' + path + images[i + diff] + ')';
  }
};

function changeSmallToLarge(order) {
  num = order;
  console.log(num);
  large.style.backgroundImage = smallList[order].style.backgroundImage;
};


// large.style.backgroundImage = 'url(' + path + images[i] + ')')

// if (num >= 3) {
//   console.log('bigger than 3');
//   for (let i = 1; i < 4; i++) {
//     smallList[i].style.backgroundImage = 'url(' + path + images[i] + ')';
//   }
// };
//
// if (num >= 4) {
//   console.log('bigger than 4');
//   for (let i = 2; i < 5; i++) {
//     smallList[i].style.backgroundImage = 'url(' + path + images[i] + ')';
//   }
// };
