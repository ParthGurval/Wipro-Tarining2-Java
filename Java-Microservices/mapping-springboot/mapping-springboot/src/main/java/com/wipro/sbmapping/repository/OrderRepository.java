package com.wipro.sbmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.sbmapping.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	

}
