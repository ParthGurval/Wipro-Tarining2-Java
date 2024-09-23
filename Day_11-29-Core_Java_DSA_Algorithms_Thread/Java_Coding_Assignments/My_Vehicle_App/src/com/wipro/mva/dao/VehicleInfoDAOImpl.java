package com.wipro.mva.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.wipro.mva.dao.DBUtil;
import com.wipro.mva.pojo.VehicleInfo;

public class VehicleInfoDAOImpl implements IVehicleInfoDAO {
	
	Connection con = DBUtil.getDBConnection();

	 @Override
	    public int addVehicle(VehicleInfo ve) {
	        int result = 0;
	        String sqlquery = "INSERT INTO VehicleInfo (vehicleId, vehicleModelName, purchaseDate, ownerName, mileage, purchaseCost, isInUse) VALUES (?, ?, ?, ?, ?, ?, ?)";
	        
	        try (PreparedStatement ps = con.prepareStatement(sqlquery)) {
	            ps.setString(1, ve.getVehicleId());
	            ps.setString(2, ve.getVehicleModelName());
	            ps.setDate(3, java.sql.Date.valueOf(ve.getPurchaseDate()));
	            ps.setString(4, ve.getOwnerName());
	            ps.setInt(5, ve.getMileage());
	            ps.setDouble(6, ve.getPurchaseCost());
	            ps.setBoolean(7, ve.isInUse());
	            result = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return result;
	    }

	    @Override
	    public int updateVehicle(VehicleInfo ve) {
	        int result = 0;
	        String sqlquery = "UPDATE VehicleInfo SET vehicleModelName = ?, purchaseDate = ?, ownerName = ?, mileage = ?, purchaseCost = ?, isInUse = ? WHERE vehicleId = ?";
	        
	        try (PreparedStatement ps = con.prepareStatement(sqlquery)) {
	            ps.setString(1, ve.getVehicleModelName());
	            ps.setDate(2, java.sql.Date.valueOf(ve.getPurchaseDate()));
	            ps.setString(3, ve.getOwnerName());
	            ps.setInt(4, ve.getMileage());
	            ps.setDouble(5, ve.getPurchaseCost());
	            ps.setBoolean(6, ve.isInUse());
	            ps.setString(7, ve.getVehicleId());
	            result = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return result;
	    }

	    @Override
	    public int deleteVehicleById(String vehicleId) {
	        int result = 0;
	        String sqlquery = "DELETE FROM VehicleInfo WHERE vehicleId = ?";
	        
	        try (PreparedStatement ps = con.prepareStatement(sqlquery)) {
	            ps.setString(1, vehicleId);
	            result = ps.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return result;
	    }

	    @Override
	    public VehicleInfo selectVehicleById(String vehicleId) {
	        VehicleInfo ve = null;
	        String sqlquery = "SELECT * FROM VehicleInfo WHERE vehicleId = ?";
	        
	        try (PreparedStatement ps = con.prepareStatement(sqlquery)) {
	            ps.setString(1, vehicleId);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                ve = new VehicleInfo(
	                        rs.getString("vehicleId"),
	                        rs.getString("vehicleModelName"),
	                        rs.getDate("purchaseDate").toLocalDate(),
	                        rs.getString("ownerName"),
	                        rs.getInt("mileage"),
	                        rs.getDouble("purchaseCost"),
	                        rs.getBoolean("isInUse")
	                );
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return ve;
	    }

	    @Override
	    public List<VehicleInfo> selectAll() {
	        List<VehicleInfo> vehicles = new ArrayList<>();
	        String sqlquery = "SELECT * FROM VehicleInfo";
	        
	        try (PreparedStatement ps = con.prepareStatement(sqlquery)) {
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                VehicleInfo ve = new VehicleInfo(
	                        rs.getString("vehicleId"),
	                        rs.getString("vehicleModelName"),
	                        rs.getDate("purchaseDate").toLocalDate(),
	                        rs.getString("ownerName"),
	                        rs.getInt("mileage"),
	                        rs.getDouble("purchaseCost"),
	                        rs.getBoolean("isInUse")
	                );
	                vehicles.add(ve);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	        return vehicles;
	    }

}
