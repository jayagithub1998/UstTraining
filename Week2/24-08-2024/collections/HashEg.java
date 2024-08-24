package com.collections;

import java.util.HashSet;

public class HashEg {
	public static void main(String[] args) {
	/*	HashSet<String> hss = new HashSet<>();
		
		hss.add("cccccc");
		hss.add("aaaaaa");
		hss.add("wertyuio");
		hss.add("bbbbbbbb");
		hss.add("aaaaaa");
		
		for(String element : hss) {
			System.out.print(element+"\t");
		}
		*/
		
		/*to check user defined class objects are equals ->add hashCode() and 
		equals() methods in the class. Otherwise it will display duplicate elements 
		*/
		HashSet<City> hss = new HashSet<>();
		hss.add(new City("City1",123,"capital1"));
		hss.add(new City("City2",223,"capital2"));
		hss.add(new City("City3",323,"capital3"));
		hss.add(new City("City2",223,"capital2"));
		for(City element : hss) {
			System.out.print(element+"\n");
		}
	}
}
