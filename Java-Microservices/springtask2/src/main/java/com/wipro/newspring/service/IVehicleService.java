package com.wipro.newspring.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wipro.newspring.entity.Vehicle;



public interface IVehicleService {
	
	public Vehicle addVehicle(Vehicle ve);
    
	public Vehicle updateVehicle(Vehicle ve);
    
    public Vehicle getVehicleById(int vehicleId);
    
//    public Vehicle deleteVehicleById(int vehicleId);
    public ResponseEntity<String> deleteVehicleById(int vehicleId);
    
    public List<Vehicle> selectAll();

    public Vehicle getByModelName(String modelName);
    
    public ResponseEntity<String> deleteByOwnerName(String ownerName);
}
