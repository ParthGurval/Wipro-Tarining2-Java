
console.log("With Regular Swappig Method...!!!");

console.log("------------------------------------FIRST TASK------------------------------------");

var name1 = "Sweety";
var name2 = "Cutie";

console.log("Before Swapping => name1:", name1, '&', "Before Swapping => name2:", name2);

var temp = name1;
name1 = name2;
name2 = temp;

console.log("After Swapping => name1:", name1, '&', "After Swapping => name2: ", name2);


console.log("------------------------------------SECOND TASK------------------------------------");

var num1 = 100;
var num2 = 200;
var num3 = 300;

console.log("Before Swapping => num1:", num1, '&', "Before Swapping => num2:", num2, '&', "Brfore Swapping => num3: ", num3);

var temp = num1;
num1 = num2;
num2 = num3;
num3 = temp;

console.log("After Swapping => num1:", num1, '&', "After Swapping => num2:", num2, '&', "After Swapping => num3: ", num3);


console.log("________________________USING FUNCTION________________________");

console.log("------------------------------------FIRST TASK------------------------------------");

function swap(n1, n2) {
    console.log("Before Swap => n1: ", n1, '&', "Before Swap=> n2: ", n2);

    var temp = n1;
    n1 = n2;
    n2 = temp;

    console.log("After Swap => n1: ", n1, '&', "After Swap=> n2: ", n2);    
}

var name1 = "Sweety";
var name2 = "Cutie";

swap(name1, name2);

console.log("------------------------------------SECOND TASK------------------------------------");

function swap_num(n1, n2, n3) {

    console.log("Before Swapping => n1:", n1, '&', "Before Swapping => n2:", n2, '&', "Brfore Swapping => n3: ", n3);

    var temp = n1;
    n1 = n2;
    n2 = n3;
    n3 = temp;

    console.log("After Swapping => n1:", n1, '&', "After Swapping => n2:", n2, '&', "After Swapping => n3: ", n3);
}

var num1 = 100;
var num2 = 200;
var num3 = 300;

swap_num(num1, num2, num3);