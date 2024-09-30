package com;

public class Palindrom {
	public static void main(String[] args) {
	       String str = "MadaM"; 
	        
	        StringBuilder str1 = new StringBuilder(str);
	        str1.reverse();
	        
	        if (str.equals(str1.toString())) {
	            System.out.println("Palindrome String");
	        } else {
	            System.out.println("Not a palindrome String");
	        }

		}

}
