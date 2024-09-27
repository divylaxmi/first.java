package com.setinterfaceex;

import java.util.HashSet;

public class HashSetexam {
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1=new HashSet(100);
		HashSet h2=new HashSet(100,(float)0.90);
		
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		
		h1.add("A");
		h1.add(100);
		h1.add(null);
		h1.add("A");
		System.out.println(h1);
		
		h2.add("B");
		h2.add(200);
		h2.add(null);
		h2.add("A");
		//h2.addFirst(200);
		System.out.println(h2);
		
		set1.add(1);
		set1.add(20);
		set1.add(4);
		set1.add(5);
		//h2.addFirst(200);
		System.out.println("set1="+set1);
		
		set2.add(1);
		set2.add(2);
		set2.add(4);
		set2.add(5);
		//h2.addFirst(200);
		System.out.println("set2="+set2);
		
		//union addAl
		
		set1.addAll(set2);
		System.out.println("union of set 1 and set 2="+set1);
		
		//return common
		set1.retainAll(set2);
		System.out.println("insertion="+set1);
		
		//uncommen ele
		set1.removeAll(set2);
		System.out.println("difference="+set1);
		
		//subset
		System.out.println(set1.containsAll(set2));
		
		
		
		
		
		
		
		
		
		

	}

}
