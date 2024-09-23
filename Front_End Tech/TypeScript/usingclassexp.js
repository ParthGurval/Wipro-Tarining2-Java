var Car = /** @class */ (function () {
    function Car(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    Car.prototype.displayInfo = function () {
        console.log("Car: ".concat(this.make, " ").concat(this.model, ", Year: ").concat(this.year));
    };
    return Car;
}());
// Creating an object of the Car class
var myCar = new Car("Toyota", "Fortuner", 2020);
myCar.displayInfo(); // Output: Car: Toyota Corolla, Year: 2020
