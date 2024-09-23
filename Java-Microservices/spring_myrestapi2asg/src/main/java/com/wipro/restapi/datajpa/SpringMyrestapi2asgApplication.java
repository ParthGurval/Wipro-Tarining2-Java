package com.wipro.restapi.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringMyrestapi2asgApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMyrestapi2asgApplication.class, args);
	}

	@Bean
	public RestTemplate  getRestTemplate() {
			
		return new RestTemplate();	
	}
}
