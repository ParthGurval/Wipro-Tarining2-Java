package com.wipro.newspring.exception;

public class CustomVehicleException extends RuntimeException {

	 public CustomVehicleException() {
	        super("Custom Vehicle exception occurred.");
	    }

	    public CustomVehicleException(String message) {
	        super(message);
	    }
	
}
