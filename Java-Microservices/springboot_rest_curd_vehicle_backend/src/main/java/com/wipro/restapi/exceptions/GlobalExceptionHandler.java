package com.wipro.restapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(VehicleNotFoundException.class)
	public  ResponseEntity<String>  handleGlobalExp(){
		
		
		return new ResponseEntity<String>("Some Exp Occur in Application",HttpStatus.BAD_REQUEST);
		
		
	}

}
