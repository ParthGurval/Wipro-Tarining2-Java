package com.wipro.newspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wipro.newspring.entity.Vehicle;
import com.wipro.newspring.repository.VehicleRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class VehicleServiceImpl implements IVehicleService {
	
	@Autowired
	 private  VehicleRepository repo;

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
//	public String deleteVehicleById(int vehicleId)
	public ResponseEntity<String> deleteVehicleById(int vehicleId) {
		// TODO Auto-generated method stub
		
		if (!repo.existsById(vehicleId)) {
	        return new ResponseEntity<>("Vehicle with ID " + vehicleId + " does not exist.", HttpStatus.NOT_FOUND);
	    }
	    repo.deleteById(vehicleId);
	    return new ResponseEntity<>("Record Deleted For Vehicle ID: " + vehicleId, HttpStatus.OK);
	}

	@Override
	public List<Vehicle> selectAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Vehicle getByModelName(String modelName) {
		// TODO Auto-generated method stub
		return repo.findByModelName(modelName);
	}

	@Override
	public ResponseEntity<String> deleteByOwnerName(String ownerName) {
		// TODO Auto-generated method stub
		
		repo.deleteByOwnerName(ownerName);
		return new ResponseEntity<String>("Record Deleted...", HttpStatus.ACCEPTED);
	}

}
