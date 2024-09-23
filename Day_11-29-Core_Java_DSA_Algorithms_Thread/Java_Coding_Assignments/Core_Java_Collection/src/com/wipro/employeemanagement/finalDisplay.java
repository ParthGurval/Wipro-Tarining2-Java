package com.wipro.employeemanagement;

public class finalDisplay {

	public static void main(String[] args) {
		
        EmployeeManager manager = new EmployeeManager();

        Employee emp1 = new Manager(1, "Ashish Gujlani", "Management", 90000);
        Employee emp2 = new Developer(2, "Jinesh Patel", "Development", 80000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        manager.showAllEmployees();
    }

}
