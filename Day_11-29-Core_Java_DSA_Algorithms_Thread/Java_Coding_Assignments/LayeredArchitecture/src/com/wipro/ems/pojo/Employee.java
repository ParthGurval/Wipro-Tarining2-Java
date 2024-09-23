package com.wipro.ems.pojo;

public class Employee { // POJO or DTO or Entity or Beans
	
	private int emp_id;
	private String emp_name;
	private int emp_salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(int emp_id, String emp_name, int emp_salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}


	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public int getEmp_salary() {
		return emp_salary;
	}


	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + "]";
	}
	
	

}
