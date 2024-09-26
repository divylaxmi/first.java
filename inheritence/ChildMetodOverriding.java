package com.inheritence;

public class ChildMetodOverriding extends ParentMethodOverriding {
	public void print_info(String name) {
		System.out.println("child name="+name);
	}
	public static void main(String args[]) {
		

		ChildMetodOverriding c1=new ChildMetodOverriding();
		c1.print_info("child");
	
	}

}
