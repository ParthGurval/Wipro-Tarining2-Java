
console.log(`_____________________________________Grade System_______________________________________`);

function gradeCalculation(marks) {
    
    if(isNaN(marks) || marks <= 0 || marks > 100){ //NaN is Not a Number
        console.log(`Please Provide Valid Marks`);
    }

    else if (marks >= 90) {
        console.log(`Fantastic Marks: "${marks}", Your Grade is A+ `);
    } 

    else if(marks >= 75 && marks < 90){
        console.log(`Excellent Marks: "${marks}", Your Grade is A `);
    }

    else if (marks >= 50 && marks < 75) {
        console.log(`Good Marks: "${marks}", Your Grade is B `);
    }

    else if (marks >= 35 && marks < 50) {
        console.log(`Marks is: "${marks}, Your grade is C, Need to improve"`);
    }
    else if(marks >= 1 && marks <35){
        console.log(`Student is Failed`);
    }
}

gradeCalculation(98);
console.log('');
gradeCalculation(80); 
console.log('');
gradeCalculation(90); 
console.log('');
gradeCalculation(0); 
console.log('');
gradeCalculation(150);
console.log('');
gradeCalculation(-7); 
console.log('');
gradeCalculation(35);
console.log('');
gradeCalculation(29);
console.log('');
gradeCalculation(64);
console.log('');
gradeCalculation(49);
console.log(''); 
gradeCalculation(91);
console.log(''); 
gradeCalculation("Eighty");
console.log(''); 
gradeCalculation(undefined);
console.log(''); 
gradeCalculation(null);