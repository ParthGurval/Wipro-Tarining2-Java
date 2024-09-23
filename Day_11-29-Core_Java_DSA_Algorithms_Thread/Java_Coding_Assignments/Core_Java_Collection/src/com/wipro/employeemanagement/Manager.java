package com.wipro.employeemanagement;

public class Manager extends AbstractEmployee {

    public Manager(int id, String name, String department, double salary) {
        
    	setId(id);
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }

    @Override
    public void work() {
    	
        System.out.println("Managing the team and making strategic decisions.");
    }
}
