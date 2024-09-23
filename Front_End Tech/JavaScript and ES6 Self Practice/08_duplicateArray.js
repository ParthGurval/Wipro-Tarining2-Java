

let arrayDuplication = [4, 5, 4, 5, 8, 5, 7, 8, 9, 7, 8];

console.log("Given Array is: ", arrayDuplication);

function removeDuplicate(arr) {
    
    let removedElement = []; // Initialize an empty array to store unique elements

    for (const element of arr) {     // Loop through each element of the input array using the for...of loop
        
        if (!removedElement.includes(element)) { // Check if the removedElement does not already include the current element
            removedElement.push(element)         // If the element is not already in removedElement, add it
        }
    }

    return removedElement;    // Return the removedElement containing only the unique elements
}

let res = removeDuplicate(arrayDuplication);
console.log(`After Removing Duplicate elements from the array, It will be:`);
console.log(res);











// let array = [4, 5, 4, 5, 8, 5, 7, 8, 9, 7, 8];

// function removeDuplicates(arr) {
//   let tempArray = [];

//   for (let i = 0; i < arr.length; i++) {
//     if (!tempArray.includes(arr[i])) {
//       tempArray.push(arr[i]);
//     }
//   }

//   return tempArray;
// }

// let result = removeDuplicates(array);

// console.log(result);




// let student = {
//   rollNumber: 2233,
//   state: "MH",
//   city: "Pune",
//   college: "COEP Pune"
// }

// let keysStudent = Object.keys(student);
// console.log(keysStudent);
// let valuesStudent = Object.values(student);
// console.log(valuesStudent);

// console.log(`----------Traversing an object ------------ `);
// for (const key in student) {
//   if (Object.hasOwnProperty.call(student, key)) {
//       const element = student[key];
//       console.log(`Key: ${key}, value : ${element}`); 
//   }
// }


// let isAvailable= "college" in student;



// let study = {

//   sub1: "English",
//   sub2: "Maths",
//   sub3: "Social Science",

// }

// for (const key in study) {
//   if (Object.hasOwnProperty.call(study, key)) {
//     const element = study[key];
    
//     console.log(`${key},${element}`);
    
//   }
// }

