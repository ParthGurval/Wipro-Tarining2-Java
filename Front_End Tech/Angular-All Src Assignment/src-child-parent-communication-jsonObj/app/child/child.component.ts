import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

    // @Input()
    // myInput:string="";


 

    // //step-1
    // @Output()
    // eventEmitter:EventEmitter<string> = new EventEmitter();


    // myOutput:string = "This is Data from Child Comp";

    // //step-2
    //   sendData(){

    //       this.eventEmitter.emit(this.myOutput);


    //   }

    @Input()
    myInput: any = {};

    @Output()  
    eventEmitter: EventEmitter<any> = new EventEmitter();

  myOutput = {

    id: 102,
    name: 'James Bonds',
    age: 25,
    salary: 60000
  }

  sendData() {
    this.eventEmitter.emit(this.myOutput);
  }


}
