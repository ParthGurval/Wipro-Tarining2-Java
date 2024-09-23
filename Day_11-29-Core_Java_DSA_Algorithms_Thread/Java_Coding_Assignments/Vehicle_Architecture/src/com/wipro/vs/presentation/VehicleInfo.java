package com.wipro.vs.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
//import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

import com.wipro.vs.pojo.Vehicle;
import com.wipro.vs.service.IVehicleService;
import com.wipro.vs.service.VehicleServiceImpl;

public class VehicleInfo {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IVehicleService veservice = new VehicleServiceImpl();
		
		boolean flag = true;

		System.out.println("******* WELCOME TO VEHICLE INFO PORTAL *******");
		
		System.out.println();

		while (flag) {

			System.out.println("\nPlease Select an Option From Below: ");
			
			System.out.println("\n1. ADD Vehicle Info");
			
			System.out.println("2. UPDATE Vehicle Info");

			System.out.println("3. DELETE  Vehicle Info");
			
			System.out.println("4. DISPLAY  Single Vehicle Info");

			System.out.println("5. DISPLAY ALL Vehiclle Info");

			System.out.println("6. EXIT ");

			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				
				Vehicle ve = getVehicleDetails();
                int addStatus = veservice.addVehicle(ve);

                if (addStatus > 0) {
                    System.out.println("\nVehicle added successfully!");
                } else {
                    System.out.println("\nFailed to add vehicle.");
                }
				
				break;
				
			case 2:
				
				System.out.println("\nEnter Vehicle ID to update record: ");
                String vehicleId = sc.next();
                
                System.out.println("\nWhat would you like to update?");
                System.out.println("\n1. Update Vehicle Type");
                System.out.println("2. Update Model Name");
                System.out.println("3. Update Purchase Date");
                // Add more update options as needed
                
                int subChoice = sc.nextInt();
                sc.nextLine(); // to consume the leftover newline

                Vehicle updateVehicle = veservice.selectVehicleById(vehicleId);
                
                if (updateVehicle == null) {
                    System.out.println("\nUpdate Failed. Vehicle Not Found for ID " + vehicleId);
                } else {
                    switch (subChoice) {
                        case 1:
                            System.out.println("\nEnter new Vehicle Type: ");
                            String vehicleType = sc.nextLine();
                            updateVehicle.setVehicleType(vehicleType);
                            break;
                        case 2:
                            System.out.println("\nEnter new Model Name: ");
                            String modelName = sc.nextLine();
                            updateVehicle.setModelName(modelName);
                            break;
                        case 3:
                            System.out.println("\nEnter new Purchase Date (YYYY-MM-DD): ");
                            LocalDate purchaseDate = LocalDate.parse(sc.nextLine());
                            updateVehicle.setPurchaseDate(purchaseDate);
                            break;
                        
                        default:
                            System.err.println("\nInvalid Option");
                            break;
                    }

                    int updateStatus = veservice.updateVehicle(updateVehicle);
                    if (updateStatus > 0) {
                        System.out.println("\nVehicle updated successfully!");
                    } else {
                        System.out.println("\nUpdate Failed.");
                    }
                }
				
				break;
				
			case 3:
				
				 System.out.println("\nEnter Vehicle ID to delete record");
                 String delVehicleId = sc.next();
                 int delStatus = veservice.deleteVehicleById(delVehicleId);

                 if (delStatus > 0) {
                     System.out.println("\nVehicle deleted successfully!");
                 } else {
                     System.out.println("\nDelete Failed. Vehicle Not Found for ID " + delVehicleId);
                 }
				
				break;
				
			case 4:
				
				System.out.println("\nEnter Vehicle ID to search record");
                String searchVehicleId = sc.next();
                Vehicle searchedVehicle = veservice.selectVehicleById(searchVehicleId);

                if (searchedVehicle != null) {
                    System.out.println(searchedVehicle);
                } else {
                    System.out.println("\nVehicle Not Found for ID " + searchVehicleId);
                }
				
				break;
				
			case 5:
				
				// Here we retrieve all vehicle records
			    List<Vehicle> vehicles = veservice.selectAll();

			    // here we check if the list is empty
			    if (vehicles.isEmpty()) {
			        System.out.println("\nNo vehicles found.");
			    } else {
			        // Iterate through each vehicle in the list
			        for (Vehicle vehicle : vehicles) {
			            
			            System.out.println(vehicle);
			        }
			    }
				
				break;
				
			case 6:
				
				flag = false;
                System.out.println("\nThank you! Visit again.");
				
				break;
				

			default:
				
				System.err.println("\nInvalid Option");
				break;
			}

		}
			
	}
	
	
    public static Vehicle getVehicleDetails() { // reading data from KeyBoard
        System.out.print("Enter Vehicle ID: ");
        String vehicleId = sc.next();

        System.out.print("Enter Vehicle Type: ");
        String vehicleType = sc.next();

        System.out.print("Enter Model Name: ");
        String modelName = sc.next();

        LocalDate purchaseDate = null;
        while (purchaseDate == null) {
        	
            System.out.print("Enter Purchase Date (YYYY-MM-DD): ");
            String dateInput = sc.next();
            
            try {
            	
                purchaseDate = LocalDate.parse(dateInput);
            } 
            
            catch (DateTimeParseException e) {
            	
                System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
            }
        }

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.next();

        System.out.print("Enter Vehicle Age: ");
        int vehicleAge = sc.nextInt();

        System.out.print("Enter Owner Name: ");
        String ownerName = sc.next();

        System.out.print("Enter Purchase Cost: ");
        double purchaseCost = sc.nextDouble();

        System.out.print("Enter Current Cost: ");
        double currentCost = sc.nextDouble();

        boolean isInUse = false;
        boolean validInput = false;
        while (!validInput) {
        	
            System.out.print("Is Vehicle in Use? (true/false): ");
            String input = sc.next();
            
            if (input.equalsIgnoreCase("true")) {
            	
                isInUse = true;
                validInput = true;
            } 
            else if (input.equalsIgnoreCase("false")) {
            	
                isInUse = false;
                validInput = true;
            } 
            
            else {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
            }
        }

        return new Vehicle(vehicleId, vehicleType, modelName, purchaseDate, vehicleNumber, vehicleAge, ownerName, purchaseCost, currentCost, isInUse);
    }
	
}
