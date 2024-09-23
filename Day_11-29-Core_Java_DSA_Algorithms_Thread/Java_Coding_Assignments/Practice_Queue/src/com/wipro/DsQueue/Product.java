package com.wipro.DsQueue;

public class Product {

	private int prodId;
	private String prodName;
	private double prodPrice;
	
	//Product Constructor
	public Product(int prodId, String prodName, double prodPrice) {
		
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	//Getter Methods 
	public int getProdId() {
		return prodId;
	}

	
	public String getProdName() {
		return prodName;
	}

	
	public double getProdPrice() {
		return prodPrice;
	}

	
	// Overriding toString Method
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + "]";
	}


	
}

