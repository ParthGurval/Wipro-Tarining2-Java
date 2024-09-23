package com.wipro.employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	
    private List<Employee> employees;

    public EmployeeManager() {
    	
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
    	
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
    	
        employees.remove(employee);
    }

    public void showAllEmployees() {
    	
        for (Employee employee : employees) {
        	
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() +", Department: " + employee.getDepartment() + ", Salary: " + employee.getSalary());
            employee.work();
        }
    }
}
