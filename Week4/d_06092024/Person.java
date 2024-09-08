package com.egjson;

import java.util.Arrays;

public class Person {
	private String name;
	private int agee;
	private Address address;
	private Address[] addresses;
	
	public Person() {}
		
	
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.agee = age;
		this.address = address;
	}
	
	public Person(String name, int age, Address address, Address[] addresses) {
		super();
		this.name = name;
		this.agee = age;
		this.address = address;
		this.addresses = addresses;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address[] getAddresses() {
		return addresses;
	}

	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}

	public int getAgee() {
		return agee;
	}
	public void setAgee(int age) {
		this.agee = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + agee + ", address=" + address + ", addresses="
				+ Arrays.toString(addresses) + "]";
	}
	
}
