package com.number;

public class Main {
	public static void main(String args[]) {
		//object creation
		pen p1=new pen();
		p1.color="blue";
		p1.type="gel";
		System.out.println(p1.color);
		System.out.println(p1.type);
		p1.write();
		
		pen p2=new pen(10);
	}

}
