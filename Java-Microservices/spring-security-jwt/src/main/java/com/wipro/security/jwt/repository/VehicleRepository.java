package com.wipro.security.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.security.jwt.entity.Vehicle;




@Repository
public interface VehicleRepository extends JpaRepository <Vehicle, Integer> {

	public Vehicle findByModelName(String modelName);
	
}
