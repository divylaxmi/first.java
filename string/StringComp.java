package com.string;

public class StringComp {
	public static void main(String args[]) {
		String data1="java";
		String data2="java";
		String data3=new String("java");
		
		//compare(== operator)check memory address,store in constant pool
		System.out.println(data1==data2);
		System.out.println(data1==data3);
		
		//compare(equals())check content,store in heap 
		boolean result=(data1.equals(data3));
		System.out.println(result);
		
		
		
		
		
		
	}

}
