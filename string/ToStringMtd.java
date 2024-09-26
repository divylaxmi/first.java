package com.string;

public class ToStringMtd {
	int rollno;
	String name;
	
	public ToStringMtd(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;	
	}
	public String toString() {
		return rollno+" "+name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMtd t1=new ToStringMtd(1,"Divya");
		ToStringMtd t2=new ToStringMtd(2,"Laxmi");
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
