import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/modules/employee';
import { EmployeeService } from 'src/app/service/employee.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

  data: string = '';
  employees: Employee[] = [];
  filteredEmployees: Employee[] = [];

  constructor(private empService: EmployeeService, private router: Router) {}

  // Method to search employees by name or other criteria
  find(searchData: any) {
    const searchQuery = searchData.form.value.data.trim().toLowerCase();
    if (searchQuery) {
      this.empService.getEmployees().subscribe((employees) => {
        this.filteredEmployees = employees.filter(employee =>
          employee.ename.toLowerCase().includes(searchQuery)
        );
        console.log("Search results:", this.filteredEmployees);
      });
    } else {
      this.filteredEmployees = [];
    }
  }
  

}
