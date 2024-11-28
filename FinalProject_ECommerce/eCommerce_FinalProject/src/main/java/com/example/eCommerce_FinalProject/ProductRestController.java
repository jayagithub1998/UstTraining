package com.example.eCommerce_FinalProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductRestController {
	@Autowired
	ProductService pService;
	
	@GetMapping("/id/{pid}")
	ResponseEntity<Product> getTicketById(@PathVariable("pid") int pid) {
		System.out.println("pid"+pid);
		Product product = pService.getProductServ(pid);
		System.out.println("Product -"+product);
		if (product == null) {
			throw new InvalidProductException("No such Product exists");
		}

		return new ResponseEntity<Product>(product,HttpStatus.OK);

	}

	@GetMapping("{pname}")
	ResponseEntity<Product> getProductByName(@PathVariable("pname") String pname) {
		System.out.println("pname"+pname);
		Product product =pService.getProductByName(pname);
		System.out.println("Product -"+product);
		if (product == null) {
			throw new InvalidProductException("No such Product exists");
		}

		return new ResponseEntity<Product>(product,HttpStatus.OK);

	}
	
	@GetMapping("/buy/{pname}")
	ResponseEntity<String> buyProductByName(@PathVariable("pname") String pname) {
		System.out.println("pname"+pname);
		Product product =pService.buyProduct(pname);
		System.out.println("Product -"+product);
		if (product == null) {
			throw new InvalidProductException("No such Product exists");
		}

		return new ResponseEntity<String>("Thank you for purchasing "+product.getProduct_name() ,HttpStatus.OK);

	}

}
