package com.example.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.model.Product;
import com.example.Product.service.ProductService;

@RestController
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	private ProductService pService;
	
	/*
	 * @GetMapping("/products") public ResponseEntity<Page<Product>>
	 * getProducts(@RequestParam int page,@RequestParam int size) { Page<Product>
	 * pprod = pService.getProducts(page, size); return new
	 * ResponseEntity<Page<Product>>(pprod,HttpStatus.OK); }
	 */
	
	//sorting
	@GetMapping("/products")
	public ResponseEntity<Page<Product>> getProducts(@RequestParam(defaultValue="0") int page,
			@RequestParam(defaultValue="3") int size,
			@RequestParam(defaultValue="name") String sortby) {
		Page<Product> pprod = pService.getProducts(page, size,sortby);
		return new ResponseEntity<Page<Product>>(pprod,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		Product cproduct = pService.createProduct(product);
		return new ResponseEntity<Product>(cproduct,HttpStatus.OK);
	}
	

}
