package com.epam.project.InternalProject;

import java.util.ArrayList;
import java.util.List;

public class Product {
	static List<Product> allproducts=new ArrayList<Product>();
	static int uniqueid=0;
	int product_id;
	String name;
	int price;
	int quantity;
	public Product(String name, int price,int quantity) {
		super();
		uniqueid=uniqueid+1;
		this.product_id = uniqueid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Product(Product product,int quantity) {
		super();
		
		this.product_id = product.product_id;
		this.name = product.name;
		this.price = product.price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
}
