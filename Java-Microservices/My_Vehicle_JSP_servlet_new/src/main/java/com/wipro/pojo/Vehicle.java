package com.wipro.pojo;

import java.time.LocalDate;

public class Vehicle {
		
		private String vehicleId;
		private String vehicleType;
	    private String modelName;
	    private LocalDate purchaseDate;
	    private String vehicleNumber;
	    private int vehicleAge;
	    private String ownerName;
	    private double purchaseCost;
	    private double currentCost;
	    private boolean isInUse;
	    
	    // This is Constructor 
		public Vehicle(String vehicleId, String vehicleType, String modelName, LocalDate purchaseDate,
				String vehicleNumber, int vehicleAge, String ownerName, double purchaseCost, double currentCost,
				boolean isInUse) {
			super();
			this.vehicleId = vehicleId;
			this.vehicleType = vehicleType;
			this.modelName = modelName;
			this.purchaseDate = purchaseDate;
			this.vehicleNumber = vehicleNumber;
			this.vehicleAge = vehicleAge;
			this.ownerName = ownerName;
			this.purchaseCost = purchaseCost;
			this.currentCost = currentCost;
			this.isInUse = isInUse;
		}
	    


		public String getVehicleId() {
			return vehicleId;
		}

		public void setVehicleId(String vehicleId) {
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

		public boolean isInUse() {
			return isInUse;
		}

		public void setInUse(boolean isInUse) {
			this.isInUse = isInUse;
		}



		@Override
		public String toString() {
			return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", modelName=" + modelName
					+ ", purchaseDate=" + purchaseDate + ", vehicleNumber=" + vehicleNumber + ", vehicleAge="
					+ vehicleAge + ", ownerName=" + ownerName + ", purchaseCost=" + purchaseCost + ", currentCost="
					+ currentCost + ", isInUse=" + isInUse + "]";
		}
	    
	    
	    
}
