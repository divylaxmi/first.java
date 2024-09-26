package com.string;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		//capacity
		System.out.println(sb.capacity());// by default 16
		sb.append("hello ");
		System.out.println(sb.capacity());//new
		sb.append("world  india");
		System.out.println(sb.capacity());
		String msg=sb.toString();
		System.out.println(msg);

	}

	//private void append(String string) {
		// TODO Auto-generated method stub
		
	}

	//private void append(String string) {
		// TODO Auto-generated method stub
		
	//}


