function findLargest(numbers) {
    return Math.max.apply(Math, numbers); // spread operator 
}

var nums = [10, 5, 23, 78, 1];
console.log(findLargest(nums));
