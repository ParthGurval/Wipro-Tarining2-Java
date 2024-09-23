package com.wipro.security.jwt.service;

import java.util.List;

import com.wipro.security.jwt.entity.Vehicle;





public interface IVehicleService {

	public Vehicle addVehicle(Vehicle ve);
    
	public Vehicle updateVehicle(Vehicle ve);
	
	public Vehicle getVehicleById(int vehicleId);
    
	public String deleteVehicleById(int vehicleId);
     
    public List<Vehicle> getAllVehicle();
    
    public Vehicle getBymodelName(String modelName);
}
