import { Component } from '@angular/core';
import { Employee } from 'src/app/modules/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-displayallemployee',
  templateUrl: './displayallemployee.component.html',
  styleUrls: ['./displayallemployee.component.css']
})
export class DisplayallemployeeComponent {

  employees: Employee[] = [];
  filteredEmployees: Employee[] = []; // Declare filteredEmployees
  isDataLoaded: boolean = false;

  constructor(private empService: EmployeeService) {}

  ngOnInit() {
    this.empService.getEmployees().subscribe({
      next: (data) => {
        this.employees = data;
        this.filteredEmployees = data; // Initialize filteredEmployees with all employees
        this.isDataLoaded = true;
      },
      error: (err) => {
        console.error('Error fetching employees:', err);
      }
    });
  }

  // Add a filtering function if necessary, for example to filter based on a search query
  filterEmployees(query: string) {
    this.filteredEmployees = this.employees.filter(employee =>
      employee.ename.toLowerCase().includes(query.toLowerCase())
    );
  }

}
