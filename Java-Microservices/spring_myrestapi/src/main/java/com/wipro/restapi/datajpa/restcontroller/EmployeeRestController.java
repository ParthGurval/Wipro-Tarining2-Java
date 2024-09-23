package com.wipro.restapi.datajpa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.restapi.datajpa.entity.Employee;
import com.wipro.restapi.datajpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/add")
	public Employee addEmp(@RequestBody Employee emp) {
		
		return service.addEmployee(emp);
	}
	
	@PutMapping("/update")
	public Employee updateEmp(@RequestBody Employee emp) {
		
		return service.updateEmployee(emp);
	}
	
	@GetMapping("/getbyid/{emp_id}")
	public Employee getById(@PathVariable int emp_id) {
		
		return service.getEmployeeById(emp_id);
	}
	
	@DeleteMapping("/deletebyid/{emp_id}")
	public String deleteEmployeeById(@PathVariable int emp_id) {
		
		return service.deleteEmployeeById(emp_id);
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		
		return service.getAllEmployee();
	}
	
	@GetMapping("/getbyename/{emp_name}")
	public Employee  getByemp_name(@PathVariable String emp_name) {
		
		return service.getByemp_name(emp_name);
		
	}
	
//	@GetMapping("/get-sal-gt/{emp_salary}")
//	public List<Employee> getBySalGT(@PathVariable int emp_salary) {
//
//		return service.getBySalGT(emp_salary);
//
//	}

//	
//	@GetMapping("/getsorted/{emp_salary}")
//	public List<Employee> getBySortedSal(@PathVariable int emp_salary) {
//
//		return service.getBySortedSal(emp_salary);
//
//	}
	

}
