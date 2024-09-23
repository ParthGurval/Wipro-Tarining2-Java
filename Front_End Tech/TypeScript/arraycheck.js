// Function to double the values in an array
function doubleArray(numbers) {
    return numbers.map(function (number) { return number * 2; });
}

var nums2 = [1, 2, 3, 4];
var doubledNums = doubleArray(nums2);
console.log(doubledNums); // Output: [2, 4, 6, 8]
