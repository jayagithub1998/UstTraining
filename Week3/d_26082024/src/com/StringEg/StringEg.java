package com.StringEg;

public class StringEg {
	public static void main(String[] args) {
		String str = "This,is,to,test";
		int index = str.indexOf(",");
		
		System.out.println("----substring() method---");
		String subStr=str.substring(0, index);
		System.out.println("SubStr is "+subStr);
		
		System.out.println("----split() method---");
		String[] sArray= str.split(",");
		for(String i:sArray) {
			System.out.println(i);
		}
	}
}
