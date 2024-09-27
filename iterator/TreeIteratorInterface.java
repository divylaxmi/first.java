package com.iterator;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeIteratorInterface {

	public static void main(String[] args) {
		
		//Treeset
		TreeSet<String> t1=new TreeSet<>();
		
		//Add
		t1.add("java");
		t1.add("python");
		t1.add("php");
		
		//trav
		Iterator<String> itr=t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
