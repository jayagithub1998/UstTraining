package com.p1;

public class Product{
	private int id;
	private String name;
	private static int num_of_prods=100;
	
	private Product(){
		id=0;
		name="";
		num_of_prods=1000;
	}
	
	public Product(int pid,String pname){
		this();
		id=pid;
		name=pname;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;   //this.id refer to datamember id
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getNum_of_prods() {
		return num_of_prods;
	}

	public static void setNum_of_prods(int num_of_prods) {
		Product.num_of_prods = num_of_prods;
	}

	static int get_num_prods() {
		return num_of_prods;
	}
	public void display() {
		int val=get_num_prods();
		System.out.println("id: "+id+"\nName: "+name+"\n");
		System.out.println("No of products :"+val);
	}

/*	Product display() {
		int val=get_num_prods();
		System.out.println("id: "+id+"\nName: "+name+"\n");
		System.out.println("No of products :"+val);
		return this;
	}*/

}