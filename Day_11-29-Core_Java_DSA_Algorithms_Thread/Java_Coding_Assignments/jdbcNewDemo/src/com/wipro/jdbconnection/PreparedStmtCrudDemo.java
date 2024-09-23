package com.wipro.jdbconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStmtCrudDemo {
	
	public static void main(String[] args) {

		Connection con = DBUtil.getDBConnection();
		
//		String query = "insert into Employees values(?,?,?)"; // ? --> positional parameters
		
		String query = "update Employees set emp_name = ? , emp_salary = ?  where emp_id = ? ";
		
		// String query = "delete from Employees where eid = ?";
		      try { 
		    	  
		    	  
		PreparedStatement pstmt = con.prepareStatement(query);
		
			// setting insert query values to positional params	
		
//		 pstmt.setInt(1, 107); pstmt.setString(2, "Jimmy"); pstmt.setInt(3, 75000);
		 
		
		// setting update query values to positional params	
		
		
		 pstmt.setString(1,"sam roy"); 
		 pstmt.setInt(2, 950000); 
		 pstmt.setInt(3, 103);
		 
		
				
				// pstmt.setInt(1,101);       // delete query param
			
			int count =	pstmt.executeUpdate(); // DML Dynamic queries
			
				System.out.println(count + " Rows affected");
			
		      
		      } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
