package com.wipro.vehicleapi.dto;

import java.time.LocalDate;

public class VehicleDTO {
	
	private int vehicleId;
	
	private String vehicleType;
	
    private String modelName;
    
    private LocalDate purchaseDate;
    
    private String vehicleNumber;
    
    private int vehicleAge;
    
    private int owner_id;
    
    private double purchaseCost;
    
    private double currentCost;

	public VehicleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleDTO(int vehicleId, String vehicleType, String modelName, LocalDate purchaseDate, String vehicleNumber,
			int vehicleAge, int owner_id, double purchaseCost, double currentCost) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.modelName = modelName;
		this.purchaseDate = purchaseDate;
		this.vehicleNumber = vehicleNumber;
		this.vehicleAge = vehicleAge;
		this.owner_id = owner_id;
		this.purchaseCost = purchaseCost;
		this.currentCost = currentCost;
	}

	

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getVehicleAge() {
		return vehicleAge;
	}

	public void setVehicleAge(int vehicleAge) {
		this.vehicleAge = vehicleAge;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public double getPurchaseCost() {
		return purchaseCost;
	}

	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public double getCurrentCost() {
		return currentCost;
	}

	public void setCurrentCost(double currentCost) {
		this.currentCost = currentCost;
	}

	@Override
	public String toString() {
		return "VehicleDTO [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", modelName=" + modelName
				+ ", purchaseDate=" + purchaseDate + ", vehicleNumber=" + vehicleNumber + ", vehicleAge=" + vehicleAge
				+ ", owner_id=" + owner_id + ", purchaseCost=" + purchaseCost + ", currentCost=" + currentCost + "]";
	}


    
    

}
