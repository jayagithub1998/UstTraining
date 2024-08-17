package com.ShoppingCartPractice;

class ShoppingCartFun{
/* 	Data members - array of products
 	Data methods -add product,list product,empty shoppingCart,Checkout  
*/
	//Data member
	ProductS[] aProd;
	int cindex;
	
	//Constructor - initialize data member
	ShoppingCartFun(){
		aProd=new ProductS[5];
		cindex=0;
	}
	
	//add product
	ProductS addProduct(ProductS prod) {
		aProd[cindex]=prod;
		cindex++;
		System.out.println("Product "+cindex+" added");
		return prod;
		
	}
	
	//list product
	void listProduct(){
			for(int i=0;i<cindex;i++) {
			aProd[i].display();
		}
	}
	
	//empty shoppingcart
	void emptyCart() {
		System.out.println("Empty section");
		aProd=new ProductS[5];
		cindex=0;
		System.out.println("Deleted all products");
	}
	
	//Checkout
	void Checkout() {
		System.out.println("Checkout Section");
		float total=0;
		for(int i=0;i<cindex;i++) {
			aProd[i].display();
			total=total+aProd[i].price;	
		}
		System.out.println("Total price is "+total);
	}
}

class ProductS{
	//Data members
	int id;
	String name;
	float price;
	
	//Constructor
	ProductS(int pid,String pname,float pprice){
		id=pid;
		name=pname;
		price=pprice;
		
	}
	
	//Data methods
	void display() {
		System.out.println("id : "+id+"\tName : "+name+"\tPrice : "+price);
	}
	
}

public class ShoppingCart {
	public static void main(String args[]) {
		ShoppingCartFun scart = new ShoppingCartFun();
		
		ProductS p1=new ProductS(100,"Chair",1000);
		scart.addProduct(p1);
		ProductS p2=new ProductS(200,"Mobile",2000);
		scart.addProduct(p2);
		scart.listProduct();
		
		scart.emptyCart();
		scart.listProduct();
		
		ProductS p3=new ProductS(300,"Book",100);
		scart.addProduct(p3);
		ProductS p4=new ProductS(400,"Pencil",200);
		scart.addProduct(p4);
		scart.listProduct();
		scart.Checkout();
		
	}

}
