package com.loosecoupling;

public class Car1 {
	Engine e;
	
	Car1(Engine e){
		this.e=e;
	}
	public void move() {
		System.out.println("Car move with:");
		e.show();
	}

}
