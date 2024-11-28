package com.example.eCommerce_FinalProject;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
	@Autowired
	private ProductRepository pRepo;
	
		
	public Product getProductServ(int productid) {
		Optional<Product> oproduct=pRepo.findById(productid);
		return oproduct.get();
	}
	
	public Product getProductByName(String pname) {
		Product product=pRepo.getProduct(pname);
		return product;
	}
	
	public Product buyProduct(String pname) {
		Product product=pRepo.getProduct(pname);
		return product;
	}
	



}
