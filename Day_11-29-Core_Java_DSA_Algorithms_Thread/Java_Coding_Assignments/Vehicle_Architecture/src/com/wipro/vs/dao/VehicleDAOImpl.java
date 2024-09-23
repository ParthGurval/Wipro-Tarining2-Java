package com.wipro.vs.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import com.wipro.vs.pojo.Vehicle;
import java.sql.*;

public class VehicleDAOImpl implements IVehicleDAO {
	
	Connection con = DBUtil.getDBConnection();

	@Override
	public int addVehicle(Vehicle ve) {
		// TODO Auto-generated method stub
		
		String insertQuery = "insert into vehicleinfo (vehicleId, vehicleType, modelName, purchaseDate, vehicleNumber, vehicleAge, ownerName, purchaseCost, currentCost, isInUse) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int count = 0;

        try {
            PreparedStatement pstmt = con.prepareStatement(insertQuery);
            pstmt.setString(1, ve.getVehicleId());
            pstmt.setString(2, ve.getVehicleType());
            pstmt.setString(3, ve.getModelName());
            pstmt.setDate(4, Date.valueOf(ve.getPurchaseDate()));
            pstmt.setString(5, ve.getVehicleNumber());
            pstmt.setInt(6, ve.getVehicleAge());
            pstmt.setString(7, ve.getOwnerName());
            pstmt.setDouble(8, ve.getPurchaseCost());
            pstmt.setDouble(9, ve.getCurrentCost());
            pstmt.setBoolean(10, ve.isInUse());

            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
		
	}

	@Override
	public int updateVehicle(Vehicle ve) {
		// TODO Auto-generated method stub
		
		String updateQuery = "update vehicleinfo SET vehicleType = ?, modelName = ?, purchaseDate = ?, vehicleNumber = ?, vehicleAge = ?, ownerName = ?, purchaseCost = ?, currentCost = ?, isInUse = ? WHERE vehicleId = ?";
        int count = 0;

        try {
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setString(1, ve.getVehicleType());
            pstmt.setString(2, ve.getModelName());
            pstmt.setDate(3, Date.valueOf(ve.getPurchaseDate()));
            pstmt.setString(4, ve.getVehicleNumber());
            pstmt.setInt(5, ve.getVehicleAge());
            pstmt.setString(6, ve.getOwnerName());
            pstmt.setDouble(7, ve.getPurchaseCost());
            pstmt.setDouble(8, ve.getCurrentCost());
            pstmt.setBoolean(9, ve.isInUse());
            pstmt.setString(10, ve.getVehicleId());

            count = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
		
	}

	@Override
	public int deleteVehicleById(String vehicleId) {
		// TODO Auto-generated method stub
		
		 String deleteQuery = "delete from vehicleinfo WHERE vehicleId = ?";
	        int count = 0;

	        try {
	            PreparedStatement pstmt = con.prepareStatement(deleteQuery);
	            pstmt.setString(1, vehicleId);
	            count = pstmt.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return count;
		
	}

	@Override
	public Vehicle selectVehicleById(String vehicleId) {
		// TODO Auto-generated method stub
		
		String selectOneQuery = "SELECT * FROM vehicleinfo WHERE vehicleId = ?";
        Vehicle vehicle = null;

        try {
            PreparedStatement pstmt = con.prepareStatement(selectOneQuery);
            pstmt.setString(1, vehicleId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                vehicle = new Vehicle(
                        rs.getString("vehicleId"),
                        rs.getString("vehicleType"),
                        rs.getString("modelName"),
                        rs.getDate("purchaseDate").toLocalDate(),
                        rs.getString("vehicleNumber"),
                        rs.getInt("vehicleAge"),
                        rs.getString("ownerName"),
                        rs.getDouble("purchaseCost"),
                        rs.getDouble("currentCost"),
                        rs.getBoolean("isInUse")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vehicle;
		
	}

	@Override
	public List<Vehicle> selectAll() {
		// TODO Auto-generated method stub
		  List<Vehicle> list = new ArrayList<>();

	        try {
	            String selectAllQuery = "SELECT * FROM vehicleinfo";
	            PreparedStatement pstmt = con.prepareStatement(selectAllQuery);
	            ResultSet rs = pstmt.executeQuery();

	            while (rs.next()) {
	                Vehicle vehicle = new Vehicle(
	                        rs.getString("vehicleId"),
	                        rs.getString("vehicleType"),
	                        rs.getString("modelName"),
	                        rs.getDate("purchaseDate").toLocalDate(),
	                        rs.getString("vehicleNumber"),
	                        rs.getInt("vehicleAge"),
	                        rs.getString("ownerName"),
	                        rs.getDouble("purchaseCost"),
	                        rs.getDouble("currentCost"),
	                        rs.getBoolean("isInUse")
	                );

	                list.add(vehicle);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return list;
	        
	}

}
