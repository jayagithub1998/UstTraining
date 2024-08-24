package com.Collections;

class Generic<T>{
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
public class GenericsEg {
	public static void main(String[] args) {
		Generic<String> sobj = new Generic<>();
		Generic<City> cobj = new Generic<>();
		
		//for primitive type - use wrapper class
		Generic<Integer> iobj=new Generic<>();
		Generic<Float> fobj=new Generic<>();
		
		//Wrapper class
		Integer io= new Integer(21);
		String sv="25";
		int iv = Integer.parseInt(sv);
		System.out.println("integer value is "+iv);
	}
}
