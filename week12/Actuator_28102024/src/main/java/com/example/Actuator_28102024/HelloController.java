package com.example.Actuator_28102024;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${customm.property}")
	String test;
	
	@GetMapping
	String met() {
		return "Hello world!!! "+test;
	}

}
