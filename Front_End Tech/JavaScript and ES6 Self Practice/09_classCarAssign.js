
console.log(`_________________________________ Assignment Number 01 ______________________________________`);

console.log('');

console.log(`******************************* TASK-I *************************************`);


class car {
    comapny 
    carModel 
    transmission
    engineType
    onRoadPrice
    fuelEco 

    constructor(carCompany, modelName, transmission, carEngine, onRoadPrice, fuelEconomy){

        this.comapny = carCompany;
        this.carModel = modelName;
        this.transmission = transmission;
        this.engineType = carEngine;
        this.onRoadPrice = onRoadPrice;
        this.fuelEco = fuelEconomy;
    }

    showDetails(){
        console.log(`Car Details are as follows:
                        Car Company: ${this.comapny}, Car Model Name: ${this.carModel}, Transmission Type: ${this.transmission}, 
                        Engine Type: ${this.engineType}, On Road Pice: ${this.onRoadPrice}, Fuel Economy: ${this.fuelEco}`);

                        console.log(`-----------------------------------------------------------------------------------------------------------------`);
    };
}

let firstCar = new car("TATA", "Harrier XZ+", "CVT", "Turbo petrol Strong Hybrid",1750000, 18.5);
// console.log(firstCar);
// firstCar.showDetails();

let secondCar = new car("Mercedes", "C-Class", "IVT-RWD", "Turbo petrol ", 4500000, 15.7);
// console.log(secondCar);
// secondCar.showDetails();

let thirdCar = new car("Ford", "Everest", "Maanual", "Turbo Diesel", 3500000, 14.2);
// console.log(thirdCar);
// thirdCar.showDetails();

const carArray = [firstCar, secondCar, thirdCar];

for (const car of carArray) {
    
    console.log(`----------------- Traversing Array ---------------`);
    car.showDetails();
}

console.log('');

console.log(`******************************* TASK-II *************************************`);


class college {

    collegeName
    collegeType
    collegeLocation
    totalNumberOfStudents

    constructor(clgName, clgType, clgLocation, studNumbers){

        this.collegeName = clgName;
        this.collegeType = clgType;
        this.collegeLocation = clgLocation
        this.totalNumberOfStudents = studNumbers;
    }

    displayCollege(){

        console.log(`The College Details are as follows: 
                    College Name: ${this.collegeName}, College Type/ University: ${this.collegeType},
                    College Location: ${this.collegeLocation}, College Total Number Of Students: ${this.totalNumberOfStudents}`);
                    
                    console.log(`-----------------------------------------------------------------------------------------------------`);
    }
}

let college1 = new college("KITS College", "Engineering Autonomus", "Kolhapur", 20000);
// console.log(college1);
college1.displayCollege();

let college2 = new college("MIT", "Engineering Autonomus", "USA", 150000);
// console.log(college2);
college2.displayCollege();

let college3 = new college("Cambridge", "Engineering College, Autonomus University", "UK", 120000);
// console.log(college3);
college3.displayCollege();

console.log('');


