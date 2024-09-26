package com.exception;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s=null;
		}catch (NullPointerException e) {
            // Handle the NullPointerException
            System.out.println( e.getMessage());
           
        }

      
        System.out.println("codes...");
    }
}