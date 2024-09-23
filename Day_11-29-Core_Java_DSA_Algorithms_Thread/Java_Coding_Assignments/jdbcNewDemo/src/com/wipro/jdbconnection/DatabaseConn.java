package com.wipro.jdbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empappdemo", "root", "Parth@1020");

			Statement stmt = con.createStatement(); // for static queries

			
//			String query1 = " insert into Employees values(102,'tom',30000) ";
//			String query2 = " insert into Employees values(104,'leo',70000) ";
//			String query3 = " insert into Employees values(105,'bin',35000) ";
//			String query4 = " insert into Employees values(103,'sam',900000) ";
			
			
//			String query1 = "update Employees set emp_name = 'tom hardey' , emp_salary = 40000 WHERE emp_id = 102"; 
//			String query2 = "update Employees set emp_name = 'steave' WHERE emp_id = 105"; 
			
//			String query1 = " insert into Employees values(106,'Jack',760000) ";
			
			String query1 = " delete from Employees WHERE emp_id = 106";
			
			int count1 = stmt.executeUpdate(query1);
//			int count2 = stmt.executeUpdate(query2);
//			int count3 = stmt.executeUpdate(query3);
//			int count4 = stmt.executeUpdate(query4);

			System.out.println(count1 + "  Records affected");
//			System.out.println(count2 + "  Records affected");
//			System.out.println(count3 + "  Records affected");
//			System.out.println(count4 + "  Records affected");

			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
