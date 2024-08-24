package com.day7;

public class Vehicle {
	String name;

	public Vehicle(String name) {
		this.name = name;
		System.out.println("name : "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
class Car extends Vehicle{

	public Car(String name) {
		super(name);
	}	
}
class Bus extends Vehicle{

	public Bus(String name) {
		super(name);
	}
	
}
