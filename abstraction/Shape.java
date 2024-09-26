package com.abstraction;

public abstract class Shape {
	Shape(){
		System.out.println("this is a shape");
		
	}
	public void msg() {
		System.out.println("non abstracted method");
	}
	abstract void area();

}
