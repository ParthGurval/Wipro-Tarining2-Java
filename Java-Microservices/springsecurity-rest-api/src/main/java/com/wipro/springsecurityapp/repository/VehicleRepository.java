package com.wipro.springsecurityapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.springsecurityapp.entity.Vehicle;



@Repository
public interface VehicleRepository extends JpaRepository <Vehicle, Integer> {

}
