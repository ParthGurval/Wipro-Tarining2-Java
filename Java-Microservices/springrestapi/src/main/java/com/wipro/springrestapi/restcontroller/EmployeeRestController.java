package com.wipro.springrestapi.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springrestapi.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	
	static	List<Employee>  empList ;
	
	static {
		
		empList = new ArrayList<Employee>();
		
	}
	

	@GetMapping("/get/{eid}")
	public String getById(@PathVariable int eid) {

		return eid + " record found";

	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable int eid) {

		return eid + " record deleted ";

	}
	
	

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {
		
			empList.add(emp);

		return emp;

	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {

			
			  
			  empList.add(emp);
		
		
		return emp;

	}
	
	@GetMapping("/getall")
	public List<Employee>  getAll(){
		
		return  empList;
		
	}
	
	

}
