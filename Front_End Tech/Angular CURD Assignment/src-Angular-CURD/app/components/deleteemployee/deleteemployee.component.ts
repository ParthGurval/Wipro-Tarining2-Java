import { Component } from '@angular/core';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-deleteemployee',
  templateUrl: './deleteemployee.component.html',
  styleUrls: ['./deleteemployee.component.css']
})
export class DeleteemployeeComponent {

  employeeId: number = 0;

  constructor(private empService: EmployeeService) {}

  deleteEmployee() {
    if (this.employeeId) {
      this.empService.deleteEmployee(this.employeeId).subscribe({
        next: () => {
          console.log('Employee deleted');
          alert('Employee deleted successfully!');
          this.employeeId = 0; // Reset form
        },
        error: (err) => {
          console.error('Error deleting employee:', err);
        }
      });
    }
  }

}
