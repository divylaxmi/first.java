package com.multilevelinheritance;

public class employee extends person{
	double salary;
	public employee(String name,String id,String city,double salary) {
		super(name,id,city);
	
		this.salary=salary;
		
		System.out.println( super.name+" "+super.id+super.city+" "+salary);
		
	}

}
