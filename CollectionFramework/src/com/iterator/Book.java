package com.iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Book {

	public static void main(String[] args) {
		HashMap<String,Double> hs=new HashMap<String,Double>();
		hs.put("Math",250.0);
		hs.put("Science",350.0);
		hs.put("English",450.0);
		hs.put("Hindi",150.0);
		hs.get(hs);
		System.out.println(hs);
		
		//entrySet
		System.out.println(hs.entrySet());
		
		//KeySet ValueSet
		for(String s1:hs.keySet()) {
			System.out.println("Key set are = "+s1);
			
		}
		for(Double d:hs.values()) {
			System.out.println("Values= "+d);
		}
		//map convert set
		Set<Map.Entry<String,Double>> s=hs.entrySet();
		hs.put("Gk",350.0);
		
		for(Map.Entry<String,Double> it :s) {
			System.out.println("single entry reading= "+it.getKey()+" "+it.getValue());
			
		}

	}

}
