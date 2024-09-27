package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterface {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		String e;
		list.add("java");
		list.add("python");
		list.add("php");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String element=itr.next();
			System.out.println(element);
		}
		

	}

}
