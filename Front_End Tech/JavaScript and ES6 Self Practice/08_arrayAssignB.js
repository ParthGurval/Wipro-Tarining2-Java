

console.log(`________________________________ Assignment No. 02 ______________________________________`);

console.log('');

const arrayNumbers = [20, 31, 40, 25, 23, 11, 29, 9, 60, 2, 11];

console.log("The Given array is:", arrayNumbers);

console.log('-------------------------------- Step-I ---------------------------------------');
console.log("Find total numbers available or length and log on console");

console.log(arrayNumbers.length);

console.log('');

console.log('-------------------------------- Step-II ---------------------------------------');
console.log("Log the first element and last element in arrayNumbers and log on console");

console.log(arrayNumbers[0]);
console.log(arrayNumbers[arrayNumbers.length-1]);

console.log('');



console.log('-------------------------------- Step-III ---------------------------------------');
console.log("Log the Third last element using length property and log on console");

console.log(arrayNumbers.slice(arrayNumbers.length-3));
console.log(arrayNumbers);


console.log('');

console.log('-------------------------------- Step-IV ---------------------------------------');
console.log("Find the all even numbers using for loop and log on console");

const evenNumbers = []; //Empty Array to store even numbers 
for (let i = 0; i < arrayNumbers.length; i++) {
    
    if (arrayNumbers[i] % 2 === 0) {
        evenNumbers.push(arrayNumbers[i]);
    }
}
console.log(evenNumbers);

console.log('');

console.log('-------------------------------- Step-V ---------------------------------------');
console.log("Find the all odd numbers using for loop and log on console");


const oddNumbers = [];

for (let i = 0; i < arrayNumbers.length; i++) {
    
    if (arrayNumbers[i] % 2 !== 0) {
        oddNumbers.push(arrayNumbers[i]);
    }
}

console.log(oddNumbers);

console.log('');

console.log('-------------------------------- Step-VI ---------------------------------------');
console.log("Find all the even positioned elements from arrayNumbers, make sum of it and log on console");


const evenPosNumbers = [];
let evenSum = 0;

for (let i = 0; i < arrayNumbers.length; i++) {
  if (i % 2 === 0) {
    evenPosNumbers.push(arrayNumbers[i]);
   
    evenSum += arrayNumbers[i];   // evenSum = evenSum + arrayNumbers[i];
  }
}
console.log(arrayNumbers);
console.log(`The even element are "${evenPosNumbers.join(', ')}"`);
console.log(`Sum of All the even numbers is: ${evenSum}`);

console.log('');


console.log('-------------------------------- Step-VII ---------------------------------------');
console.log("Find all the odd positioned elements from arrayNumbers, make sum of it and log on console");

const oddPosNumbers = [];
let oddSum = 0;

for (let i = 0; i < arrayNumbers.length; i++) {
    
    if (i % 2 !== 0) {
        oddPosNumbers.push(arrayNumbers[i]);

        oddSum += arrayNumbers[i]; // oddSum = oddSum + arrayNumber[i];
    }
}
console.log(arrayNumbers);
console.log(`The Odd Numbers are: "${oddPosNumbers.join(', ')}"`);
console.log(`Sum of All the Odd Numbers is: ${oddSum}`);

console.log('');


console.log('-------------------------------- Step-VIII ---------------------------------------');
console.log("Find the sum of all the elements from arrayNumbers, log on console");

let totalSum = 0;

for (let i = 0; i < arrayNumbers.length; i++) {
    
    totalSum += arrayNumbers[i];  // totalSum = totalSum + arrayNumber[i];
}

console.log(arrayNumbers);
console.log(`Total Sum of All numbers from Array is: "${totalSum}"`);
console.log('');


console.log('-------------------------------- Step-IX ---------------------------------------');
console.log("Find the numbers which are multiple of 5 from arrayNumbers");

const multipleOfFive = [];

for (let i = 0; i < arrayNumbers.length; i++) {
    
    if (arrayNumbers[i] % 5 == 0) {
        
        multipleOfFive.push(arrayNumbers[i]);
    }
}

console.log(arrayNumbers);
console.log(`The Multiples of Five are: "${multipleOfFive.join(', ')}"`);

console.log('');


console.log('-------------------------------- Step-X ---------------------------------------');
console.log("Check Is number 115 available in arrayNumbers");

console.log(`Is the Number 115 Available in the Array: ${arrayNumbers.includes(115)}`);

console.log('');


console.log('-------------------------------- Step-XI ---------------------------------------');
console.log("Check Is number 23 available in arrayNumbers");

console.log(`Is the Number 23 Available in the Array: ${arrayNumbers.includes(23)}`);

console.log('');


console.log('-------------------------------- Step-XII ---------------------------------------');
console.log("Insert number 55, 66 before index 3 and log array on console");

console.log(arrayNumbers);
console.log('');
let inserNum = arrayNumbers.splice(3, 0, 55, 56);
console.log(arrayNumbers);


console.log('');


console.log('-------------------------------- Step-XII ---------------------------------------');
console.log("Delete 3 elements starting from index 4 and log arrayNumbers on console");

console.log(arrayNumbers);
console.log('');
let delNum = arrayNumbers.splice(4, 3);
console.log(arrayNumbers);

console.log('');