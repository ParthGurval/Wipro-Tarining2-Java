
console.log(`______________________ Assignment No. 01 _________________________`);
console.log(``);
console.log(`---------------------------- STEP-I ------------------------------`);
console.log(`Count Total Number Of Vowels including small and capital vowels using for loop and while loop`);




console.log(`_______________ Using For Loop ________________`);
console.log('');

let vowelCheck = function (str) {
    
    let count = 0;
    let vowelspc = []; // Initialize an empty array to store the vowels
    for (let index = 0; index < str.length; index++) {
        
        const char = str.charAt(index);

        if(char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' ||
           char == 'A' || char == 'E' || char == 'I' || char == 'O' || char == 'U'){
        
            // console.log(char);
            vowelspc.push(char) // Push the vowel into the vowels array
            count = count + 1;
            // console.log(`-------------------------------------`);
           }
    }
    console.log(`The vowels in string are: ${vowelspc.join(', ')}`); // Print the vowels in a horizontal line with comma separation
    console.log(`Total Number of Count is ${count}`);
}

vowelCheck("I am very good IT Developer");

console.log(``);




console.log(`_______________ Using While Loop ________________`);
console.log('');

let vowelCheck2 = function (str2) {
    
    let count = 0;
    let vowSpc = [];
    index = 0;

    while (index < str2.length) {
        
        const char = str2.charAt(index);

        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' ||
        char == 'A' || char == 'E' || char == 'I' || char == 'O' || char == 'U') {
            
            vowSpc.push(char); // Push the vowel into the vowels array
            count = count + 1;
        }  

        index++;
    }
        
       
    console.log(`The Vowels in Given String are: ${vowSpc.join(', ')}`);
    console.log(`Total Count of Vowels is: ${count}`);
}

vowelCheck2(`I am very good IT Developer`);











console.log(`---------------------------- STEP-II ------------------------------`);
console.log(`WAF to get sum of cubes of numbers from 1 to 5`);
console.log(``);

console.log(`_______________ Using For Loop ________________`);
console.log('');


console.log();
let cubeOfNumbers = function (){

    let sumOfCube = 0;
    for (let index = 1; index <=5; index++) {

        const res1 = index * index * index; // 1*1*1+2*2*2+/..

        sumOfCube = sumOfCube + res1;

        console.log(`Cube of ${index} is: ${res1}`);
    }

    console.log(`Total Sum of Numbers is: ${sumOfCube}`);
}

cubeOfNumbers();

console.log(``);

console.log(`_______________ Using While Loop ________________`);
console.log(``);

let cubeOfNumbers2 = function(){
    
    let sum = 0;
    let num = 1;

    while (num <= 5 ) {
        const cube = num * num * num;

        sum = sum + cube;
        console.log(`Cube of ${num} is: ${cube}`);  
        num++;      
    }

    console.log(`Total Sum of Numbers is: ${sum}`);
}

cubeOfNumbers2();

console.log(``);

console.log(`---------------------------- STEP-III ------------------------------`);
console.log(``);
console.log(`Log all the odd positioned chars on console and do not consider space`);

console.log(``);
console.log(`_______________ Using For Loop ________________`);
console.log(``);


function oddPositionedChars(str1){

    for (let index = 0; index < str1.length; index++) {
        
        const res2 = str1.charAt(index);

        // Check if the current index is odd (index % 2 !== 0) and the character is not an empty space
        if(index % 2 == 1 && res2 !== ' '){
            console.log(`The Character at odd Poition Number ${index} is: ${res2}`);
            console.log(`--------------------------------------------------`);
        }

        
    }
}

oddPositionedChars(`Hard Work Always Pays Back`);
console.log(`__________________________ String 2 _________________________________`);
oddPositionedChars(`Soon I will be Raect IT Champ`);

console.log(``);




console.log(`_______________ Using While Loop ________________`);

function oddPositionedCharsWhile(strn) {
    
    let pos = 0;

    while (pos < strn.length) {
        
        const res3 = strn.charAt(pos);

        if (pos % 2 == 1 && res3 !== ' ') {
            console.log(`The character at Odd postion Number ${pos} is: ${res3}`);
            console.log(`--------------------------------------------------`);
        }

        pos++;
    }

}

oddPositionedCharsWhile(`Hard Work Always Pays Back`);
console.log(`__________________________ String 2 _________________________________`);
oddPositionedCharsWhile(`Soon I will be Raect IT Champ`);