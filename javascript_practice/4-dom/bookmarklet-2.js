'use strict';
// Create a script that replaces every image
// with this: http://bit.ly/lpgreenfox
// Create a bookmarklet that does that on any website.
function changeToFox() {
  var allImg = document.querySelectorAll('img');

  allImg.forEach(function(img) {
    img.setAttribute('src', 'http://bit.ly/lpgreenfox');
  })
}

// changeToFox();
