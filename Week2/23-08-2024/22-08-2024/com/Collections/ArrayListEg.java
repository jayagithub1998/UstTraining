package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


class City{
	private String name;
	private long pincode;
	private String capital_city;
	//constructor
	//getter,setter,
	//toString
	public City(String name, long pincode, String capital_city) {
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
public class ArrayListEg {

	//create list
	//add city objects to list
	//iterate and display
	public static void main(String[] args) {
		
		/*non generic type
		List cities = new ArrayList();
		cities.add(new City("aaaa",123,"bbbbb"));
		cities.add(new City("ccccc",123,"ddddd"));
		cities.add(new City("eeee",123,"fffff"));
		
		Iterator itr=cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		/*generic type
		List<City> cities = new ArrayList<City>();
		cities.add(new City("aaaa",123,"bbbbb"));
		cities.add(new City("ccccc",123,"ddddd"));
		cities.add(new City("eeee",123,"fffff"));
		
		Iterator<City> itr=cities.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		//input from user
		Scanner scnr = new Scanner(System.in);
		
		List<City> cities=new ArrayList<City>();
		boolean flag;
			
		do {
		System.out.println("Please enter city name");
		String icity = scnr.next();
		
		System.out.println("Please enter pincode");
		long ipin = scnr.nextLong();
		
		System.out.println("Please enter state");
		String istate = scnr.next();
		cities.add(new City(icity,ipin,istate));
				
		System.out.println("Enter true for continue and false for Exit?");
			flag=scnr.nextBoolean();
		
		}while(flag == true);
		
		System.out.println("-------Using iterator---------");
		Iterator<City> itr =cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------Using Enhanced for loop--------------");
		for(City e : cities) {
			System.out.println(e);
		}
		
		System.out.println("--------------Normal For loop------------");
		for(int i=0;i<cities.size();i++) {
			System.out.println(cities.get(i));
		}
		
	}
}
