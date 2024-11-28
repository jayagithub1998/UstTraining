package com.example.eCommerce_FinalProject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	int Product_id;
	String Product_name;
	String Product_Category;
	
	public Product() {
		
	}
	public Product(int product_id, String product_name, String product_Category) {
		super();
		Product_id = product_id;
		Product_name = product_name;
		Product_Category = product_Category;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public String getProduct_Category() {
		return Product_Category;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public void setProduct_Category(String product_Category) {
		Product_Category = product_Category;
	}
	@Override
	public String toString() {
		return "Product [Product_id=" + Product_id + ", Product_name=" + Product_name + ", Product_Category="
				+ Product_Category + "]";
	}
	
	
	
}
