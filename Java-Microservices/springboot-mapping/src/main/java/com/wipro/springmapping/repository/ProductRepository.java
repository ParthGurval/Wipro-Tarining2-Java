package com.wipro.springmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.springmapping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
