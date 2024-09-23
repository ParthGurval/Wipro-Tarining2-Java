import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {  // controllers
  title = 'Pipes Examples';

  name:string ="Parth";

  mydate:Date = new Date();

  salary:number = 1000000;

  city:string ="Pune";

  user = {"id":"121","uname":"Richie","fee":9000000};


}
