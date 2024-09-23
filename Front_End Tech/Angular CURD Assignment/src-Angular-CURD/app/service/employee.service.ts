import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../modules/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseURL = 'http://localhost:3000/employees';

  constructor(private http: HttpClient) {}

  // Add Employee
  addEmployee(employee: Employee): Observable<Employee> {
    return this.http.post<Employee>(this.baseURL, employee);
  }

  // Get All Employees
  getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.baseURL);
  }

  // Get Employee By ID
  getEmployeeById(id: number): Observable<Employee> {
    return this.http.get<Employee>(`${this.baseURL}/${id}`);
  }

  // Update Employee
  updateEmployee(employee: Employee): Observable<Employee> {
    return this.http.put<Employee>(`${this.baseURL}/${employee.id}`, employee);
  }

  // Delete Employee
  deleteEmployee(id: number): Observable<void> {
    return this.http.delete<void>(`${this.baseURL}/${id}`);
  }
}
