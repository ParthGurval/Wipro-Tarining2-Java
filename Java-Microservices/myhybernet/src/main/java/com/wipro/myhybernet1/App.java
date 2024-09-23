package com.wipro.myhybernet1;

import java.io.Serializable;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.wipro.pojo.Vehicle;
import com.wipro.services.VehicleServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        VehicleServiceImpl service = new VehicleServiceImpl();
        Vehicle ve1 = new Vehicle();
        
        ve1.setVehicleId("110");
        ve1.setVehicleType("car");
        ve1.setModelName("city");
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); // Updated date format
        LocalDate dob = LocalDate.parse("2001-03-28", formatter);
        ve1.setPurchaseDate(dob);
        
        ve1.setVehicleNumber("MH09GX0976");
        ve1.setVehicleAge(2);
        ve1.setOwnerName("Sanan");
        ve1.setPurchaseCost(150000);
        ve1.setCurrentCost(100000);
        ve1.setInUse(true);
        
        service.addVehicle(ve1);
    }
}

