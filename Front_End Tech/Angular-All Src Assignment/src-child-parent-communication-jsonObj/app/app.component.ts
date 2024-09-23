import { Component } from '@angular/core';

@Component({
  selector: '<app-root>',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {  // controllers
  title = 'myapp';

  parentDataObj = { id: 101 , name: "Harry", age: 30, salary: 10000000 };

 //Here we receveied the data from child component
 childData: any = {};

 // Here we receive child data ( as a JSON object)
 getChildData(data: any) {
   console.log('Data from child:', data);
   this.childData = data;
 }

  // parentData:string ="This is parent Data from AppComp"


  // childData:string = "";

  //   getChildData(data:any){

  //       console.log(data)

  //       this.childData  = data;

  //   }



}
