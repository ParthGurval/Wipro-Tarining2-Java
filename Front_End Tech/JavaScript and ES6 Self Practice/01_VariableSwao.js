console.log('=======================================');
var num1 = 100;
var num2 = 200;

console.log('Value of num1 is before swap:', num1);
console.log('Value of num2 is before swap:', num2);
var temp;

temp = num1;
num1 =num2;
num2=temp;

console.log('Value of num1 is after swap:', num1, '&', 'Value of num2 is after swap:', num2);

console.log('=======================================');
var num3 = 300;
var num4 = 400;

console.log('Value of num3 is before swap:', num3, '&', 'Value of num4 is before swap:', num4);

[num3, num4] = [num4, num3];
console.log('Value of num3 after swap:', num3, '&', 'Value of num4 after swap:', num4);

