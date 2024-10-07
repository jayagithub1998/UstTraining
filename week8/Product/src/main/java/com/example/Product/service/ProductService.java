package com.example.Product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.Product.model.Product;
import com.example.Product.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
	/*
	 * public Page<Product> getProducts(int page,int size){ Pageable pageable =
	 * PageRequest.of(page, size); return pRepo.findAll(pageable); }
	 */
	
	//sorting
	public Page<Product> getProducts(int page,int size,String sortBy){
		Pageable pageable = PageRequest.of(page, size,Sort.by(sortBy).descending());
		return pRepo.findAll(pageable);
	}
	
	
	public Product createProduct(Product prod) {
		return pRepo.save(prod);
	}
	
	@PostConstruct
	void met() {
		Pageable pageable = PageRequest.of(1, 2,Sort.by("price").descending());
		Page<Product> pproduct=pRepo.findByName("Mobile", pageable);
	}
}
