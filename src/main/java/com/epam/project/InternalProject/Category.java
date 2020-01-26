package com.epam.project.InternalProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Category {
	static List<Category> allproducts=new ArrayList<Category>();
	static int categoryuniqueid=0;
	int categoryid;
	String name;
	Map<Integer,SubCategory> subCategory;
	public Category( String name) {
		super();
		 categoryuniqueid= categoryuniqueid+1;
		this.categoryid = categoryuniqueid;
		this.name = name;
		this.subCategory = new HashMap<Integer,SubCategory>();
	}
	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", name=" + name + ", subCategory=" + subCategory + "]";
	}
	public void displaySubcategories() {
		System.out.printf("%-15s %-20s%n","subCategoryid","subCategoryName");
		for(Integer subcategoryid :subCategory.keySet()) {
			
			System.out.printf("%-15s %-20s%n",subcategoryid,subCategory.get(subcategoryid).name);
		}
		
	}
	
}
