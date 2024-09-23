package com.wipro.myhybernate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.wipro.pojo.Vehicle;
import com.wipro.services.IVehicleService;
import com.wipro.services.VehicleServiceImpl;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	IVehicleService service = new VehicleServiceImpl();
    	
    	Vehicle ve1 = new Vehicle();
		
		ve1.setVehicleId(152);
		ve1.setVehicleType("car");
		ve1.setModelName("verna");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("dd/MM/yyyy") ;
		LocalDate dob = LocalDate. parse("02/04/2019", formatter);
		ve1. setPurchaseDate(dob);
		ve1.setVehicleNumber("MH09GX0976");
		ve1.setVehicleAge(2);
		ve1.setOwnerName("Sanan");
		ve1.setPurchaseCost(150000.00);
		ve1.setCurrentCost(100000.00);
		ve1.setInUse(true);
		
		service.addVehicle(ve1);
    }
}
