package com.exception;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//code which try 
		try {
		int a=100/10;
		System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is executed:");
		}

		//System.out.println("rest of code....");
		//System.out.println("rest of code....");
		//System.out.println("rest of code....");

	}

}
