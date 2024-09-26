package com.inheritence;

public class child extends parent{


	 String city;



	public child(String name,String id,String city) {
		//parent constructor
		super(name, id);
		this.city=city;
	}

	
	
	public void printInfo() {
		System.out.println(name+" "+id+" "+city);
		/*System.out.println(super.id);
		System.out.println("parent class variable:"+super.name);
		super.parent_method();*/
	}
	
}