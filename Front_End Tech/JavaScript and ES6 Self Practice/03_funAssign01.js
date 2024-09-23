
console.log("<------------------------STEP1------NO ARGUMENT AND NO RETUEN TYPE------------------->");

function myName() {

    console.log("My Name Is Parth Gurval");    
}

function skill() {

    console.log("My Tech Skills Are: C, C++, JAVA, HTML, CSS, PHP, AWS");
}

myName();
skill();

console.log("<------------------------STEP2------Personal Details------------------------------------>");

function personalDetail(firstName, lastName, collegeName) {
    
    console.log("First Name is:", firstName, '| |', "Last Name is:", lastName, '| |', "College Name is:", collegeName);

}

personalDetail("Parth", "Gurval", "KITCOEK");
personalDetail("Prathamesh", "Halake", "SGUI");

console.log("<------------------------STEP3------Arguments with Swapping------------------------------>");

function swapValues(arg1, arg2) {

    console.log("Brfore Swapping=> arg1:", arg1, '| |', "Before Swapping=> arg2:", arg2);

    var temp = arg1;
    arg1 = arg2;
    arg2 = temp;

    console.log("After Swapping=> arg1:", arg1, '| |', "After Swapping=> arg2:", arg2);
}

swapValues("VIRAT", "ANUSHKA");
swapValues("1000", "2000");

console.log("<------------------------STEP4------ with Arguments------------------------------->");

function addThreeValues(arg1, arg2, arg3) {

    console.log("The Given Values are:", arg1, arg2, arg3);

    var res = arg1 + arg2 + arg3;

    console.log("The Addition of given value is:", res);
    
}

addThreeValues(10.23, 600, 40);
addThreeValues("Hello", "Good", "Morning");


console.log("<------------------------STEP5------Normal Function---------------------------------------->");

function bankDetails(bankName, accNumber, location, pinCode) {

    console.log("Name of Bank:", bankName, ' | | ', "Account Number:", accNumber, ' | | ', "Location:", location, ' | | ', "Pin-Code", pinCode);
    
}

bankDetails("CITI Bank", 3456782345, 'Pune', 431202);
bankDetails("AXIS Bank", 7856782345, 'Mumbai', 441202);
bankDetails("HDFC Bank", 8956782345, 'Pune', 631202, "Open");


console.log("=================================END OF CODE=========================================");