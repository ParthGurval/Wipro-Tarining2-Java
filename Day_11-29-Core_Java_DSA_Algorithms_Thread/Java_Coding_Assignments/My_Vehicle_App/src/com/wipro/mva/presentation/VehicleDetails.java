package com.wipro.mva.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;
import com.wipro.mva.pojo.VehicleInfo;
import com.wipro.mva.service.IVehicleInfoService;
import com.wipro.mva.service.VehicleInfoServiceImpl;

public class VehicleDetails {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        IVehicleInfoService mvaservice = new VehicleInfoServiceImpl();

        boolean flag = true;

        System.out.println("******* WELCOME TO VEHICLE INFO PORTAL *******");

        while (flag) {

            System.out.println("\nPlease Select an Option From Below: ");
            System.out.println("\n1. ADD Vehicle Info");
            System.out.println("2. UPDATE Vehicle Info");
            System.out.println("3. DELETE Vehicle Info");
            System.out.println("4. DISPLAY Single Vehicle Info");
            System.out.println("5. DISPLAY ALL Vehicle Info");
            System.out.println("6. EXIT ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	
                    VehicleInfo ve = getVehicleDetails();
                    
                    int addStatus = mvaservice.addVehicle(ve);

                    if (addStatus > 0) {
                    	
                        System.out.println("\nVehicle added successfully!");
                    } 
                    
                    else {
                    	
                        System.out.println("\nFailed to add vehicle.");
                    }
                    break;

                case 2:
                	
                    System.out.println("\nEnter Vehicle ID to update record: ");
                    String vehicleId = sc.next();

                    VehicleInfo updateVehicle = mvaservice.selectVehicleById(vehicleId);
                    
                    if (updateVehicle == null) {
                    	
                        System.out.println("\nUpdate Failed. Vehicle Not Found for ID " + vehicleId);
                    } 
                    else {
                    	
                        System.out.println("\nWhat would you like to update?");
                        System.out.println("\n1. Update Vehicle Model Name");
                        System.out.println("2. Update Purchase Date");
                        System.out.println("3. Update Owner Name");
                        System.out.println("4. Update Mileage");
                        System.out.println("5. Update Purchase Cost");
                        System.out.println("6. Update Usage Status");

                        int subChoice = sc.nextInt();
                        sc.nextLine(); // to consume the leftover newline

                        switch (subChoice) {
                        
                            case 1:
                            	
                                System.out.println("\nEnter new Vehicle Model Name: ");
                                String vehicleModelName = sc.nextLine();
                                
                                updateVehicle.setVehicleModelName(vehicleModelName);
                                
                                break;
                                
                            case 2:
                            	
                                System.out.println("\nEnter new Purchase Date (YYYY-MM-DD): ");
                                
                                try {
                                	
                                    LocalDate purchaseDate = LocalDate.parse(sc.nextLine());
                                    updateVehicle.setPurchaseDate(purchaseDate);
                                } 
                                
                                catch (DateTimeParseException e) {
                                	
                                    System.err.println("\nInvalid date format. Please enter the date in YYYY-MM-DD format.");
                                }
                                break;
                                
                            case 3:
                            	
                                System.out.println("\nEnter new Owner Name: ");
                                String ownerName = sc.nextLine();
                                
                                updateVehicle.setOwnerName(ownerName);
                                
                                break;
                                
                            case 4:
                            	
                                System.out.println("\nEnter new Mileage: ");
                                int mileage = sc.nextInt();
                                
                                updateVehicle.setMileage(mileage);
                                
                                break;
                                
                            case 5:
                            	
                                System.out.println("\nEnter new Purchase Cost: ");
                                double purchaseCost = sc.nextDouble();
                                
                                updateVehicle.setPurchaseCost(purchaseCost);
                                
                                break;
                                
                            case 6:
                            	
                                System.out.println("\nIs Vehicle in Use? (true/false): ");
                                boolean isInUse = sc.nextBoolean();
                                
                                updateVehicle.setInUse(isInUse);
                                
                                break;
                                
                            default:
                            	
                                System.err.println("\nInvalid Option");
                                
                                break;
                        }

                        int updateStatus = mvaservice.updateVehicle(updateVehicle);
                        
                        if (updateStatus > 0) {
                        	
                            System.out.println("\nVehicle updated successfully!");
                        } 
                        
                        else {
                            
                        	System.out.println("\nUpdate Failed.");
                        }
                    }
                    
                    break;

                case 3:
                	
                    System.out.println("\nEnter Vehicle ID to delete record");
                    String delVehicleId = sc.next();
                    
                    int delStatus = mvaservice.deleteVehicleById(delVehicleId);

                    if (delStatus > 0) {
                    	
                        System.out.println("\nVehicle deleted successfully!");
                    } 
                    
                    else {
                    	
                        System.out.println("\nDelete Failed. Vehicle Not Found for ID " + delVehicleId);
                    }
                    
                    break;

                case 4:
                	
                    System.out.println("\nEnter Vehicle ID to search record");
                    String searchVehicleId = sc.next();
                    
                    VehicleInfo searchedVehicle = mvaservice.selectVehicleById(searchVehicleId);

                    if (searchedVehicle != null) {
                    	
                        System.out.println(searchedVehicle);
                    } 
                    
                    else {
                    	
                        System.out.println("\nVehicle Not Found for ID " + searchVehicleId);
                    }
                    
                    break;

                case 5:
                	
                    List<VehicleInfo> vehicles = mvaservice.selectAll();
                    
                    if (vehicles.isEmpty()) {
                    	
                        System.out.println("\nNo vehicles found.");
                    } 
                    
                    else {
                    	
                        for (VehicleInfo vehicle : vehicles) {
                        	
                            System.out.println(vehicle);
                        }
                    }
                    
                    break;

                case 6:
                	
                    flag = false;
                    
                    System.out.println("\nThank you for using the Vehicle Info Portal!");
                    
                    break;

                default:
                	
                    System.err.println("\nInvalid Option. Please select a valid option.");
                    
                    break;
            }
        }

        sc.close();
    }

    private static VehicleInfo getVehicleDetails() {
    	
        System.out.println("\nEnter Vehicle ID: ");
        String vehicleId = sc.next();

        System.out.println("\nEnter Vehicle Model Name: ");
        sc.nextLine(); // consume newline
        String vehicleModelName = sc.nextLine();

        System.out.println("\nEnter Purchase Date (YYYY-MM-DD): ");
        LocalDate purchaseDate = null;
        try {
        	
            purchaseDate = LocalDate.parse(sc.nextLine());
        } 
        
        catch (DateTimeParseException e) {
        	
            System.err.println("\nInvalid date format. Defaulting to null.");
        }

        
        System.out.println("\nEnter Owner Name: ");
        String ownerName = sc.nextLine();

        System.out.println("\nEnter Mileage: ");
        int mileage = sc.nextInt();

        System.out.println("\nEnter Purchase Cost: ");
        double purchaseCost = sc.nextDouble();

        System.out.println("\nIs Vehicle in Use? (true/false): ");
        boolean isInUse = sc.nextBoolean();

        return new VehicleInfo(vehicleId, vehicleModelName, purchaseDate, ownerName, mileage, purchaseCost, isInUse);
    }
}
