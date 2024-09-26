package com.encapsulation;

public class Student {
	//fully encapsulated class java bean
	
	public String name;
	//data hide access modifiers
	
	private String password;
	protected String msg="hiii";
	protected String msg1="hiii hello";
	protected void msg1() {
		System.out.println("access");
	}
	
	//setter getname
	//get
	public String getPassword() {
		return password;
	}


//set
public void setPassword(String password) {
	this.password=password;
	
}
}
