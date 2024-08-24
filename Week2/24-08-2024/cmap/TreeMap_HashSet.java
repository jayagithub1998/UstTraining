package com.cmap;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

class StateH {
	private String name;
	private long population;
	public StateH(String name, long population) {
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

class CityH {
	private String name;
	private double total_area;
	public CityH(String name, double total_area) {
		super();
		this.name = name;
		this.total_area = total_area;
	}
	@Override
	public String toString() {
		return "City [name=" + name + ", total_area=" + total_area + "]";
	}

	
}

public class TreeMap_HashSet {
	public static void main(String[] args) {
		Comparator<StateH>cc = new Comparator<StateH>() {
			@Override
			public int compare(StateH o1, StateH o2) {
				return (int) (o2.getPopulation() - o1.getPopulation());
			}
			
		};
		
		Map<StateH,HashSet<CityH>> tmss = new TreeMap<>(cc);
		HashSet<CityH> hss = new HashSet<>();
		hss.add(new CityH("aaaaa",1234));
		hss.add(new CityH("aaaaa",1234));
		
		HashSet<CityH> hss1 = new HashSet<>();
		hss1.add(new CityH("aaaaa",1234));
		hss1.add(new CityH("aaaaa",1234));
		
		HashSet<CityH> hss3 = new HashSet<>();
		hss3.add(new CityH("aaaaa",1234));
		hss3.add(new CityH("aaaaa",1234));
		
		tmss.put(new StateH("kkkkkkkk",1434),hss);
		tmss.put(new StateH("llllllllll",2434),hss1);
		tmss.put(new StateH("mmmmmmmmm",3434),hss3);
		
		Set<Entry<StateH,HashSet<CityH>>> sess = tmss.entrySet();
		System.out.println("Using iterator");
		Iterator<Entry<StateH,HashSet<CityH>>> iess = sess.iterator();
		while(iess.hasNext()) {
			Entry<StateH,HashSet<CityH>> ess = iess.next();
			System.out.println(ess.getKey()+"->"+ess.getValue());
		}
		
		
		
	}

}
