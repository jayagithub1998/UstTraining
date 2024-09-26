package com.example.demo_ticket.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;

	@Column
	private String from_place;
	@Column
	private String to_place;
	@Column
	private float price;

	public Ticket() {}
	
	public Ticket(int id, String from_place, String to_place, float price) {
		super();
		this.id = id;
		this.from_place = from_place;
		this.to_place = to_place;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom_place() {
		return from_place;
	}

	
	public void setFrom_place(String from_place) {
		this.from_place = from_place;
	}

	public String getTo_place() {
		return to_place;
	}

	public void setTo_place(String to_place) {
		this.to_place = to_place;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
