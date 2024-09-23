package com.wipro.services;

import java.util.List;

import com.wipro.pojo.Vehicle;

public interface IVehicleService {
	
	int addVehicle(Vehicle ve);
    
    int updateVehicle(Vehicle ve);
    
    int deleteVehicleById(String vehicleId);
    
    Vehicle selectVehicleById(String vehicleId);
    
    List<Vehicle> selectAll();

}
