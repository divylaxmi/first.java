package com.homework;
import java.util.*;

public class Person {
	

	
		private int age;
		Scanner sc=new Scanner(System.in);

	    
	    public void isEligibleForCourse() {
	    	System.out.println("enter the age:");
	    	age=sc.nextInt();
	    	if(age<=24 && age>0) {
	    		System.out.println("you are eligible");
	    	}
	    	else {
	    		System.out.println("not eligible");
	    	}
	        
	    
	    }
}


