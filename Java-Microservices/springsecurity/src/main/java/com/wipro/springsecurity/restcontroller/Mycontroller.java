package com.wipro.springsecurity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Mycontroller {
	
	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello This is Security App";
	}

}
