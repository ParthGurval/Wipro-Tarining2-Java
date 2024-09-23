package com.wipro.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.restapi.entities.Vehicle;



@Repository
public interface VehicleRepository extends JpaRepository <Vehicle, Integer> {

	public Vehicle findByModelName(String modelName);
	
}
