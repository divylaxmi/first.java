package com.setinterfaceex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ConverSetIntoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarartion
		HashSet<Integer> h1=new HashSet<>();
		h1.add(10);
		h1.add(40);
		h1.add(33);
		h1.add(80);
		h1.add(1);
		System.out.println("Set="+h1);
		
		ArrayList<Integer> a1=new ArrayList<Integer>(h1);
		System.out.println("ArrayList="+a1);
		a1.add(20);
		//sort
		Collections.sort(a1);
		System.out.println("After Sorting="+a1);
		
		
		
		
		

	}

}
