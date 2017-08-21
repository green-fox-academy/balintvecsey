'use strict';
// - Create variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings, dear Greenfox`
//     - Prepare for the special case when no parameters are given
// - Greet `al`

var al = 'Greenfox';

function greet(name='friend') {
    console.log('Greetings, dear ' + name);
}

function greet2(name='friend'){
    return 'Greetings, dear ' + name;
}

greet(al);
console.log(greet2(al));
