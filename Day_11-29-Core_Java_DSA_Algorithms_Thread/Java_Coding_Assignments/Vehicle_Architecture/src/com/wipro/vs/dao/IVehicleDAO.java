package com.wipro.vs.dao;

import java.util.List;

import com.wipro.vs.pojo.Vehicle;

public interface IVehicleDAO {

	int addVehicle(Vehicle ve);
    
    int updateVehicle(Vehicle ve);
    
    int deleteVehicleById(String vehicleId);
    
    Vehicle selectVehicleById(String vehicleId);
    
    List<Vehicle> selectAll();
}
