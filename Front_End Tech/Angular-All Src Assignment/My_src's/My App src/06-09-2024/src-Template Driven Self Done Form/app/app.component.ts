import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {  // controllers
  title = 'myapp';

  name:string ="javeed";

  mydate:Date = new Date();

  salary:number = 55000;

  city:string ="HYDERABAD";

  user = {"id":"111","uname":"king","fee":8000};


}
