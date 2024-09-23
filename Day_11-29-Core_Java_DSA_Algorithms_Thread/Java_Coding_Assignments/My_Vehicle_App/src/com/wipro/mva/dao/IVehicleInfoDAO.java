package com.wipro.mva.dao;

import java.util.List;

import com.wipro.mva.pojo.VehicleInfo;

public interface IVehicleInfoDAO {
	
	int addVehicle(VehicleInfo ve);
    
    int updateVehicle(VehicleInfo ve);
    
    int deleteVehicleById(String vehicleId);
    
    VehicleInfo selectVehicleById(String vehicleId);
    
    List<VehicleInfo> selectAll();

}
