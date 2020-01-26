package com.epam.project.InternalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Scanner scan;
    public static void main( String[] args )
    {
    	
    		scan=new Scanner(System.in);
    		System.out.println("1.Shopping ");
        	System.out.println("2.exit");
        	int option =scan.nextInt();
    	
			switch(option) {
        	case 1:ShoppingOperator shoppingoperator=new ShoppingOperator();
        		shoppingoperator.shoppingMenu();
        		break;
        	default:
        		System.exit(0);
        		break;
    	
    	}
		
    	}
    	
    }

	

	
	

