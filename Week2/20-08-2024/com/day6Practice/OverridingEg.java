package com.day6Practice;

import java.util.Objects;

class Product{
	int id;
	String name;
	
	public Product() {

	}
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	void display() {
		System.out.println("Product.display()");
	}
	
	//override toString()
	
	public String toString() {
		return "id ="+id+",name ="+name;
		
	}

	//overrid equals()
	@Override
	public boolean equals(Object obj) {
		if (this.getId() == ((Product) obj).getId())
			return true;
		else
			return false;

	}
	
	/* Cannot override - final method
	public void notify() {
		
	}
	*/
	

}

class ElectronicProduct extends Product{
	float voltage;
	void display() {
		System.out.println("ElectronicProduct.display()");
	}
}


public class OverridingEg {
	public static void main(String[] args) {
		Product obj = new ElectronicProduct();
		obj.display(); //derived class display method
		obj=new Product();
		obj.display();  //base class display method
		
		obj=new Product(1,"Prod1");
		System.out.println("Object is "+obj); //it is calling toString() method in Object class
		System.out.println("Object is "+obj.toString());
		System.out.println("\n");
		System.out.println("Overriding Equals() method");
		Product obj1=new Product(1,"Prod1");
		Product obj2=new Product(1,"Prod1");
		boolean val=obj1.equals(obj2);
		System.out.println("Equal value "+val);
		
		Product obj3=new Product(1,"Prod1");
		Product obj4=new Product(2,"Prod1");
		val=obj3.equals(obj4);
		System.out.println("Equal value "+val);
	} 

}
