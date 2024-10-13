package com.example.onetomany08102024.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onetomany08102024.model.Customer;
import com.example.onetomany08102024.repo.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository cRepo;
	
	//get all customers
	public List<Customer> getAllCustomers(){
		return cRepo.findAll();
	}
	
	//save customer
	public Customer saveCustomer(Customer obj) {
		return cRepo.save(obj);
	}
}
