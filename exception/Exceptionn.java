package com.exception;

public class Exceptionn {
	    public Exceptionn(String msg) {
		// TODO Auto-generated constructor stub
	}

		public static void main(String[] args) {
	        int a=10;
	        int b=0;
	        try{
	            System.out.println(a/b);
	        }
	        catch(Exception e){
	            System.out.println(e.toString());
	            
	            System.out.println(e.getMessage());

	        }
	    }
	    
	}
