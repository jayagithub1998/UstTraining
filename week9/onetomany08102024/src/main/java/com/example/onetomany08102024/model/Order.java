package com.example.onetomany08102024.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name ="abcdd")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String product;
	
	@ManyToOne
	@JoinColumn(name="customer_id",nullable=false)
	//@JsonIgnore
	private Customer customer;

	public Long getId() {
		return id;
	}

	public String getProduct() {
		return product;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	
	
}
