package com.epam.project.InternalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Cart {
	List<Product> cartlist;
	double finalprice;
	public Cart() {
		super();
		this.cartlist = new ArrayList<Product>();
		this.finalprice = 0;
	}
	
	

public String addProductToCart(Map<Integer, Product> subproductslist, int requiredproductid, int requiredquantity) {
		
		Product product=subproductslist.get(requiredproductid);
		if(product ==null)
			return "*************no product exist for that id*************";
		//condition for quantity not exist
		if(requiredquantity>product.quantity)
			return "*************cannot add to cart(quantity not exist)*************";
		
		
		finalprice=finalprice+product.price*requiredquantity;
		product.quantity=product.quantity-requiredquantity;
		cartlist.add(new Product(product,requiredquantity));
		return "*************product added to cart*************";
	}
	public void showCartProducts() {
		System.out.printf("%-10s %-20s %-20s%n","productid","productname","productqunatity");
		for(Product product :cartlist) {
			System.out.printf("%-10s %-20s %-20s%n",product.product_id,product.name,product.quantity);
		}
		System.out.println("finalprice:   "+finalprice);
	}

}
