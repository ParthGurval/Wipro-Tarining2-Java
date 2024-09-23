import { Component } from '@angular/core';

@Component({
  selector: '<app-root>',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {  // controllers
  title = 'myapp';

  parentData:string ="This is parent Data from AppComp"


  childData:string = "";

    getChildData(data:any){

        console.log(data)

        this.childData  = data;

    }



}
