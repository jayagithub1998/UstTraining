package com.ShoppingCartPractice;

class ProductA{
	//Data members
	int id;
	String name;
	
	//Constructor
	ProductA(int pid,String pname){
		id=pid;
		name=pname;
	}
	
	//Data methods
	void display() {
		System.out.println("id : "+id+"\tName : "+name);
	}
	
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		//creating array
		ProductA[] pArray = new ProductA[3];
		
		//creating objects
		pArray[0]=new ProductA(100,"Mobile");
		pArray[1]=new ProductA(200,"Chair");
		pArray[2]=new ProductA(300,"Watch");
		
		//calling Display method
		System.out.println("Using enhanced for loop");
		for(ProductA prod:pArray) {
			prod.display();
		}
		System.out.println();
		System.out.println("Using for loop");
		for(int i=0;i<pArray.length;i++) {
			pArray[i].display();
		}

	}

}
