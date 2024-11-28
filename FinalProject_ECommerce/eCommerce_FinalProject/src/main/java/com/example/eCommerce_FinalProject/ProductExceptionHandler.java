package com.example.eCommerce_FinalProject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {
	
	/* whatever returned from this method is given back to client, during exeception scenario */
	@ExceptionHandler(InvalidProductException.class)
	ResponseEntity<String> met(InvalidProductException excep){
		return new ResponseEntity<String>(excep.getMessage(), HttpStatus.NOT_FOUND);
	}

}
