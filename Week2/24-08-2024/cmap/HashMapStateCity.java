package com.cmap;

import java.util.*;
import java.util.Map.Entry;

class State {
	private String name;
	private long population;
	public State(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + "]";
	}
	

}

class City {
	private String name;
	private double total_area;
	public City(String name, double total_area) {
		super();
		this.name = name;
		this.total_area = total_area;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", total_area=" + total_area + "]";
	}

	
}

public class HashMapStateCity {
	public static void main(String[] args) {
		
		Map<State,City> hmss = new HashMap<>();
		hmss.put(new State("kkkkkkkk",2434),new City("aaaaa",1234));
		hmss.put(new State("llllllllll",2434),new City("bbbbbb",1234));
		hmss.put(new State("mmmmmmmmm",2434),new City("ccccccc",1234));
		
		Set<Entry<State,City>> sess =hmss.entrySet();
		Iterator<Entry<State,City>> iess= sess.iterator();
		while(iess.hasNext()) {
			Entry<State,City> ess = iess.next();
			System.out.println(ess.getKey()+"->"+ess.getValue());
			
	
		}
		
	}
}