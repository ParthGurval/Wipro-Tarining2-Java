package com.wipro.restapi.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.datajpa.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {
	
	
	public Employee findByemp_name(String emp_name);
	
//    public List<Employee> findByEmp_salaryGreaterThan(int emp_salary);
//    
//    @Query("select e from Employee e where e.emp_salary > ?1 order by e.emp_salary")
//    public List<Employee> findAllSorted(int emp_salary);
	
}
