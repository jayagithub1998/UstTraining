package com.example.onetomany08102024.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany08102024.model.Order;
import com.example.onetomany08102024.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository oRepo;
	
	//get All orders
	public List<Order> getAllOrders(){
		return oRepo.findAll();
	}
	
	//save order
	public Order saveOrder(Order order) {
		return oRepo.save(order);
	}
	

}
