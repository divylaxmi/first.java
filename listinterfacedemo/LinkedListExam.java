package com.listinterfacedemo;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 LinkedList l1=new LinkedList();
		
		l1.add(101);
		l1.add('d');
		l1.add(true);
		l1.add(5.0);
		l1.add("hello");
		l1.add(null);
		System.out.println(l1);
		
		l1.addFirst(5.0);
		System.out.println(l1);
		l1.addLast("hello");
		
		System.out.println(l1);
		
		l1.removeFirst();
		System.out.println(l1);
		
		l1.removeLast();
		System.out.println(l1);
		

	}

}
