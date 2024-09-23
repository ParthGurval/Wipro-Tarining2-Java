
console.log("/---|-----|------|------- Implicit conversion to String ---|-----|------|-------");
console.log('');
console.log('');

console.log("----------------------------------------- I ----------------------------------------------");
console.log('');

var result;

result = '3' + 2;
console.log(`Given Values: result = '3' + 2`);
console.log(`Result of Given Value is: ${result}`);
// console.log(`Reason--> As shown above val1 i.e. '3' is a string so val2 i.e. 2 has also converted to string and we get result as 32`);
console.log(`Reason--> In this Implicit conversion, val1 i.e. '3' is a String and val2 i.e. 2 is a number so when we used the conversion method "+" it converted the val2 into string and we got the result as: ${result}`);

console.log('');

console.log("----------------------------------------- II ----------------------------------------------");

console.log('');

result = '3' + true;
console.log(`Given Value: result = '3' + true`);
console.log(`Result of Given Value is: ${result     }`);
console.log(`Reason--> In this Implicit conversion, val1 i.e. '3' is a String and val2 i.e. boolean value true so when we used the conversion method "+" it converted the val2 into string and we got the result as: ${result}`);

console.log('');


console.log("----------------------------------------- III ----------------------------------------------");

console.log('');

result = '3' + undefined;
console.log(`Given Value: result = '3' + undefined`);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, val1 i.e. '3' is a String and val2 i.e. value undefined so when we used the conversion method "+" it converted the val2 into string and we got the result as: ${result}`);

console.log('');

console.log("----------------------------------------- IV ----------------------------------------------");

console.log('');

result = '3' + null;
console.log(`Given Value: result = '3' + null`);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, val1 i.e. '3' is a String and val2 i.e. null so when we used the conversion method "+" it converted the val2 into string and we got the result as: ${result}`);

console.log('');

console.log("/---|-----|------|------- Implicit Boolean conversion to Number ---|-----|------|-------");

console.log('');

console.log("----------------------------------------- I ----------------------------------------------");

console.log('');

var result;

result = '4' - true;
console.log(`Given Value: result = '4' - true`);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, val1 i.e. '4' is a String and val2 i.e. true is boolean value so while converting them, it takes val2 as a number like if 'if value is True number will be 1' & 'if value is false number will be 0' so we get output as: ${result}`);

console.log('');

console.log("----------------------------------------- II ----------------------------------------------");

console.log('');

result = 4 + true;
console.log(`Given Value: result = 4 + true`);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, val1 i.e. 4 is a number and val2 i.e. true is boolean value so while converting them, it takes val2 as a number like if 'if value is True number will be 1' & 'if value is false number will be 0' so we get output as: ${result}`);

console.log('');

console.log("----------------------------------------- III ----------------------------------------------");

console.log('');

result = 4 + false;
console.log(`Given Value: result = 4 + false`);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, val1 i.e. 4 is a number and val2 i.e. false is boolean value so while converting them, it takes val2 as a number like if 'if value is True number will be 1' & 'if value is false number will be 0' so we get output as: ${result}`);

console.log('');

console.log("/---|-----|------|------- Implicit String conversion to Number ---|-----|------|-------");

console.log('');

console.log("----------------------------------------- I ----------------------------------------------");

console.log('');

result = '4' - '2';
console.log(`Given Value: result = '4' - '2'`);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, as shown both val1 and val2 are given in string format so whenever we performs the conversion using arthmatic operator the String value gets converted into numeric value so, we got the result as: ${result}`);

console.log('');

console.log("----------------------------------------- II ----------------------------------------------");

console.log('');

result = '4' - 2;
console.log(`Given Value: '4' - 2`);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, as shown val1 is in string format and val2 is numeric. so whenever we performs the conversion using arthmatic operator the String value gets converted into numeric value so, we got the result as: ${result}`);

console.log('');

console.log("----------------------------------------- III ----------------------------------------------");

console.log('');

result = '4' * 2;
console.log(`Given Value: `);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, as shown val1 is in string format and val2 is numeric. so whenever we performs the conversion using arthmatic operator the String value gets converted into numeric value so, we got the result as: ${result}`);

console.log('');

console.log("----------------------------------------- IV ----------------------------------------------");

console.log('');

result = '4' / 2;
console.log(`Given Value: `);
console.log(`Result of Given Value is: ${result}`);
console.log(`Reason--> In this Implicit conversion, as shown val1 is in string format and val2 is numeric. so whenever we performs the conversion using arthmatic operator the String value gets converted into numeric value so, we got the result as: ${result}`);