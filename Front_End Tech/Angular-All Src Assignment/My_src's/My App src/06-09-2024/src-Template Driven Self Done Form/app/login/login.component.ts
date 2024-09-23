import { Component } from '@angular/core';
import { UserInfo } from './userinfo';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {


   user:UserInfo = {"uid":0,"uname":"","upwd":"","uemail":"","umobile":0,"gender":"","courses":[]};

   validCourses: boolean = true;

   getFormData(data:UserInfo){

      console.log(data)

   }

   // Define onCourseChange method to handle checkbox change events
  onCourseChange(event: any) {
   const course = event.target.value;
   if (event.target.checked) {
     // Add the course if checked
     this.user.courses.push(course);
   } else {
     // Remove the course if unchecked
     const index = this.user.courses.indexOf(course);
     if (index !== -1) {
       this.user.courses.splice(index, 1);
     }
   }
   
   // Validate if at least 2 courses are selected
   this.validCourses = this.user.courses.length >= 2;
 }

}
