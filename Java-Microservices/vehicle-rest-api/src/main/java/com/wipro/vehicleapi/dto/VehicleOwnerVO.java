package com.wipro.vehicleapi.dto;

public class VehicleOwnerVO {
	
	private VehicleDTO vehicle;
	
	private Owner owner;

	public VehicleOwnerVO() {
//		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleOwnerVO(VehicleDTO vehicle, Owner owner) {
		super();
		this.vehicle = vehicle;
		this.owner = owner;
	}

	public VehicleDTO getVehicle() {
		return vehicle;
	}

	public void setVehicle(VehicleDTO vehicle) {
		this.vehicle = vehicle;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "VehicleOwnerVO [vehicle=" + vehicle + ", owner=" + owner + "]";
	}
	
	

}
