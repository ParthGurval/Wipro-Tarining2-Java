

console.log(/________________________________ Assignment No 2 ________________________________/);
console.log('');

console.log(`-------------------------- Step-I ------------------------`);
console.log('"WAP to print no. from 5 to 15 by incrementing 1"');
var number = 5;

while (number <= 15) {
    console.log(`The Numbers are: ${number}`);
    number++;
}

console.log(`-------------------------- Step-II ------------------------`);
console.log('"WAP to print no. from 50 to 40 by decrementing by 1"');
var number = 50;

while (number >= 40) {
    console.log(`The Numbers are: ${number}`);
    number--;
}

console.log(`-------------------------- Step-III ------------------------`);
console.log('"WAP to print first 15 Odd numbers"');
var number = 1;

while (number <= 30) {
    console.log(`The  Odd Number is: ${number}`);
    number=number+2;
}


// var number = 1;
// var oddNumbersCount = 0;

// while (oddNumbersCount < 15) {
//   if (number % 2 !== 0) {
//     console.log(number);
//     oddNumbersCount++;
//   }
//   number++;
// }

console.log(`-------------------------- Step-IV ------------------------`);
console.log('"WAP to print first 10 Even numbers"');
var number = 0;

while (number <= 19) {
    console.log(`The Even Number is: ${number}`);
    number=number+2;
}

console.log(`-------------------------- Step-V ------------------------`);
console.log('"WAP to print Table of 5"');
var number = 5;

while (number <= 50) {
    console.log(`Table of 5 is: ${number}`);
    number=number+5;
}

console.log(`-------------------------- Step-VI ------------------------`);
console.log('"WAP to print Table of 10"');
var number = 10;

while (number <= 100) {
    console.log(`Table of 10 is: ${number}`);
    number=number+10;
}

console.log(`-------------------------- Step-VII ------------------------`);
console.log('"WAP to print Table of 10 in reverse"');
var number = 100;

while (number >= 10) {
    console.log(`Reverse Table of 10 is: ${number}`);
    number=number-10;
}

console.log(`============================= End Of Code ====================================`);