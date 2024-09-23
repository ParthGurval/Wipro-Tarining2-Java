package com.wipro.vehicleapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.vehicleapi.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository <Vehicle, Integer> {

}
