package com.epam.project.InternalProject;

import java.util.List;

public class Dataadder {
	void addproducts(List<Category> category) {
		Product newproduct=new Product("Rust men shirt",2000,10);
		category.get(0).subCategory.get(1).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("polo men shirt",1000,10);
		category.get(0).subCategory.get(1).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("colors men shirt",1000,10);
		category.get(0).subCategory.get(1).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("polo men jeans",1500,20);
		category.get(0).subCategory.get(1).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("colors men jeans",2500,20);
		category.get(0).subCategory.get(1).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("peterengland men jeans",2500,20);
		category.get(0).subCategory.get(1).products.put(newproduct.product_id, newproduct);
		
		//adding women products
		newproduct=new Product("Rust women tshirt",700,10);
		category.get(0).subCategory.get(2).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("polo women tshirt",700,10);
		category.get(0).subCategory.get(2).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("Rxo women tshirt",800,10);
		category.get(0).subCategory.get(2).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("polo women jeans",1000,20);
		category.get(0).subCategory.get(2).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("colors women jeans",2000,20);
		category.get(0).subCategory.get(2).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("peterengland women jeans",2000,20);
		category.get(0).subCategory.get(2).products.put(newproduct.product_id, newproduct);
		
		//adding mobiles
		newproduct=new Product("Samsung mobile",20000,10);
		category.get(1).subCategory.get(3).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("redmi mobile",16000,10);
		category.get(1).subCategory.get(3).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("asus mobile",10800,10);
		category.get(1).subCategory.get(3).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("iphone mobile",40000,20);
		category.get(1).subCategory.get(3).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("realme mobile",13000,20);
		category.get(1).subCategory.get(3).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("meizu mobile",15000,20);
		category.get(1).subCategory.get(3).products.put(newproduct.product_id, newproduct);
		
		//adding laptops
		newproduct=new Product("dell laptop",70000,10);
		category.get(1).subCategory.get(4).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("hp laptop",60000,10);
		category.get(1).subCategory.get(4).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("asus laptop",80000,10);
		category.get(1).subCategory.get(4).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("lenovo laptop",50000,20);
		category.get(1).subCategory.get(4).products.put(newproduct.product_id, newproduct);
		
		//adding home appliances
		newproduct=new Product("Microwave oven",7000,10);
		category.get(1).subCategory.get(5).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("washing machine",30000,10);
		category.get(1).subCategory.get(5).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("Vacuum cleaner",8000,10);
		category.get(1).subCategory.get(5).products.put(newproduct.product_id, newproduct);
		newproduct=new Product("AC",50000,20);
		category.get(1).subCategory.get(5).products.put(newproduct.product_id, newproduct);
	
		
	}
	void addCategories(List<Category> category) {
		category.add(new Category("Fashion"));
		category.add(new Category("Electronics"));
	}
	
	void addSubCategories(List<Category> category) {
		SubCategory newsubcategory=new SubCategory("Men");
		category.get(0).subCategory.put(newsubcategory.subCategoryid,newsubcategory);
		newsubcategory=new SubCategory("Women");
		category.get(0).subCategory.put(newsubcategory.subCategoryid,newsubcategory);
		newsubcategory=new SubCategory("Mobiles");
		category.get(1).subCategory.put(newsubcategory.subCategoryid,newsubcategory);
		newsubcategory=new SubCategory("Laptops");
		category.get(1).subCategory.put(newsubcategory.subCategoryid,newsubcategory);
		newsubcategory=new SubCategory("Home Appliances");
		category.get(1).subCategory.put(newsubcategory.subCategoryid,newsubcategory);
	}
}
