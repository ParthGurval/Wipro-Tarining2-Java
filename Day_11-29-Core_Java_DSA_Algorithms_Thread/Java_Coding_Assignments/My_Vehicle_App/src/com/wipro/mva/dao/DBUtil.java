package com.wipro.mva.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getDBConnection() {

		Connection con = null;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); // here Drivermanager class act as proxy of drivermanager class 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_vehicle_app", "root", "Parth@1020");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public static void closeDBConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
