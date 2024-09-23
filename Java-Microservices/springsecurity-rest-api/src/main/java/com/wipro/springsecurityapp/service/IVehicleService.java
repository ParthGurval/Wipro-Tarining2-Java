package com.wipro.springsecurityapp.service;

import java.util.List;

import com.wipro.springsecurityapp.entity.Vehicle;



public interface IVehicleService {

	public Vehicle addVehicle(Vehicle ve);
    
	public Vehicle updateVehicle(Vehicle ve);
	
	public Vehicle getVehicleById(int vehicleId);
    
	public String deleteVehicleById(int vehicleId);
     
    public List<Vehicle> getAllVehicle();
}
