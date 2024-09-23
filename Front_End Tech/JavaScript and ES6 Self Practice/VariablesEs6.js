
// Const 

const name = 'Rohit';
console.log(name); 

// Will print 'Rohit' to the console.

// Trying to reassign a const variable

name = 'Prathamesh';
console.log(name); 

//  Will give TypeError.

// // Trying to declare const variable first
// // and then initialise in another line

// const org_name;
// org_name = "LearnerCom";
// console.log(org_name);

// Throws an syntax error: missing initializer in const declaration






// let
// let name = 'Shubham';
// console.log(name); 
// Prints Mukul

// name = 'Arbaz';
// console.log(name); 
// Prints Rahul

// Trying to declare let variable first and then initialise in another line
// let org_name;
// org_name = "Hii this is js";
// console.log(org_name); 
// Prints Hii this is js



//Arrow functions

// Function declaration using function keyword
// function simpleFunc(){
//     console.log("Declared using the function keyword");
// }
// simpleFunc(); 

// Function declared using arrow functions
// const arrowFunc = () => {
//     console.log("Declared using the arrow functions");
// }
// arrowFunc();


// Template literal

// Without Template Literal
// var name = 'Ferrari';
// console.log('Printed without using Template Literal'); 
// console.log('My name is '+ name); 

// With Template Literal
// const name1 = 'Lamborghini';
// console.log('Printed by using Template Literal');
// console.log(`My name is ${name1}`); 


// Object and Array Desctructuring

// Object Destructuring
// const college = {
//     name : 'DTU',
//     est : '1941',
//     isPvt : false
// };
// let {name, est, isPvt} = college;
// console.log(name, est, isPvt);

// Array Destructuring
// const arr = ['lionel', 'messi', 'barcelona'];
// let[value1,value2,value3] = arr;
// console.log(value1, value2, value3);

// Default parameter

// function fun(a, b=1){
//     return a + b;
// }
// console.log(fun(10,20));
// console.log(fun(3));

//Classes

// classes in ES6
// class Vehicle{
//     constructor(name,engine){
//         this.name = name;
//         this.engine = engine;
//     }
// }

// const bike1 = new Vehicle('Ninja ZX-10R','998cc');
// const bike2 = new Vehicle('Duke','390cc');

// console.log(bike1.name); // Ninja ZX-10R
// console.log(bike2.name); // Duke



// Rest parameter and spread operator

// ES6 rest parameter
// function fun(...input){
//     let sum = 0;
//     for(let i of input){
//         sum += i;
//     }
//     return sum;
// }
// console.log(fun(1,2)); // 3
// console.log(fun(1,2,3)); // 6 
// console.log(fun(1,2,3,4,5)); // 15

// // Spread operator
// let arr = [1,2,3,-1];
// console.log(...arr);
// console.log(Math.max(...arr)); // -1

// for/of Loop

// const myArr = [5, 55, 33, 9, 6]
// for(let element of myArr){
//     console.log(element);
// }


// Promises

// const JSpromise = new Promise((resolve, reject) => {
//     setTimeout(() => {
//         resolve("Promise is Working")
//     }, 2000);
// });

// JSpromise.then((value) => {console.log(value)});