
const professor = {

  profName: "Sameer Patil",
  profAge:  35,
  profRelativeExperience: "5 Years",
  profSalary: 600000,
  profPost: "HOD of CSE",
  
  address: {
      coutry: "India",
      state:  "Maharashtra",
      district: "Kolhapur",
      area:   "Shalini Palace road, Rankala",
      landmark: " near Ambai Tank Club",
      pinCode: "416023",
  },

  degrees: {
      engineering: "CSE-B.E.",
      masters: "Embedded Systems",
      phd: "ADV Computing",
      catExam: "AIR 98",
      mba: "MBA Human Resource Management",

      getDegree: function(){

         return `Teacher Degrees: ${this.engineering}, ${this.masters}, ${this.phd}, ${this.catExam}, ${this.mba},`
      }
  },

  certificates: ["Hacker Rank Participation", "IFE Certificate", "Advance Programming in Python", "B.tech Degree", "Masters Degree", "PHD"],

} 
console.log(`--------------------------- STEP-I --------------------------------`);
console.log(professor);

console.log(`--------------------------- STEP-Extra --------------------------------`);
console.log(professor.address);


console.log(`--------------------------- STEP-II --------------------------------`);
console.log(professor.degrees);

console.log(`--------------------------- STEP-III --------------------------------`);
console.log(professor.certificates);

console.log(`--------------------------- STEP-IV --------------------------------`);
console.log(professor.degrees.getDegree());

console.log(`--------------------------- STEP-V --------------------------------`);
professor.totalExperience = "15 Years";
console.log(`New added property and value is: Professor.totalExperience: ${professor.totalExperience}`);

console.log(`--------------------------- STEP-VI --------------------------------`);
professor.profSalary = 800000;
console.log(`The Changed value is: profSalary: ${professor.profSalary}`);
console.log(professor);

console.log(`--------------------------- STEP-VII --------------------------------`);

professor.certificates.push("Oracle Certified");
console.log(professor.certificates);

console.log(`--------------------------- STEP-VIII --------------------------------`);
console.log(professor.certificates.slice(-1)[0]);

// or 

console.log('');

console.log(professor.certificates[professor.certificates.length-1]);