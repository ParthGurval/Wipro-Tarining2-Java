package com.wipro.springmapping.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wipro.springmapping.entity.Product;
import com.wipro.springmapping.service.ProductService;

public class ProductController {
	
	 private final ProductService productService;

	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    }

	    @GetMapping
	    public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }

	    @PostMapping
	    public Product createProduct(@RequestBody Product product) {
	        return productService.saveProduct(product);
	    }

	    @GetMapping("/{id}")
	    public Product getProductById(@PathVariable Long id) {
	        return productService.getProductById(id);
	    }

}
