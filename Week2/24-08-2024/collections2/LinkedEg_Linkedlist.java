package com.collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.*;

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

	
	
}

public class LinkedEg_Linkedlist {
	public static void main(String[] args) {
		/*List cities=new ArrayList();
		
		cities.add(new City("City1",123,"capital1"));
		cities.add(new City("City2",223,"capital2"));
		cities.add(new City("City3",323,"capital3"));
		
		Iterator itr =cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		//Using generics
		List<City> cities=new LinkedList<City>();
		
		cities.add(new City("City1",123,"capital1"));
		cities.add(new City("City2",223,"capital2"));
		cities.add(new City("City3",323,"capital3"));
		
/*		Iterator<City> itr =cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	*/	
		Scanner scnr=new Scanner(System.in);
		System.out.println("Please enter city name");
		String icity = scnr.next();
		
		System.out.println("Please enter pincode");
		out.println("Please enter pincode");
		long ipin = scnr.nextLong();
		
		System.out.println("Please enter state");
		String istate = scnr.next();
		cities.add(new City(icity,ipin,istate));
		
		//to add objcects in between
		cities.add(1,new City("city21",3456,"capital21"));
		
		Iterator<City> itr =cities.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

