'use strict'
// fill output1 with the first paragraph's content, text only.
// fill output2 with the first paragraph's content keeping the cat strong.
var allPara = document.querySelectorAll('p');
allPara[1].textContent = allPara[0].textContent;
allPara[2].innerHTML = allPara[0].innerHTML;
