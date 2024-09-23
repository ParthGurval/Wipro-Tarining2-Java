class Car {
    make: string;
    model: string;
    year: number;

    constructor(make: string, model: string, year: number) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    displayInfo(): void {
        console.log(`Car: ${this.make} ${this.model}, Year: ${this.year}`);
    }
}

// Creating an object of the Car class
const myCar = new Car("Toyota", "Fortuner", 2020);
myCar.displayInfo(); // Output: Car: Toyota Corolla, Year: 2020
