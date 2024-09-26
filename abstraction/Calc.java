package com.abstraction;

public class Calc implements Calcc {

	@Override
	public void addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		
	}
	public static void main(String args[]) {
		Calcc c1=new Calc();
		c1.addition(10, 10);
		c1.sub(10, 20);
		c1.mul(10, 10);
	}

}
