import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {  // controllers
  title = 'angular app component';

  order_id:number  = 101;

  cust_name:string = "Shanron"

  cust_age:number = 30;

  cust_balance:number = 7000.00;

  cust_married:boolean = false;

  constructor(){

      console.log('AppComponent object is created...')

  }


    // Simple test function
    sayHello(){

        alert("Hello Friends from AppComp");


    }

  // Function to update customer balance
  updateBalance(newBalance: number) {

    this.cust_balance = newBalance;
    console.log(`Customer balance updated to ${this.cust_balance}`);
  }

  // Function to toggle marital status
  toggleMarriedStatus() {

    this.cust_married = !this.cust_married;
    console.log(`Customer married status: ${this.cust_married}`);
  }

  // Function to increment customer age
  incrementAge() {

    this.cust_age += 1;
    console.log(`Customer age incremented to ${this.cust_age}`);
  }

  // Function to reset customer details
  resetCustomerDetails() {
    this.cust_name = '';
    this.cust_age = 0;
    this.cust_balance = 0;
    this.cust_married = false;
    console.log('Customer details have been reset.');
  }

}
