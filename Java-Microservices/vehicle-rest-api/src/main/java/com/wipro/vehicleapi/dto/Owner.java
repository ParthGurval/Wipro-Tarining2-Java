package com.wipro.vehicleapi.dto;

public class Owner {
	
	int owner_id;
	
	String owner_name;
	
	int owner_age;
	
	double owner_vehicle_expense;

	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(int owner_id, String owner_name, int owner_age, double owner_vehicle_expense) {
		super();
		this.owner_id = owner_id;
		this.owner_name = owner_name;
		this.owner_age = owner_age;
		this.owner_vehicle_expense = owner_vehicle_expense;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public int getOwner_age() {
		return owner_age;
	}

	public void setOwner_age(int owner_age) {
		this.owner_age = owner_age;
	}

	public double getOwner_vehicle_expense() {
		return owner_vehicle_expense;
	}

	public void setOwner_vehicle_expense(double owner_vehicle_expense) {
		this.owner_vehicle_expense = owner_vehicle_expense;
	}

	@Override
	public String toString() {
		return "Owner [owner_id=" + owner_id + ", owner_name=" + owner_name + ", owner_age=" + owner_age
				+ ", owner_vehicle_expense=" + owner_vehicle_expense + "]";
	}
	
	

}
