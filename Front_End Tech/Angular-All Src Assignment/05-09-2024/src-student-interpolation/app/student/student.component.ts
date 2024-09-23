import { Component, OnInit } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit  {

  // Initialize student properties
  sid: number = 111;
  sname: string = "King";
  list: number[] = [1, 2, 3, 4, 5];

    constructor(){

        console.log("stduent constructor called obj created");

    }


    ngOnInit(): void {
    
      console.log("ngOnInit() called..");
    
    }

     // Event handling function to reset student details
  resetStudent(): void {
    this.sid = 0;
    this.sname = 'Unknown';
    console.log("Student details reset.");
  }

}
