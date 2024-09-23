package com.wipro.restapi.service;

import java.util.List;

import com.wipro.restapi.entities.Vehicle;



public interface IVehicleService {

	public Vehicle addVehicle(Vehicle ve);
    
	public Vehicle updateVehicle(Vehicle ve);
	
	public Vehicle getVehicleById(int vehicleId);
    
	public String deleteVehicleById(int vehicleId);
     
    public List<Vehicle> getAllVehicle();
    
    public Vehicle getBymodelName(String modelName);
}
