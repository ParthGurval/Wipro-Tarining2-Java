package com.wipro.springmapping.service;

import java.util.List;

import com.wipro.springmapping.entity.Product;
import com.wipro.springmapping.repository.ProductRepository;

public class ProductService {
	
	 private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

}
