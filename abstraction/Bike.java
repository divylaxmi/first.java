package com.abstraction;

public abstract class Bike {
	Bike(){
		System.out.println("i am in bike constructor");
	}
	public void msg() {
	System.out.println("non abstraucted method");

}
	//abstruct non abstruct
	abstract void run();
}
