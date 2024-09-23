package com.wipro.employeemanagement;

public class Developer extends AbstractEmployee {

    public Developer(int id, String name, String department, double salary) {
        
    	setId(id);
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }

    @Override
    public void work() {
    	
        System.out.println("Writing and testing code.");
    }
}

