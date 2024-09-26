package com.example.demo_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	public DemoRestController() {
		System.out.println("Controller");
	}
	
	@GetMapping("/")
	String met() {
		System.out.println("--jjjjjjjj--");
		return "Hello world";
	}
	
	@GetMapping("/person")
	User getUser() {
		return new User (1,"Some user","some addr");
	}

}
