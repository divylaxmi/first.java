package com.encapsulation;

public class Main2 {
	public static void main(String args[]) {
		Student s1=new Student();
		//method call
		s1.name="divya";
		System.out.println(s1.name);
		s1.setPassword("div123");
		System.out.println(s1.getPassword());
		//s1.msg();
	}

}
