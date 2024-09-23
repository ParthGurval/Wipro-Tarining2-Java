package com.wipro.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.wipro.restapi.entities.Vehicle;

import com.wipro.restapi.exceptions.VehicleNotFoundException;
import com.wipro.restapi.service.IVehicleService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/vehicles")
public class VehicleRestController {

	@Autowired
	private IVehicleService service;
	
	@PostMapping("/add")
	public Vehicle addVehicle(@RequestBody Vehicle ve) {
		
		return service.addVehicle(ve);
	}
	
	@PutMapping("/update")
	public Vehicle updateVehicle(@RequestBody Vehicle ve) {
		
		return service.updateVehicle(ve);
	}
	
	@GetMapping("/getbyid/{vehicleId}")
	public Vehicle getById(@PathVariable int vehicleId) throws VehicleNotFoundException {
		
		Vehicle ve = service.getVehicleById(vehicleId);

		if (ve == null) {

			throw new VehicleNotFoundException();

		}

		return ve;
	}
	
	@DeleteMapping("/deletebyid/{vehicleId}")
	public String deleteVehicleById(@PathVariable int vehicleId) {
		
		return service.deleteVehicleById(vehicleId);
	}
	
	@GetMapping("/getall")
	public List<Vehicle> getAllVehicle(){
		
		return service.getAllVehicle();
	}
	
	@GetMapping("/getbymodelname/{modelName}")
	public Vehicle  getBymodelName(@PathVariable String modelName) {
		
		return service.getBymodelName(modelName);
		
	}
}
