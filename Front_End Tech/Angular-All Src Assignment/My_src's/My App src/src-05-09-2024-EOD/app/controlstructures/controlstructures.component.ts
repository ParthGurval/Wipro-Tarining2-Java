import { Component } from '@angular/core';

@Component({
  selector: 'app-controlstructures',
  templateUrl: './controlstructures.component.html',
  styleUrls: ['./controlstructures.component.css']
})
export class ControlstructuresComponent {

  // New variables for testing
  num1:number = 0;
  num2:number = 0;

   // Variable for storing the entered car ID and the selected car details
   enteredCarId: number | null = null;  // here we have allowed both numbers and null values 
   selectedCar: any = null;
  
  // employees = [

  //   {"id":101,"ename":"king","salary":50000} ,
  //   {"id":102,"ename":"tom","salary":40000} ,
  //   {"id":103,"ename":"smith","salary":20000} ,
  //   {"id":104,"ename":"ford","salary":10000}
  // ];

  cars = [

    {"car_id":101, "car_comapny": "Honda", "car_model": "Civic", "car_price": 1000000, "car_registred":true}, 
    {"car_id":102, "car_comapny": "Tata", "car_model": "Curvv", "car_price": 840000, "car_registred":true}, 
    {"car_id":103, "car_comapny": "Mahindra", "car_model": "Jeep", "car_price": 750000, "car_registred":false}, 
    {"car_id":110, "car_comapny": "Volkswagen", "car_model": "Taigun", "car_price": 1200000, "car_registred":true}, 
    {"car_id":112, "car_comapny": "Mercedes", "car_model": "C-Class", "car_price": 4000000, "car_registred":true}
    
  ]

  // Function to find a car by the entered ID
  findCarById() {
    // Find the car based on entered ID
    this.selectedCar = this.cars.find(car => car.car_id === this.enteredCarId);
  }


  // Function for testing
  myFunc(): boolean {
    return this.num1 > this.num2; 
  }

}
