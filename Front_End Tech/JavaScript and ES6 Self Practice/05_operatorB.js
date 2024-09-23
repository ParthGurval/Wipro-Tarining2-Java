
console.log("/_______________________ ASSIGNMENT NO. 2 _______________________");


// Ternary Operators example

console.log("------------------------- STEP-I --------------------------------------");

var greaterNumber = function(arg1, arg2){

    console.log(`The Given Numbers are: "${arg1}", "${arg2}"`);

    arg1 > arg2 ? console.log(`The greast value between arg1 and arg2 is: "${arg1}"`) : console.log(`The greast value between arg1 and arg2 is: "${arg2}"`);;
};

greaterNumber(10, -10);
greaterNumber(800, 899);

console.log("------------------------- STEP-II --------------------------------------");

var isEvenOrOdd = function(number){

    return number % 2 === 0 ? `Is the Number ${number} even: "True"` : `Is the Number ${number} even: "False"`;

};

console.log(isEvenOrOdd(29));
console.log(isEvenOrOdd(44));
console.log(isEvenOrOdd(101));
console.log(isEvenOrOdd(0));

console.log("------------------------- STEP-III --------------------------------------");

var wordLength = function(word){

    return word.length % 2 === 0 ? `The length of ${word} is: "Even"` : `The length of word ${word} is: "Odd"` ;

};

console.log(wordLength("Javascript"));
console.log(wordLength("Developer"));
console.log(wordLength("Google"));

console.log("=============================== END OF CODE ==========================================");