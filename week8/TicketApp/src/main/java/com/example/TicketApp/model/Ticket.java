package com.example.TicketApp.model;

import org.springframework.stereotype.Component;

@Component
public class Ticket {
	private int id;
	private String from_place;
	private String to_place;
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
