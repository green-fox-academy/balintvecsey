'use strict';
// 1. Alert the content of the heading.
var header = document.head;
console.log(header);
alert(header.innerHTML);

// 2. Write the content of the first paragraph to the console.
var firstPara = document.querySelectorAll('p')[0];
console.log(firstPara.textContent);

// 3. Alert the content of the second paragraph.
var secondPara = document.querySelectorAll('p')[1];
console.log(secondPara.textContent);
alert(secondPara.textContent);

// 4. Replace the heading's content with 'New content'.
var heading = document.querySelector('h1');
heading.textContent = 'New Content';

// 5. Replace the last paragraph's content with the first paragraph's content.
var lastPara = document.querySelectorAll('p')[2];
lastPara.textContent = firstPara.textContent;
