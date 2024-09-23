
console.log("/_____________________________ Assignment No. 2 _________________________");

console.log("------------------------------- STEP-I -----------------------------------");

function maleMarriageEglibility(gender, age, boyName)
{
    gender === "Male" && age >=21 ?
    console.log(`Hey, ${boyName}, You are eligible for the marriage`) :
    console.log(`Sorry ${boyName}, You are not eligible for the marriage`);
}

maleMarriageEglibility("Male", 25, "Bill Gates");
maleMarriageEglibility("Male", 17, "Stew Jobs");
maleMarriageEglibility("Male", 21, "Elon Musk");

console.log("------------------------------- STEP-II -----------------------------------");

function femalMarriageEligibility(gender, age, girlName) 
{
    gender === "Female" && age>= 18 ?
    console.log(`Hey, ${girlName}, You are eligible for the marriage`) :
    console.log(`Sorry ${girlName}, You are not eligible for the marriage`);    
}

femalMarriageEligibility("Female", 16, "Jenifer");
femalMarriageEligibility("Female", 27, "Malinda Gates");
femalMarriageEligibility("Female", 18, "Justine Musk");