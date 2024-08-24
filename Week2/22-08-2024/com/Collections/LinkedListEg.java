package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CityLinked{
	private String name;
	private long pincode;
	private String capital_city;
	//constructor
	//getter,setter,
	//toString
	public CityLinked(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.capital_city = capital_city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCapital_city() {
		return capital_city;
	}
	public void setCapital_city(String capital_city) {
		this.capital_city = capital_city;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", capital_city=" + capital_city + "]";
	}
	
	
	
}
public class LinkedListEg {

	//create list
	//add city objects to list
	//iterate and display
	public static void main(String[] args) {
	
		//input from user
		Scanner scnr = new Scanner(System.in);
		
		List<CityLinked> cities=new ArrayList<CityLinked>();
		boolean flag;
			
		do {
		System.out.println("Please enter city name");
		String icity = scnr.next();
		
		System.out.println("Please enter pincode");
		long ipin = scnr.nextLong();
		
		System.out.println("Please enter state");
		String istate = scnr.next();
		cities.add(new CityLinked(icity,ipin,istate));
				
		System.out.println("Enter true for continue and false for Exit?");
			flag=scnr.nextBoolean();
		
		}while(flag == true);
		
		Iterator itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
