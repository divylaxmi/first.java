package com.abstraction;

public class Circle extends Shape {
	int radius=7;
	void area() {
		System.out.println(3.14*radius*radius);
		
	}
	public static void main(String args[]) {
		//object
		Shape s1=new Circle();
		s1.area();
		s1.msg();
		
	}

}
