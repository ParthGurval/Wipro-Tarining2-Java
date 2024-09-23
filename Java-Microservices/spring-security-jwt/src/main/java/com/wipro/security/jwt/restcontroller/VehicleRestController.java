package com.wipro.security.jwt.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.security.jwt.entity.Vehicle;
import com.wipro.security.jwt.service.IVehicleService;




@RestController
@RequestMapping("/api/vehicles")
public class VehicleRestController {

	@Autowired
	private IVehicleService service;
	
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }
	
    
	@PostMapping("/add")
	@PreAuthorize("hasAuthority('ADMIN')")
	public Vehicle addVehicle(@RequestBody Vehicle ve) {
		
		return service.addVehicle(ve);
	}
	
	@PutMapping("/update")
	@PreAuthorize("hasAuthority('ADMIN')")
	public Vehicle updateVehicle(@RequestBody Vehicle ve) {
		
		return service.updateVehicle(ve);
	}
	
	@GetMapping("/getbyid/{vehicleId}")
	@PreAuthorize("hasAuthority('USER')")
	public Vehicle getById(@PathVariable int vehicleId) {
		
		return service.getVehicleById(vehicleId);
	}
	
	@DeleteMapping("/deletebyid/{vehicleId}")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String deleteVehicleById(@PathVariable int vehicleId) {
		
		return service.deleteVehicleById(vehicleId);
	}
	
	@GetMapping("/getall")
	@PreAuthorize("hasAuthority('ADMIN')")
	public List<Vehicle> getAllVehicle(){
		
		return service.getAllVehicle();
	}
	
	@GetMapping("/getbyename/{modelName}")
	@PreAuthorize("hasAuthority('USER')")
	public Vehicle  getBymodelName(@PathVariable String modelName) {
		
		return service.getBymodelName(modelName);
		
	}
}
