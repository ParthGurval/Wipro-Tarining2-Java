package com.wipro.jdbconnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = DBUtil.getDBConnection();

		try {

			CallableStatement cstmt = con.prepareCall(" { call emp_pro(?,?,?)  } ");  // ? -> parameter

			cstmt.setInt(1, 106);
			cstmt.setString(2, "Satish");
			cstmt.setInt(3, 45000);

			cstmt.execute(); // execute emp_pro procedure
			
			System.out.println("Procedure executed plz check DB to verify");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
