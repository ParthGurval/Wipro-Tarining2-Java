



// Function to double the values in an array
function doubleArray(numbers: number[]): number[] {
    return numbers.map(number => number * 2);
}


const nums2 = [1, 2, 3, 4];
const doubledNums = doubleArray(nums2);
console.log(doubledNums); // Output: [2, 4, 6, 8]
