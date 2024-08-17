package com.ShoppingCartPractice;

class Product{
	//Data members
	int id;
	String name;
	float price;
	
	//Constructor
	Product(){
		id=0;
		name="";
		price=0;
	}
	
	Product(int pid,String pname,float pprice){
		id=pid;
		name=pname;
		price=pprice;
	}
	
	//Data methods
	void display() {
		System.out.println("id : "+id+"\nName : "+name+"\nPrice : "+price);
	}
	
}

public class ClassExample {
	public static void main(String[] args) {
		//creating object
		Product pobj=new Product(1,"Table",1600);
		pobj.display();
	}

}
