package com.p2;

import com.p1.Product;

public class ShoppingCart {
	Product aprod[];
	int cindex;
	
	//Constructor
	public ShoppingCart(){
		aprod=new Product[5];
		cindex=0;
	}
	
	//add Product
	public Product addProduct(Product prod) {
		aprod[cindex]=prod;
		cindex++;
		System.out.println("Added product with id "+prod.getId());
		return prod;
	}
	
	//list product
	public void listProduct() {
		for(int i=0;i<cindex;i++) {
			aprod[i].display();
		}
	}
	
	void emptyCart() {
		aprod=new Product[5];
		cindex=0;
		System.out.println("Deleted all products from Shopping cart");
	}

}

