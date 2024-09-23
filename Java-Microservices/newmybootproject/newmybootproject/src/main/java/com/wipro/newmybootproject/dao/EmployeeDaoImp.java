package com.wipro.newmybootproject.dao;

import java.sql.Connection;




import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.beans.Employee;


@Repository
public class EmployeeDaoImp implements IEmployeeDAO {
	
	Connection con = DBUtil.getDBConnection();

	@Override
	public int addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		String inserQuery = "insert into employees (emp_id, emp_name, emp_salary) VALUES(?, ?, ?)"; // ? -> Positional Parameters
		int count = 0;
		
			try {
				
				PreparedStatement pstmt = con.prepareStatement(inserQuery);
				
				pstmt.setInt(1, emp.getEmp_id());
				pstmt.setString(2, emp.getEmp_name());
				pstmt.setInt(3, emp.getEmp_salary());
				
				count = pstmt.executeUpdate();
			} 
			
			catch (SQLException e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			
		return count;
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		 int count = 0;
		    
		    String updateQuery = "UPDATE Employees SET emp_name = ?, emp_salary = ? WHERE emp_id = ?";
		    
		    try {
		        PreparedStatement pstmt = con.prepareStatement(updateQuery);
		        
		        pstmt.setString(1, emp.getEmp_name());
		        pstmt.setInt(2, emp.getEmp_salary());
		        pstmt.setInt(3, emp.getEmp_id());
		        
		        count = pstmt.executeUpdate();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    
		    return count;
	}

	@Override
	public int deleteEmployeeById(int emp_id) {
		// TODO Auto-generated method stub

		String deleteQuery = "delete from Employees where emp_id = ?";

		int count = 0;
		try {

			PreparedStatement pstmt = con.prepareStatement(deleteQuery);

			pstmt.setInt(1, emp_id);

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public Employee selectEmployeeById(int emp_id) {
		// TODO Auto-generated method stub

		String selectOne = "select * from Employees where emp_id = ?";

		Employee emp = null;

		try {

			PreparedStatement pstmt = con.prepareStatement(selectOne);

			pstmt.setInt(1, emp_id);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				emp = new Employee(rs.getInt("emp_id"), rs.getString("emp_name"), rs.getInt("emp_salary"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
		
	}

	@Override
	public List<Employee> selectAll() {
		// TODO Auto-generated method stub

		List<Employee> list =	new ArrayList<Employee>();
		
		try {

			String selectAllQuery = "select emp_id, emp_name ,emp_salary from Employees";
			
			PreparedStatement pstmt = con.prepareStatement(selectAllQuery);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

		Employee	emp = new Employee(rs.getInt("emp_id"), rs.getString("emp_name"), rs.getInt("emp_salary"));
		list.add(emp);
				
			}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
		
	}

}
