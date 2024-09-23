package com.wipro.newspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.newspring.entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
	
	public Vehicle findByModelName(String modelName);
	
	@Modifying
	@Query("delete from Vehicle v where v.ownerName = ?1")
	public void deleteByOwnerName(String ownerName);

}
