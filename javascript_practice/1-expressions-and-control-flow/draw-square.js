'use strict';

var lineCount = 6;
var pattern = '%';
var space = ' ';

// Write a program that draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as lineCount is

for (var i = 1; i <= lineCount; i++) {
  if (i === 1 || i === lineCount) {
    console.log(pattern.repeat(lineCount));
  } else {
    console.log(pattern + space.repeat(lineCount - 2) + pattern);
  }
}
