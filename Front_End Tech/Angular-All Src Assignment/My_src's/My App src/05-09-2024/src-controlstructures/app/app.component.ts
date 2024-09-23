import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {  // controllers
  title = 'myapp';

  username:string = "king khan";

  city:string =  "pune";

    




 // url="../assets/spiderman.png"

  url = "../assets/Ferrari.png"

  url_gif = "../assets/ferrari-car.gif"

  update(){

    this.username = "Ronaldo";

      return "Value from update()"

  }


}

