package com.epam.project.InternalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class ShoppingOperator {
	List<Category> category;
	Cart mycart;
	private Scanner scan;
	Dataadder dataadder ;
	public ShoppingOperator() {
		super();
		this.category = new ArrayList<Category>();
		mycart=new Cart();
		dataadder =new Dataadder();
		scan=new Scanner(System.in);
		dataadder.addCategories(category);
		dataadder.addSubCategories(category);
		dataadder.addproducts(category);
	}
	
	public void shoppingMenu() {
			
    		displayCategory();
    		
    		System.out.println("Enter the id to open subcategory");
  
        	int categoryoption =scan.nextInt()-1;
        	
			subCategoryMenu(categoryoption);
    	
	}

	private void subCategoryMenu(int categoryoption) {
		category.get(categoryoption).displaySubcategories();
		
		System.out.println("Enter the id to open products in subcategory or 0 to go back");
		
		int subcategoryoption =scan.nextInt();
		if(subcategoryoption==0)
			shoppingMenu();
		else
			productsMenu(categoryoption,subcategoryoption);
	}
	private void productsMenu(int categoryoption, int subcategoryoption) {
		SubCategory subcategory=category.get(categoryoption).subCategory.get(subcategoryoption);
    		
    		subcategory.displayProducts();
    		
    		System.out.println("enter 1 to add product");
        	System.out.println("enter 2 to go to category");
        	System.out.println("enter 0 to got to cart");
        	System.out.println("enter any key to exit");

        	int option =scan.nextInt();
    	
			switch(option) {
        	case 1:addToCartMenu(subcategory);
        		productsMenu(categoryoption,subcategoryoption);
        		break;
        	case 2:
        		shoppingMenu();
        		break;
        	case 0:showCart();
        		break;
        	default:
        		System.exit(0);
        		break;
    	
    	}
		
	}
	
	public void addToCartMenu(SubCategory subcategory) {
		System.out.println("enter productid to add to cart");
		int productid =scan.nextInt();
		System.out.println("enter quantity");
		int quantity=scan.nextInt();
		System.out.println(mycart.addProductToCart(subcategory.products,productid,quantity));
		
	}
	
	private void showCart() {
		mycart.showCartProducts();
		
		System.out.println("enter 1 to place order");
    	System.out.println("enter 2 to go to category");
    	System.out.println("enter any number to exit");
    	int option =scan.nextInt();
    	switch(option) {
    	case 1:
    		System.out.println("order placed.......");
    		break;
    	case 2:
    		shoppingMenu();
    		break;
    	default:
    		System.exit(0);
    		break;
	
	}
		
	}
	
	private void displayCategory() {
		System.out.printf("%-15s %-20s%n","Categoryid","CategoryName");
		for(Category categorylist :category) {
			
			System.out.printf("%-15s %-20s%n",categorylist.categoryid,categorylist.name);
		}
		
	}
	
	
}
