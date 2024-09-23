package com.wipro.restapi.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.wipro.restapi.datajpa.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository <Vehicle, Integer> {

	public Vehicle findByModelName(String modelName);
	
}
