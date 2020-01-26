package com.epam.project.InternalProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubCategory {
	static List<SubCategory> allproducts=new ArrayList<SubCategory>();
	static int subCategoryuniqueid = 0;
	int subCategoryid;
	String name;
	Map<Integer,Product> products;
	public SubCategory( String name) {
		super();
		 subCategoryuniqueid = subCategoryuniqueid + 1;
		this.subCategoryid = subCategoryuniqueid ;
		this.name = name;
		this.products = new HashMap<Integer,Product>();
	}
	@Override
	public String toString() {
		return "SubCategory [subCategoryid=" + subCategoryid + ", name=" + name + ", products=" + products + "]";
	}
	public void displayProducts() {
		// TODO Auto-generated method stub
		System.out.printf("%-15s %-25s %-20s %-20s%n","productid","productName","productprice","productquantity");
		for(Integer productid :products.keySet()) {
			
			System.out.printf("%-15s %-25s %-20s %-20s%n",productid,products.get(productid).name,products.get(productid).price,products.get(productid).quantity);
		}
		
	}
	
}
