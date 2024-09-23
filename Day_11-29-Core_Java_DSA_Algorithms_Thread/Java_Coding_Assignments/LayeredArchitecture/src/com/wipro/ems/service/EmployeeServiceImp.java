package com.wipro.ems.service;

import java.util.List;

import com.wipro.ems.dao.EmployeeDaoImp;
import com.wipro.ems.dao.IEmployeeDAO;
import com.wipro.ems.pojo.Employee;

public class EmployeeServiceImp implements IEmployeeService {
	
	private IEmployeeDAO dao;

	public EmployeeServiceImp() {
		
		dao = new EmployeeDaoImp();
	}

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
