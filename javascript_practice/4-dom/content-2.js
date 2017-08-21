'use strict';
// fill every paragraph with the last one's content.
var allPara = document.querySelectorAll('p');
for (var i = 0; i < allPara.length - 1; i++) {
  console.log(allPara[i]);
  allPara[i].innerHTML = allPara[allPara.length - 1].innerHTML;
}
