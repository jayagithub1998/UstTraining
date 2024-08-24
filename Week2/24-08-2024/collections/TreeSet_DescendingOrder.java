package com.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_DescendingOrder {
	public static void main(String[] args) {
		TreeSet <String> tss = new TreeSet<>(new MyComparator());
		
		tss.add("aaaaa");
		tss.add("aaaaa");
		tss.add("ccccc");
		tss.add("bbbbbb");

	
	Iterator<String> itrs = tss.iterator();
	//this will print in ascending order
	for(;itrs.hasNext();) {
		System.out.println(itrs.next());
	}
	
	/*
	while(itrs.hasNext()) {
		System.out.println(itrs.next());
	}
	*/
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		//this is for descending order
		return o2.compareTo(o1);
		
		//this is for ascending order
		//return o1.compareTo(o2);
	}
	
}
