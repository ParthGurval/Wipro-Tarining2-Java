package com.wipro.sbmapping.service;

import java.util.List;

import com.wipro.sbmapping.entity.Customer;

public interface ICustomerService {

	Customer saveCustomer(Customer customer);
	
    Customer updateCustomer(Long id, Customer customer);
    
    void deleteCustomer(Long id);
    
    List<Customer> getAllCustomers();
    
    Customer getCustomerById(Long id);
    
}
