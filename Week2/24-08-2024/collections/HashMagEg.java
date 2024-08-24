package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMagEg {
	public static void main(String[] args) {
		Map<String,String> hmss=new HashMap<>();
		hmss.put("State1", "City1");
		hmss.put("State2", "City2");
		hmss.put("State3", "City3");
		
		Set<Entry<String,String>> sess = hmss.entrySet();
		
		//Using iterator
		System.out.println("Using iterator");
		Iterator<Entry<String,String>> iess = sess.iterator();
		while(iess.hasNext()) {
			Entry<String,String> ess = iess.next();
			System.out.println(ess.getKey()+"->"+ess.getValue());
		}
		
		//Using enhanced for loop
		System.out.println("Using enhanced for loop");
		for(Entry<String,String> itr : sess) {
			System.out.println(itr.getKey()+"->"+itr.getValue());
		}
		
	}
	
	
}
