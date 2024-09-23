package com.wipro.restapi.datajpa.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.wipro.restapi.datajpa.entity.Vehicle;

class VehicleServiceImplTest {
	
	@Autowired
	IVehicleService service;
	
	@Autowired
	Vehicle ve;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void testAddVehicle() {
		
		ve.setVehicleId(131);
		ve.setVehicleType("car");
		ve.setModelName("Taigun");
		ve.setPurchaseDate(LocalDate.of(2018, 4, 20));
		ve.setVehicleNumber("MH09HL5880");
		ve.setVehicleAge(6);
		ve.setOwnerName("shree");
		ve.setPurchaseCost(1200000);
		ve.setCurrentCost(950000);
		
		Vehicle ve1 = service.addVehicle(ve);
		
		assertEquals(131, ve1.getVehicleId());
		
	}

	@Test
	void testUpdateVehicle() {
		
		ve.setVehicleId(132);
	    ve.setVehicleType("bike");
	    ve.setModelName("Pulsar");
	    ve.setPurchaseDate(LocalDate.of(2020, 6, 15));
	    ve.setVehicleNumber("MH12AB1234");
	    ve.setVehicleAge(4);
	    ve.setOwnerName("Raj");
	    ve.setPurchaseCost(150000);
	    ve.setCurrentCost(100000);
	    
	    Vehicle addedVehicle = service.addVehicle(ve);
		
		 addedVehicle.setOwnerName("Kiran");  
		 addedVehicle.setCurrentCost(95000);
		    
		Vehicle updatedVehicle = service.updateVehicle(addedVehicle);
		
		assertEquals("Kiran", updatedVehicle.getOwnerName());
	    assertEquals(95000, updatedVehicle.getCurrentCost());
	    assertEquals(132, updatedVehicle.getVehicleId());  
		
	}

	@Test
	void testGetVehicleById() {
		
		Vehicle ve = service.getVehicleById(131);
		
		assertEquals("Taigun", ve.getModelName());
		
	}

	@Test
	void testDeleteVehicleById() {

		String result = service.deleteVehicleById(131);
		
		assertEquals("Record deleted for Vehicle ID:131", result);
	}

	@Test
	void testGetAllVehicle() {
		
		List<Vehicle> list = service.getAllVehicle();
		
		assertTrue(list.size() > 0);
	}

}
