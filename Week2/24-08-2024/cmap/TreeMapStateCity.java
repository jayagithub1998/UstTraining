package com.cmap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class StateT {
	private String name;
	private long population;
	public StateT(String name, long population) {
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

class CityT {
	private String name;
	private double total_area;
	public CityT(String name, double total_area) {
		super();
		this.name = name;
		this.total_area = total_area;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", total_area=" + total_area + "]";
	}

	
}

public class TreeMapStateCity {
	public static void main(String[] args) {
		Comparator<StateT>cc = new Comparator<StateT>() {
			@Override
			public int compare(StateT o1, StateT o2) {
				return (int) (o2.getPopulation() - o1.getPopulation());
			}
			
		};
		
		Map<StateT,CityT> tmss = new TreeMap<>(cc);
		
		tmss.put(new StateT("kkkkkkkk",1434),new CityT("aaaaa",1234));
		tmss.put(new StateT("llllllllll",2434),new CityT("bbbbbb",2234));
		tmss.put(new StateT("mmmmmmmmm",3434),new CityT("ccccccc",3234));
		
		Set<Entry<StateT,CityT>> sess = tmss.entrySet();
		System.out.println("Using iterator");
		Iterator<Entry<StateT,CityT>> iess = sess.iterator();
		while(iess.hasNext()) {
			Entry<StateT,CityT> ess = iess.next();
			System.out.println(ess.getKey()+"->"+ess.getValue());
		}
		
		
		
	}

}
