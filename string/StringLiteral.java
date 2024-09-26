package com.string;

public class StringLiteral {
	public static void main(String args[]) {
		String s1="Divya Laxmi";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.replace("Laxmi","Shrivastava"));
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.indexOf("m"));
		System.out.println(s1.length());
		System.out.println(s1.contains("Divya"));
		System.out.println(s1.substring(6,9));
		String s2="";
		String[] s3=s1.split(s2);
		System.out.println(s3);
		
		
	}
	

}
