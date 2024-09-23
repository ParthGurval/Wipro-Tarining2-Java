package com.wipro.newspring.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.newspring.entity.Vehicle;
import com.wipro.newspring.exception.VehicleNotFoundException;
import com.wipro.newspring.service.IVehicleService;


@RestController
@RequestMapping("/api/vehicles")
public class VehicleRestController {
	
	@Autowired
	private IVehicleService service;

	@PostMapping("/add")
	public Vehicle add(@RequestBody Vehicle ve) {

		return service.addVehicle(ve);

	}

	@PutMapping("/update")
	public Vehicle update(@RequestBody Vehicle ve) {

		return service.updateVehicle(ve);

	}

	@GetMapping("/getbyid/{vehicleId}")
	public Vehicle getById(@PathVariable int vehicleId) throws VehicleNotFoundException {
		
		Vehicle ve1 = service.getVehicleById(vehicleId);
		
			if(ve1 == null) {
				
				throw new VehicleNotFoundException();
			}

		return ve1;

	}

	@DeleteMapping("/deletebyid/{vehicleId}")
//	public String deleteVehicleById(@PathVariable int vehicleId)
	public ResponseEntity<String> deleteVehicleById(@PathVariable int vehicleId) {

//		return service.deleteVehicleById(vehicleId);
		
		ResponseEntity<String> response = service.deleteVehicleById(vehicleId);
	    if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
	        throw new VehicleNotFoundException("Vehicle with ID " + vehicleId + " does not exist.");
	    }
	    return response;
	}

	@GetMapping("/getall")
	public List<Vehicle> getAllVehicle() {

		return service.selectAll();

	}
	
	@GetMapping("/getbymodelname")
	public Vehicle getByModelName(@PathVariable String modelName) {
		
		return service.getByModelName(modelName);
	}
	
	@DeleteMapping("/deletebyownername/{ownerName}")
	public ResponseEntity<String> deleteByOwnerName(@PathVariable String ownerName){
		
		return service.deleteByOwnerName(ownerName);
		
	}

}
