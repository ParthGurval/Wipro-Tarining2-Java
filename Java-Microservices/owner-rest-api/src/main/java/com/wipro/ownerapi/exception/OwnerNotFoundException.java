package com.wipro.ownerapi.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class OwnerNotFoundException extends ResponseStatusException {

	public OwnerNotFoundException(HttpStatusCode status,String msg) {
		super(status,msg);
		
	}
}
