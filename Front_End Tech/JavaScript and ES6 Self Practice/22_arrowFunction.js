

// let add = function(){

//     console.log(12+12);
// }

// add()

// console.log(``);

// let multi = (num1, num2, num3=1) => {
//     console.log(num1*num2*num3);
// }

// multi(5,5)

// const arr = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]

// console.log(arr.length);



// arr.forEach(element => {
//     console.log(`Array index of ${element} is ${arr.indexOf(element)}`);
// });



// const addBlock = (...arg) => {

//     return args.join(' ');
// }

// const res1 = addBlock[(100, 100, 200, 349, 756)];

// const res2 = addBlock[("I am", "learning", "ES6", "features", "in depth.")];

// console.log(`The Addition of Given Input is: ${res1}`);
// console.log(`The concatenation of Given Input is: ${res2}`);

// const addBlock = (...args) => {
//     return args.reduce((sum, arg) => sum + arg, 0);
// };

// const concatBlockWithSpace = (...args) => {
//     return args.join(' ');
// };

// const res1 = addBlock(100, 100, 200, 349, 756);
// const res2 = concatBlockWithSpace("I am", "learning", "ES6", "features", "in depth.");

// console.log(`The Addition of Given Input is: ${res1}`);
// console.log(`The concatenation of Given Input is: ${res2}`);





const addBlock = (...args) => {
    var addNum = args.reduce((sum, num) => sum + num, 0);
    var addString = args.join(" ");
}

const res1 = addBlock(100, 100, 200, 349, 756);

const res2 = addBlock("I am", "learning", "ES6", "features", "in depth.");

console.log(`The Addition of Given Input is: ${res1}`);
console.log(`The concatenation of Given Input is: ${res2}`);