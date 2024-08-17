package com.eg;

import com.p1.Product;
import com.p2.ShoppingCart;

public class ShoppingCartMain {
	
	public static void main(String[] args) {
		
		ShoppingCart sobj=new ShoppingCart();
		System.out.println("Total no of product "+Product.getNum_of_prods());
		Product p1=new Product(1,"Chair");
		sobj.addProduct(p1);
		sobj.listProduct();	

		Product pobj=new Product(1,"Table");
		pobj.display();

		
	}	

}
