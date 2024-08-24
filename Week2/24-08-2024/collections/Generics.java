package com.collections;

class GenericEg<T>{
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
	
	
}

public class Generics {
	public static void main(String[] args) {
		GenericEg<String> ws = new GenericEg<String>();
		ws.setData("abc");
		System.out.println(ws);
		GenericEg<City> wc = new GenericEg<City>();
		
	/*  primitive types are not allowed in generic class type
		GenericEg<int> wi = new GenericEg<int>();
		*/
		
		/*There are wrapper class Integer,Float,Short */
		GenericEg<Integer> wi= new GenericEg<>();
		Integer oi=new Integer(21);
	}

}
