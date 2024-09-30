package com.day7;

import java.util.HashSet;

public class AppendMthdHashSetExam {

	public static void main(String[] args) {
		HashSet h1=new HashSet(100);
		HashSet h2=new HashSet(100);
		h1.add(10);
		h1.add(20);
		h1.add("A");
		h1.add(null);
		System.out.println("h1="+h1);
		
		h2.add(10);
		h2.add(20);
		h2.add("B");
		h2.add(null);
		
		System.out.println("h2="+h2);
		
		//union
		h1.addAll(h2);
		System.out.println("After addition="+h1);
		
		//return common
		h1.retainAll(h2);
		System.out.println("insertion="+h1);
		
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(null);
		System.out.println("hs1="+hs1);
		

	}

}
