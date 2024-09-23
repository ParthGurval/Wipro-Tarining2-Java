package com.wipro.springsecurityapp.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.springsecurityapp.entity.Vehicle;
import com.wipro.springsecurityapp.service.IVehicleService;



@RestController
@RequestMapping("/api/vehicles")
public class VehicleRestController {

	@Autowired
	private IVehicleService service;
	
	@PostMapping("/add")
	public Vehicle addEmp(@RequestBody Vehicle ve) {
		
		return service.addVehicle(ve);
	}
	
	@PutMapping("/update")
	public Vehicle updateEmp(@RequestBody Vehicle ve) {
		
		return service.updateVehicle(ve);
	}
	
	@GetMapping("/getbyid/{vehicleId}")
	public Vehicle getById(@PathVariable int vehicleId) {
		
		return service.getVehicleById(vehicleId);
	}
	
	@DeleteMapping("/deletebyid/{vehicleId}")
	public String deleteVehicleById(@PathVariable int vehicleId) {
		
		return service.deleteVehicleById(vehicleId);
	}
	
	@GetMapping("/getall")
	public List<Vehicle> getAllVehicle(){
		
		return service.getAllVehicle();
	}
}
