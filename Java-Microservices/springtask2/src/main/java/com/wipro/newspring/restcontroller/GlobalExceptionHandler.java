package com.wipro.newspring.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.wipro.newspring.exception.CustomVehicleException;
import com.wipro.newspring.exception.VehicleNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ResponseStatus(reason="Vehicle Not Found Globally...", code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(VehicleNotFoundException.class)
	public void HandleException() {
		
	}
	
	@ExceptionHandler(CustomVehicleException.class)
    public ResponseEntity<String> handleCustomVehicleException(CustomVehicleException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
