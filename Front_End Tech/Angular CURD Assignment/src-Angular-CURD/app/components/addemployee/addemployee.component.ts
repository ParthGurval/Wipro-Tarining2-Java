import { Component } from '@angular/core';
import { Employee } from 'src/app/modules/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-addemployee',
  templateUrl: './addemployee.component.html',
  styleUrls: ['./addemployee.component.css']
})
export class AddemployeeComponent {

  // employeeList:Employee[] = [];

  // flag:boolean=false;
  // constructor(private service: EmployeeService){}

  // insertData(data:Employee){
  //   console.log(data)
  //   this.service.insert(data).subscribe((prod)=>{console.log("Product Added", prod)})
  // }

  employee: Employee = new Employee();

  constructor(private empService: EmployeeService) {}

  addEmployee() {
    this.empService.addEmployee(this.employee).subscribe({
      next: (emp) => {
        console.log('Employee added:', emp);
        alert('Employee added successfully!');
        this.employee = new Employee(); // Reset form
      },
      error: (err) => {
        console.error('Error adding employee:', err);
      }
    });
  }

}
