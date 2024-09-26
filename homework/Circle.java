package com.homework;

public class Circle extends Area {
	public double r;
	public Circle(double r) {
		this.r=r;
	}
	public double calcArea() {
		return getPi()*r*r;
		
	}
	

}
