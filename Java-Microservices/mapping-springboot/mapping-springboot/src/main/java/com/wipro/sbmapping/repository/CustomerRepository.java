package com.wipro.sbmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sbmapping.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
