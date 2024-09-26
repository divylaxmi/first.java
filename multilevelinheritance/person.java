package com.multilevelinheritance;


public class person {
	 String name;
	 String id;
	 String city;

	public person(String name,String id,String city){
		this.name=name;
		this.id=id;
		this.city=city;
		System.out.println("info about person is:"+name+" "+id+" "+city);
	}	
}
