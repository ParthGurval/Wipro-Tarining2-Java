
console.log("========================== ASSIGNMENT NO. 2 ========================");


function stringsHandsOn() {
    
    var message = "     Hey you are doing good, Keep it up     ";

    console.log("\----------------------------Step 1----------------------------/");
    console.log(` The given String is: ${message} `); // it include space in it

    console.log("\----------------------------Step 2----------------------------/");
    var stringLength = message.length;
    console.log(` The Length of the given string is:  "${stringLength}" `);

    console.log("\----------------------------Step 3----------------------------/");
    var msg =  "     Hey you are doing good, Keep it up     ";
    var rest = msg.trim();
    console.log(`Before Trim String length: ${msg.length}, After Trim String is: ${rest} and it's length is ${rest.length}`);

    console.log("\----------------------------Step 4----------------------------/");
    var space1 = msg.slice(0,5);
    var space2 = msg.slice(39, 44);
    var resultSpace = space1.length + space2.length;
    console.log(` Total number of extra space removed is : "${resultSpace}" `);

    console.log("\----------------------------Step 5----------------------------/");
    console.log(`First charactor of string is : "${rest[0]}" and last character: "${rest[rest.length - 1]}" `);

    console.log("\----------------------------Step 6----------------------------/");
    var result2 = rest.split(" ");
    var words = result2.length;
    console.log(rest);
    console.log(` Total Number of words are: ${words}`);

    console.log("\----------------------------Step 7----------------------------/");
    var pos = rest.indexOf("good")
    console.log(` The index value of word good is : ${pos}`);

    console.log("\----------------------------Step 8----------------------------/");
    console.log(`Substring starting from index 22 is: ${rest.substring(22)}`);
    console.log(`Substring starting from index 22 is: ${rest.slice(22)}`);

    console.log("\----------------------------Step 9----------------------------/");
    var cheeckStr = rest.endsWith("up");
    console.log(` String ends with word "up" is => "${cheeckStr}" `);

    console.log("\----------------------------Step 10----------------------------/");
    var checkStart = rest.startsWith("Hey");
    console.log(` String Starts with word "Hey" is => ${checkStart} `);
}

stringsHandsOn();