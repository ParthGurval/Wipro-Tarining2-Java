package com.wipro.vehicleapi.restcontroller;

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

import com.wipro.vehicleapi.dto.Owner;
import com.wipro.vehicleapi.dto.VehicleDTO;
import com.wipro.vehicleapi.dto.VehicleOwnerVO;
import com.wipro.vehicleapi.entity.Vehicle;
import com.wipro.vehicleapi.services.IVehicleService;


@RestController
@RequestMapping("/api/vehicles")
public class VehicleRestController {
	
	@Autowired
	private IVehicleService service;
	
	@PostMapping(value="/add", produces = "application/json",consumes = "application/json")
	public Vehicle addEmp(@RequestBody VehicleDTO vehicledto) {
		
		return service.addVehicle(vehicledto);
	}
	
	@PutMapping("/update")
	public Vehicle updateEmp(@RequestBody VehicleDTO vehicledto) {
		
		return service.updateVehicle(vehicledto);
	}
	
	@GetMapping(value="/getbyid/{vehicleId}")
	public VehicleDTO getById(@PathVariable int vehicleId) {
		
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
	
	@GetMapping("/get/vehicle-owner/{vehicleId}")
	public VehicleOwnerVO getVehicleAndOwnerById(@PathVariable int vehicleId) {

		return service.getVehicleAndOwnerById(vehicleId);

	}
	
	
	@PutMapping("/update/owner-by-vehicle")
	public String updateOwnerByVehicle(@RequestBody Owner owner) {
		
		
			 service.updateOwnerByVehicle(owner);
	
			 return "Owner Details Updated..";
	
	}

}
