package com.wipro.security.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.security.jwt.entity.Vehicle;
import com.wipro.security.jwt.repository.VehicleRepository;



@Service
public class VehicleServiceImpl implements IVehicleService {
	
	@Autowired
	private VehicleRepository repo;

	@Override
	public Vehicle addVehicle(Vehicle ve) {
		// TODO Auto-generated method stub
		return repo.save(ve);
	}

	@Override
	public Vehicle updateVehicle(Vehicle ve) {
		// TODO Auto-generated method stub
		return repo.save(ve);
	}

	@Override
	public Vehicle getVehicleById(int vehicleId) {
		// TODO Auto-generated method stub
		return repo.findById(vehicleId).orElse(null);
	}

	@Override
	public String deleteVehicleById(int vehicleId) {
		// TODO Auto-generated method stub
		
		repo.deleteById(vehicleId);
		
		return "Record deleted for Vehicle ID:" + vehicleId;
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Vehicle getBymodelName(String modelName) {
		// TODO Auto-generated method stub
		return repo.findByModelName(modelName);
	}

}
