import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'This is my first angular';

  id:number = 110;

  name:string = "parth"

  sayHello(){

    alert("This is demo function from AppComponent")
  }
}
