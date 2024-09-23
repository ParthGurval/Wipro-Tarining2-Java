package com.wipro.restapi.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.restapi.datajpa.entity.Employee;
import com.wipro.restapi.datajpa.repository.EmployeeRepository;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee getEmployeeById(int emp_id) {
		// TODO Auto-generated method stub
		return repo.findById(emp_id).orElse(null);
	}

	@Override
	public String deleteEmployeeById(int emp_id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(emp_id);
		
		return "Record deleted for Employee Id: " + emp_id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getByemp_name(String emp_name) {
		// TODO Auto-generated method stub
		
		return repo.findByemp_name(emp_name);
	}

//	@Override
//	public List<Employee> getBySalGT(int emp_salary) {
//		// TODO Auto-generated method stub
//		return repo.findByEmp_salaryGreaterThan(emp_salary);
//	}

//	@Override
//	public List<Employee> getBySortedSal(int emp_salary) {
//		// TODO Auto-generated method stub
//		return repo.findAllSorted(emp_salary);	
//	}



}
