package com.wipro.newspring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	private int vehicleId;
	
	@NotEmpty
	@NotNull
	private String vehicleType;
	
    private String modelName;
    
    private String vehicleNumber;
    
    private int vehicleAge;
    
    private String ownerName;
    
    @Min(100000)
    @Max(30000000)
    private double purchaseCost;
    
    private double currentCost;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vehicleId, String vehicleType, String modelName, String vehicleNumber, int vehicleAge,
			String ownerName, double purchaseCost, double currentCost) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.modelName = modelName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleAge = vehicleAge;
		this.ownerName = ownerName;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", modelName=" + modelName
				+ ", vehicleNumber=" + vehicleNumber + ", vehicleAge=" + vehicleAge + ", ownerName=" + ownerName
				+ ", purchaseCost=" + purchaseCost + ", currentCost=" + currentCost + "]";
	}
    
    

}
