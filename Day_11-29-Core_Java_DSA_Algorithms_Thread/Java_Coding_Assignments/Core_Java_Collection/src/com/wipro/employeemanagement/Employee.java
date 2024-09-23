package com.wipro.employeemanagement;

public interface Employee {
	
    void setId(int id);
    int getId();
    
    void setName(String name);
    
    String getName();
    
    void setDepartment(String department);
    
    String getDepartment();
    
    void setSalary(double salary);
    
    double getSalary();
    
    void work();
}
