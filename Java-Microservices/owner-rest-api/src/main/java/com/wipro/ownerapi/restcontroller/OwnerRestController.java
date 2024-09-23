package com.wipro.ownerapi.restcontroller;

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

import com.wipro.ownerapi.entity.Owner;
import com.wipro.ownerapi.services.IOwnerService;

@RestController
@RequestMapping("/api/owners")
public class OwnerRestController {
	
	@Autowired
	private IOwnerService service;
	
	@PostMapping("/add")
	public Owner addEmp(@RequestBody Owner ow) {
		
		return service.addOwner(ow);
	}
	
	@PutMapping(value="/update", consumes = "application/json")
	public Owner updateEmp(@RequestBody Owner ow) {
		
		return service.updateOwner(ow);
	}
	
	@GetMapping("/getbyid/{owner_id}")
	public Owner getById(@PathVariable int owner_id) {
		
		return service.getOwnerById(owner_id);
	}
	
	@DeleteMapping("/deletebyid/{owner_id}")
	public String deleteOwnerById(@PathVariable int owner_id) {
		
		return service.deleteOwnerById(owner_id);
	}
	
	@GetMapping("/getall")
	public List<Owner> getAllOwner(){
		
		return service.getAllOwner();
	}

}
