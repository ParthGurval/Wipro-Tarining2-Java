package com.wipro.vs.service;

import java.util.List;

import com.wipro.vs.pojo.Vehicle;


public interface IVehicleService {
	
	int addVehicle(Vehicle ve);
    
    int updateVehicle(Vehicle ve);
    
    int deleteVehicleById(String vehicleId);
    
    Vehicle selectVehicleById(String vehicleId);
    
    List<Vehicle> selectAll();

}
