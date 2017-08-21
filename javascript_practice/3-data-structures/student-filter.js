'use strict';

var students = [
        {'name': 'Rezso', 'age': 9.5, 'candies': 2},
        {'name': 'Gerzson', 'age': 10, 'candies': 1},
        {'name': 'Aurel', 'age': 7, 'candies': 3},
        {'name': 'Zsombor', 'age': 12, 'candies': 5}
]

// create a function that takes a list of students and logs:
// - Who has got more candies than 4 candies

// create a function that takes a list of students and logs:
//  - how many candies they have on average

function moreCandiesThanFour(listOfStudents) {
  var luckyGuy;
  for (var student of listOfStudents) {
    if(student.candies > 4) {
      luckyGuy = student.name;
    }
  }
  console.log(luckyGuy);
}

function averageCandies(listOfStudents) {
  var sum = 0;
  var count = 0;
  var avg = 0;

  for (var student of listOfStudents) {
    sum += student.candies;
    count++;
  }
  avg = sum / count;

  console.log(avg);
}

moreCandiesThanFour(students);
averageCandies(students);
