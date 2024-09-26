package com.number;

public class pen {
	
	//data members
	String color;
	String type;
	
	//default constructor
	pen(){
		System.out.println("i am default constructor");
	}
	
	//parametrised constructor
	pen(int price){
		System.out.println("parametrised constructor");
	}
	//member functions
	public void write() {
		System.out.println("writting");
		
	}

}
