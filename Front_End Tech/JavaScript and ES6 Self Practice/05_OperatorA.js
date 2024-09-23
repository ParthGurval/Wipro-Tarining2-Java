

console.log(("/........................ ASSIGNMENT - I ............................../"));

console.log("--------------------------- STEP-I --------------------------------");

function squareOfWordLength(args1) {
    
    var word = args1.length;
    var square = word * word;

    console.log(`Given String is: "${args1}"`);
    console.log(`The length of the Given String is: "${word}"`);
    console.log(`The square of the length of the String is: "${square}"`);
}

squareOfWordLength("JavaScript");

console.log("---------------------------------------------------------------");

squareOfWordLength("Google Chrome");

console.log("---------------------------------------------------------------");

squareOfWordLength("Developer Smart");

console.log("--------------------------- STEP-II --------------------------------");


var devloperSoft = function(){
    
    var message = "I am a Angular Developer.";

    var strLen = message.length;

    var totalWords = message.split(" ");
    var totalWordLen = totalWords.length;

    var divWord = strLen / totalWordLen;

    var mulWord = strLen * totalWordLen;

    console.log(`The Given String is: "${message}"`);
    console.log(`Length of the Given String is: "${strLen}"`);
    console.log(`Total Words in the Given String are: "${totalWordLen}"`);
    console.log(`The Divsion of the String Length and word is: "${divWord}"`);
    console.log(`The Multiplication of the String and word is: "${mulWord}"`);
}

devloperSoft();


console.log("=============================== END OF CODE ==========================================");