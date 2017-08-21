'use strict';
// Does the third p have a cat class?
// If so, alert 'YEAH CAT!'
var pList = document.querySelectorAll('p');
if (pList[2].classList.contains('cat')) {
  alert('YEAH CAT!');
}

// If the fourth p has a 'dolphin' class, replace apple's content with 'pear'
if (pList[3].classList.contains('dolphin')) {
  pList[0].textContent = 'pear';
}

// If the first p has an 'apple' class, replace cat's content with 'dog'
if (pList[0].classList.contains('apple')) {
  pList[2].textContent = 'dog';
}

// Make apple red
pList[0].classList.add('red');

// Make balloon less balloon-like
pList[1].style.backgroundColor = 'orange';
pList[1].style.borderRadius = '10px';
