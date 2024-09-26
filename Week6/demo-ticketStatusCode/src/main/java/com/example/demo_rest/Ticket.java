package com.example.demo_rest;

public class Ticket {
	private int id;
	private String name;
	private String addr;
	private int no_of_seats;
	
	public Ticket() {
	}

	public Ticket(int id, String name, String addr, int no_of_seats) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.no_of_seats = no_of_seats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}


	
}
