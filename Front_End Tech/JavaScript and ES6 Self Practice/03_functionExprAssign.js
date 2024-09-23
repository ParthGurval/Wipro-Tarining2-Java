
console.log("<----------------------- PART - I -------------------------->");

//write a function expression to get square of the numbers-> 5, 6, 25, 100, 67.89, 59
var square = function(number) {
     
     var result = number * number;
     console.log(`The Square of the given Number is: "${result}"`);
    
}

square(5);
square(6);
square(25);
square(100);
square(67.89);
square(59);

console.log("<----------------------- PART - II -------------------------->");

console.log(`Type of the given value is: "${typeof square}"`); // op: function

console.log("<----------------------- PART - III Multiplying -------------------------->");

var area = function(len, wid) {
    
    var rectArea = len * wid;
    console.log(`The total Area Of the rectangular plot is: "${rectArea}"`); 
}

area(499, 917);

console.log("<----------------------- PART - IV Swapping-------------------------->");

var swapValues = function(val1, val2){

    console.log(`Before swapping Value-1 was ==> "${val1}" | | Before Swap value-2 was ==> "${val2}" `);

    var temp = val1;
    val1 = val2;
    val2 = temp;

    console.log(`After swap value-1 is ==> "${val1}" | | After swap value-2 is ==> "${val2}" `);
}

swapValues("Mahi", "Raina");
console.log("-----------------------------------------------------------------------------------");
swapValues("55", "77");


console.log("<----------------------- PART - IV -------------------------->");

var strFe = function() {
    
    var message = "JS is the most popular language of the internet";

    console.log(`The Given String is: "${message}"`);

console.log("........................Lenght of sting......................");

var strLen = message.length;
console.log(`Length of the string is: ${strLen}`);

console.log("........................Find Char at 6......................");

var pos = message.charAt(6);
console.log(`Character at Index 6 is: "${pos}"`);

console.log("........................Find Char at 11......................");

var pos2 = message.charAt(11);
console.log(`Character at Index 11 is: "${pos2}"`);

console.log("........................Find last Char......................");

var lastChar = message.charAt(message.length - 1);
console.log(`The last character of string is: "${lastChar}"`);

console.log("........................Find First Char......................");

var firstChar = message.charAt(0);
console.log(`The very First character is: "${firstChar}"`);

console.log("........................Find Thod-Last Char......................");

var thirdLastChar = message.charAt(message.length - 3);
console.log(`The third-last character from the string is: "${thirdLastChar}"`);

console.log("........................Find Total Number of words and its Square......................");

var totalWords = message.split(" ");
var wordLen = totalWords.length;
console.log(`The String is: "${message}"`);
console.log(`The total number of words in the given String is: "${wordLen}"`);

var squareOfWords = wordLen * wordLen;
console.log(`The Square value of the above number is: "${squareOfWords}"`);


console.log(`======================================= END OF CODE ====================================================`);

}

strFe();

