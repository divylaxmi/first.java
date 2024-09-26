package com.polymorphism;

public class calc{
	
	
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,int b) {
		return a-b;
	}
	static double add(int a,double b) {
		return a*b;
	}
	static double add(double a,double b) {
		return a/b;
	}


	public static void main(String[] args) {
		
		System.out.println(calc.add(10, 10));
		
		System.out.println(calc.add(10, 10));
		
		System.out.println(calc.add(10, 10));
		
		System.out.println(calc.add(10, 10));
		
	}
}
