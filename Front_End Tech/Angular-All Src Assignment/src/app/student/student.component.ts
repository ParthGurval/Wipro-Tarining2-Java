import { Component } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {

  sid:number = 120;
  sname:string = "king"

  list:number[] = [1, 2, 3, 4, 5]

  sayHello(){

    alert("This is demo function from Student Component")
  }

}
