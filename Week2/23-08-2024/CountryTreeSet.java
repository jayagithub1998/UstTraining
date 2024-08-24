package com.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

class Country{
	private String name;
	private double gdp;
	public Country(String name, double gdp) {
		this.name = name;
		this.gdp = gdp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGdp() {
		return gdp;
	}
	public void setGdp(double gdp) {
		this.gdp = gdp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gdp, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Double.doubleToLongBits(gdp) == Double.doubleToLongBits(other.gdp) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", gdp=" + gdp + "]";
	}
	
	
}
public class CountryTreeSet {
	public static void main(String[] args) {
		
		TreeSet <Country> tss = new TreeSet<>(new MyComparatorCountry());
		
		
		tss.add(new Country("aaa",12));
		tss.add(new Country("aab",22));
		tss.add(new Country("aac",32));
		tss.add(new Country("aad",11));

	
	Iterator<Country> itrs = tss.iterator();
	//this will print in ascending order
	for(;itrs.hasNext();) {
		System.out.println(itrs.next());
	}
	}
}

class MyComparatorCountry implements Comparator<Country>{

	@Override
	public int compare(Country o1, Country o2) {
		
		//this is for descending order 
		return (int)(o2.getGdp()-o1.getGdp());
		
		//this is for ascending order 
		//return (int)(o1.getGdp()-o2.getGdp());
	}
	
}
