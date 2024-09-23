package com.wipro.newmybootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.beans.Employee;
import com.wipro.dao.EmployeeDaoImp;
import com.wipro.dao.IEmployeeDAO;


@Service("service")
public class EmployeeServiceImp implements IEmployeeService {
	
	@Autowired
	private IEmployeeDAO dao;


	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		return dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}

	@Override
	public int deleteEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return dao.deleteEmployeeById(eid);
	}

	@Override
	public Employee selectEmployeeById(int eid) {
		// TODO Auto-generated method stub
		return dao.selectEmployeeById(eid);
	}

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	
}
