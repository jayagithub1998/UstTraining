package com.example.Product.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//Page <Product> findByNameContaining(String name_pattern,Pageable pageable);
	Page <Product> findByNameStartingWith(String name_pattern,Pageable pageable);

}
