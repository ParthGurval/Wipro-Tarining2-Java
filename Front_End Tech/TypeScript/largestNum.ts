

function findLargest(numbers:number[]): number {

    return Math.max(...numbers); // spread operator 
}


const nums = [10, 5, 23, 78, 1];
console.log(findLargest(nums)); 
