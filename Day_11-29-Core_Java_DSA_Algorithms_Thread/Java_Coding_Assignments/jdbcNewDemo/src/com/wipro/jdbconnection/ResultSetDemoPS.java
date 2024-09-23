package com.wipro.jdbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetDemoPS {
	
	public static void main(String[] args) {


		Connection con =	DBUtil.getDBConnection();
		
String query = "select emp_id,emp_name ,emp_salary from employees ";

//String query = "select emp_id,emp_name ,emp_salary from Employees where emp_salary > ? ";
		
		try {
			PreparedStatement pstmt =	con.prepareStatement(query);
			
			
			//pstmt.setInt(1, 50000);
			
			ResultSet rs =	pstmt.executeQuery();
					
			while(rs.next()) {
				
				
				System.out.println(rs.getInt("emp_id") + " " + rs.getString("emp_name") + " " + rs.getDouble("emp_salary"));
				
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}

}
