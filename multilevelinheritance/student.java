package com.multilevelinheritance;


public class student  extends employee{
	String name;
	int roll_no;
	String dept;
	
	public student(String name,String id,String city,double salary,int roll_no,String dept) {
		super(name,id,city,salary);
	
		this.roll_no=roll_no;
		this.dept=dept;
		
	}
	public void printInfo() {
		System.out.println(super.name+" "+roll_no+" "+dept);
		
	}

}
