package com.polymorphism;

public class employee {
	public void print_info(String name,int id) {
		System.out.println("basic info of employee:"+name+id);
		
	}
	public void print_info(int salary ,int id) {
		System.out.println("basic info of employee:"+salary+id);
		
	}
	public void print_info(String name,String desg) {
		System.out.println("basic info of employee:"+name+desg);
		
	}
	
	public static void main(String args[]) {
		employee e=new employee();
		e.print_info("divya ", 2);
		e.print_info(500000 , 2);
		e.print_info("divya" , " ,software developer");
	}

}
