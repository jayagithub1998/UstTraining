package com.example.onetomany08102024.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onetomany08102024.model.Order;
import com.example.onetomany08102024.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	private OrderService oService;
	
	@GetMapping
	public List<Order> getAllOrders(){
		return oService.getAllOrders();
	}

	@PostMapping
	public Order createOrder(@RequestBody Order order) {
		return oService.saveOrder(order);
	}
}
