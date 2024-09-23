package com.wipro.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.wipro.vs.pojo.Vehicle;
import com.wipro.vs.service.IVehicleService;
import com.wipro.vs.service.VehicleServiceImpl;

class VehicleServiceImplTest {
    
    static IVehicleService service;
     
    @BeforeAll
    public static void beforeAll() {
        service = new VehicleServiceImpl();
    }
    
    @Test
    void testAddVehicle() {
        Vehicle vehicle = new Vehicle("111", "Car", "MArutis", LocalDate.of(2023, 1, 15), "AB1234", 2, "Owner", 20000, 15000, true);
        int result = service.addVehicle(vehicle);
       
        assertEquals(1, result);
    }

//    @Test
//    void testUpdateVehicle() {
//        // First, add a vehicle to update
//        Vehicle vehicle = new Vehicle("V001", "Car", "ModelX", LocalDate.of(2023, 1, 15), "AB1234", 2, "Owner", 20000, 15000, true);
//        service.addVehicle(vehicle);
//
//        // Update the vehicle (simulate an update without changing specific fields)
//        int result = service.updateVehicle(vehicle);
//        assertEquals(1, result);
//
//        // Fetch the vehicle to verify update (no specific field change, just ensure it's updated)
//        Vehicle updatedVehicle = service.selectVehicleById("V001");
//        assertNotNull(updatedVehicle);
//    }
//    
//    @Test
//    void testDeleteVehicleById() {
//        // First, add a vehicle to delete
//        Vehicle vehicle = new Vehicle("V002", "Bike", "ModelY", LocalDate.of(2022, 6, 10), "CD5678", 1, "Owner2", 15000, 12000, false);
//        service.addVehicle(vehicle);
//
//        // Delete the vehicle
//        int result = service.deleteVehicleById("V002");
//        assertEquals(1, result);
//
//        // Try fetching the vehicle to ensure it's deleted
//        Vehicle deletedVehicle = service.selectVehicleById("V002");
//        assertNull(deletedVehicle);
//    }
//
//    @Test
//    void testSelectVehicleById() {
//        // First, add a vehicle to select
//        Vehicle vehicle = new Vehicle("V003", "Truck", "ModelZ", LocalDate.of(2024, 5, 20), "EF3456", 3, "Owner3", 30000, 25000, true);
//        service.addVehicle(vehicle);
//
//        // Select the vehicle
//        Vehicle selectedVehicle = service.selectVehicleById("V003");
//        assertNotNull(selectedVehicle);
//
//        // Use the appropriate getter method based on your Vehicle class
//        assertEquals("ModelZ", selectedVehicle.getModelName());  // Correct method based on the provided Vehicle class
//    }
//
//    @Test
//    void testSelectAll() {
//        // Add vehicles to select
//        Vehicle vehicle1 = new Vehicle("V004", "SUV", "ModelA", LocalDate.of(2023, 8, 30), "GH7890", 4, "Owner4", 40000, 35000, true);
//        Vehicle vehicle2 = new Vehicle("V005", "Sedan", "ModelB", LocalDate.of(2022, 12, 1), "IJ0123", 5, "Owner5", 25000, 20000, false);
//        service.addVehicle(vehicle1);
//        service.addVehicle(vehicle2);
//
//        // Select all vehicles
//        List<Vehicle> vehicles = service.selectAll();
//        assertNotNull(vehicles);
//        assertTrue(vehicles.size() >= 2);
//    }
}
