package com.inheritence;

public class Activa {
	String compname;
	float price;
	Activa(){
		System.out.println("i have a petrol engine");
	}
	
	public void bill(String compname,double price) {
		System.out.println("my new activa:"+compname+" "+price);
		
	}

}
