package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class CityA{
	private String name;
	private long pincode;
	private String capital_city;
	//constructor
	//getter,setter,
	//toString
	public CityA(String name, long pincode, String capital_city) {
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
public class ArrayListAdd_Delete {

	public static void main(String[] args) {
		
		//add or delete city objects in between		
		//input from user
		Scanner scnr = new Scanner(System.in);
		
		List<CityA> cities=new ArrayList<>();
		cities.add(new CityA("City1",123,"capital1"));
		cities.add(new CityA("City2",223,"capital2"));
		cities.add(new CityA("City3",323,"capital3"));
		
		System.out.println("List before addition");
		Iterator itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		boolean flag;
			
		do {
		System.err.println("Enter position of element");
		int pos = scnr.nextInt();
		System.out.println("Please enter city name");
		String icity = scnr.next();
		System.out.println("Please enter pincode");
		long ipin = scnr.nextLong();
		System.out.println("Please enter state");
		String istate = scnr.next();
		cities.add(pos, new CityA(icity,ipin,istate));
								
		System.out.println("Enter true for continue and false for Exit?");
			flag=scnr.nextBoolean();
		
		}while(flag == true);
		
		System.out.println("List after addition");
		itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//to delete element
		boolean del_flag;
		do {
			System.out.println("Enter position of element to delete");
			int pos=scnr.nextInt();
			cities.remove(pos);
			System.out.println("Enter true for continue and false for Exit?");
			del_flag=scnr.nextBoolean();
			
		}while(del_flag== true);
		
		System.out.println("List after removal");
		itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}


