import { Component } from '@angular/core';
import { Employee } from 'src/app/modules/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-updateemployee',
  templateUrl: './updateemployee.component.html',
  styleUrls: ['./updateemployee.component.css']
})
export class UpdateemployeeComponent {
  employee: Employee = new Employee();
  employeeId: number = 0;

  constructor(private empService: EmployeeService) {}

  // Fetch employee details by ID
  fetchEmployee() {
    if (this.employeeId) {
      this.empService.getEmployeeById(this.employeeId).subscribe({
        next: (emp) => {
          this.employee = emp;
        },
        error: (err) => {
          console.error('Error fetching employee:', err);
          alert('Employee not found!'); // Alert to indicate fetch failure
        }
      });
    }
  }

  // Update employee details
  updateEmployee() {
    this.empService.updateEmployee(this.employee).subscribe({
      next: (emp) => {
        console.log('Employee updated:', emp);
        alert('Employee updated successfully!');
      },
      error: (err) => {
        console.error('Error updating employee:', err);
      }
    });
  }
}
