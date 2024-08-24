package com.cmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMap_DescendingOrder {
	public static void main(String[] args) {
		//Map<String,String> hmss=new TreeMap<>();
		
		//TreeMap in descending order of states
		Comparator<String>cc = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		};
		
		Map<String,String> hmss=new TreeMap<>(cc);
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


