package com.wipro.mva.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.mva.pojo.VehicleInfo;
import com.wipro.mva.service.IVehicleInfoService;
import com.wipro.mva.service.VehicleInfoServiceImpl;

class VehicleInfoServiceImplTest {
	
	static  IVehicleInfoService service;
	 
	 @BeforeAll
	 public static void beforeAll() {
		 
		 service = new VehicleInfoServiceImpl();
		 
	 }

	 @Test
	    void testAddVehicle() {
		 // Setup test data
		    VehicleInfo vehicle = new VehicleInfo("111", "Hyundai Creta", LocalDate.of(2023, 7, 10), "Parth", 28, 800000, true);
		    
		    // Check if the vehicle already exists and delete if necessary
		    VehicleInfo existingVehicle = service.selectVehicleById("111");
		    if (existingVehicle != null) {
		        service.deleteVehicleById("111"); // Ensure vehicle is removed before adding a new one
		    }
		    
		    // Add vehicle
		    int addStatus = service.addVehicle(vehicle);
		    assertEquals(1, addStatus, "Vehicle should be added successfully with count 1");
		    
		    // Verify that the vehicle is added
		    VehicleInfo addedVehicle = service.selectVehicleById("111");
		    assertNotNull(addedVehicle, "Added vehicle should not be null");
		    assertEquals("Hyundai Creta", addedVehicle.getVehicleModelName(), "Vehicle model name should match");
	    }

	    @Test
	    void testUpdateVehicle() {
	    	// Setup test data
		    VehicleInfo vehicle = new VehicleInfo("111", "Hyundai Creta", LocalDate.of(2023, 7, 10), "Parth", 28, 800000, true);
		    
		    // Check if vehicle already exists and delete if necessary
		    VehicleInfo existingVehicle = service.selectVehicleById("111");
		    if (existingVehicle != null) {
		        service.deleteVehicleById("111"); // Ensure vehicle is removed before adding
		    }
		    
		    // Add vehicle
		    int addStatus = service.addVehicle(vehicle);
		    assertEquals(1, addStatus, "Vehicle should be added successfully with count 1");
		    
		    // Update vehicle
		    vehicle.setVehicleModelName("Hyundai Tucson");
		    int updateStatus = service.updateVehicle(vehicle);
		    
		    // Print debugging information
		    System.out.println("Update Vehicle status: " + updateStatus);
		    
		    // Assert if the vehicle is updated successfully
		    assertEquals(1, updateStatus, "Vehicle should be updated successfully with count 1");
		    
		    // Verify the update
		    VehicleInfo updatedVehicle = service.selectVehicleById("111");
		    assertNotNull(updatedVehicle, "Updated vehicle should not be null");
		    assertEquals("Hyundai Tucson", updatedVehicle.getVehicleModelName(), "Vehicle model name should be updated");
	    }

	    @Test
	    void testDeleteVehicleById() {
	    	// Setup test data
	        VehicleInfo vehicle = new VehicleInfo("111", "Hyundai Tucson", LocalDate.of(2023, 7, 10), "Parth", 28, 800000, true);
	        
	        // Check if the vehicle already exists and delete if necessary
	        VehicleInfo existingVehicle = service.selectVehicleById("111");
	        if (existingVehicle != null) {
	            service.deleteVehicleById("111"); // Ensure vehicle is removed before adding a new one
	        }

	        // Add vehicle
	        service.addVehicle(vehicle);
	        
	        // Ensure the vehicle is added
	        VehicleInfo addedVehicle = service.selectVehicleById("111");
	        assertNotNull(addedVehicle, "Vehicle should be added successfully");

	        // Delete vehicle
	        int deleteStatus = service.deleteVehicleById("111");
	        assertEquals(1, deleteStatus, "Vehicle should be deleted successfully with count 1");

	        // Verify that the vehicle is deleted
	        VehicleInfo deletedVehicle = service.selectVehicleById("111");
	        assertNull(deletedVehicle, "Deleted vehicle should be null");
	    }

	    @Test
	    void testSelectVehicleById() {
	        VehicleInfo vehicle = new VehicleInfo("113", "Honda Civic", LocalDate.of(2023, 9, 20), "Sam", 25, 1200000, true);
	        service.addVehicle(vehicle);
	        VehicleInfo selectedVehicle = service.selectVehicleById("113");
	        assertNotNull(selectedVehicle, "Selected vehicle should not be null");
	        assertEquals("Honda Civic", selectedVehicle.getVehicleModelName(), "Vehicle model name should match");
	    }

	    @Test
	    void testSelectAll() {
	        VehicleInfo vehicle1 = new VehicleInfo("114", "Nissan Altima", LocalDate.of(2023, 10, 5), "Jordan", 27, 1300000, true);
	        VehicleInfo vehicle2 = new VehicleInfo("115", "Ford Focus", LocalDate.of(2023, 10, 15), "Taylor", 22, 1100000, false);
	        service.addVehicle(vehicle1);
	        service.addVehicle(vehicle2);
	        List<VehicleInfo> allVehicles = service.selectAll();
	        assertNotNull(allVehicles, "All vehicles should not be null");
	        assertTrue(allVehicles.size() >= 2, "There should be at least 2 vehicles");
	    }

}
