package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class City{
	private String name;
	private long pincode;
	private String state;
	
	//Constructor
	public City(String name, long pincode, String capital_city) {
		this.name = name;
		this.pincode = pincode;
		this.state = capital_city;
	}

	//getter setter - TBD
	
	//toString
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", capital_city=" + state + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pincode, state);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(name, other.name) && pincode == other.pincode && Objects.equals(state, other.state);
	}
	
	
}

public class LinkedEg_Arraylist {
	public static void main(String[] args) {
	/*	List cities=new ArrayList();
		
		cities.add(new City("City1",123,"capital1"));
		cities.add(new City("City2",223,"capital2"));
		cities.add(new City("City3",323,"capital3"));
		
		Iterator itr =cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		//Using generics
/*		List<City> cities=new ArrayList<City>();
		
		cities.add(new City("City1",123,"capital1"));
		cities.add(new City("City2",223,"capital2"));
		cities.add(new City("City3",323,"capital3"));
		
		Iterator<City> itr =cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	*/	
		List<City> cities=new ArrayList<City>();
		boolean flag;
		Scanner scnr=new Scanner(System.in);
		
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
