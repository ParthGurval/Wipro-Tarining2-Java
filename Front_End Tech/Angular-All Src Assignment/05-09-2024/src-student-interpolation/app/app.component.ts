import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {  // controllers
  title = 'angular app component';

  id:number  = 101;

  name:string = "Parth"

  constructor(){

      console.log('AppComponent object is created...')

  }


    sayHello(){

        alert("Hello Friends from AppComp");


    }


}
