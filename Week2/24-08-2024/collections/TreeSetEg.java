package com.collections;

import java.util.Iterator;

import java.util.TreeSet;


class A{
	void met(){
	class B{
		
	}
	}
}
public class TreeSetEg {
	public static void main(String[] args) {
		TreeSet <String> tss = new TreeSet<>();
		
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
