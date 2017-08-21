'use strict';
// replace the list items' content with items from this list:
var newList = ['apple', 'banana', 'cat', 'dog']
var oldList = document.querySelectorAll('li');

for (var i = 0; i < oldList.length; i++) {
  oldList[i].textContent = newList[i];
}
