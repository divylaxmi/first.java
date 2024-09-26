package com.abstraction;

public class Shapee implements Circlee,React{

	@Override
	public void area(int l, int b) {
		// TODO Auto-generated method stub
		System.out.println(l*b);
		
	}

	@Override
	public void area(double r, double pi) {
		// TODO Auto-generated method stub
		System.out.println(pi*r*r);
		
	}
	public static void main(String args[]) {
		Circlee c1=new Shapee();
		c1.area( 7.0,3.14);
		
		React r1=new Shapee();
		r1.area(10, 20);
	}
	

}
