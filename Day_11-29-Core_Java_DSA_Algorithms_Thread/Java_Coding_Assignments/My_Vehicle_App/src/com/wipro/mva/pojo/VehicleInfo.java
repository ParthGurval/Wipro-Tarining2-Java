package com.wipro.mva.pojo;

import java.time.LocalDate;

public class VehicleInfo {
	
	private String vehicleId;
    private String vehicleModelName;
    private LocalDate purchaseDate;
    private String ownerName;
    private int mileage;
    private double purchaseCost;
    private boolean isInUse;
    
    // Constructor 
	public VehicleInfo(String vehicleId, String vehicleModelName, LocalDate purchaseDate, String ownerName, int mileage,
			double purchaseCost, boolean isInUse) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleModelName = vehicleModelName;
		this.purchaseDate = purchaseDate;
		this.ownerName = ownerName;
		this.mileage = mileage;
		this.purchaseCost = purchaseCost;
		this.isInUse = isInUse;
	}

	// Setters and Getters 
	public String getVehicleId() {
		return vehicleId;
	}


	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}


	public String getVehicleModelName() {
		return vehicleModelName;
	}


	public void setVehicleModelName(String vehicleModelName) {
		this.vehicleModelName = vehicleModelName;
	}


	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getMileage() {
		return mileage;
	}


	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	public double getPurchaseCost() {
		return purchaseCost;
	}


	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}


	public boolean isInUse() {
		return isInUse;
	}


	public void setInUse(boolean isInUse) {
		this.isInUse = isInUse;
	}

	//ToString Method
	@Override
	public String toString() {
		return "VehicleInfo [vehicleId=" + vehicleId + ", vehicleModelName=" + vehicleModelName + ", purchaseDate="
				+ purchaseDate + ", ownerName=" + ownerName + ", mileage=" + mileage + ", purchaseCost=" + purchaseCost
				+ ", isInUse=" + isInUse + "]";
	}
    

}
