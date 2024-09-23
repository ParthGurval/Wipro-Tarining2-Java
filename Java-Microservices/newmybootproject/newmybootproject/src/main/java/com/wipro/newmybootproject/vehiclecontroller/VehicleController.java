package com.wipro.newmybootproject.vehiclecontroller;

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

import com.wipro.beans.Employee;
import com.wipro.dao.IEmployeeDAO;

@RestController
@RequestMapping("/myapi/employees")
public class VehicleController {
	
	@Autowired
	IEmployeeDAO service;

	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		service.addEmployee(emp);
		
		return emp;
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {
		
		service.updateEmployee(emp);
		
		return emp;
		
	}
	
	@DeleteMapping("/delete/{emp_id}")
	public int deleteEmployeeById(@PathVariable int emp_id) {
		
		service.deleteEmployeeById(emp_id);
		
		return emp_id;
		
	}
	
	@GetMapping("/get/{emp_id}")
	public Employee selectEmployeeById(@PathVariable int emp_id) {
		
		return service.selectEmployeeById(emp_id);
		
	}
	
	@GetMapping("/getall")
	public List<Employee> selectAll(){
		
		return service.selectAll();
		
	}
}
