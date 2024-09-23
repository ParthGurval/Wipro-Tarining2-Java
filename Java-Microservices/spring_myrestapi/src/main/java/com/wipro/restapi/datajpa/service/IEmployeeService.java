package com.wipro.restapi.datajpa.service;

import java.util.List;

import com.wipro.restapi.datajpa.entity.Employee;

public interface IEmployeeService {

	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public Employee getEmployeeById(int emp_id);
	
	public String deleteEmployeeById(int emp_id);
	
	public List<Employee> getAllEmployee();
	
	public Employee  getByemp_name(String emp_name);
	
//	public List<Employee>  getBySalGT(int emp_salary);
//
//	public List<Employee>  getBySortedSal(int emp_salary);
	
}
