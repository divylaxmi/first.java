package com.iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		
		HashMap <Integer,String> hs=new HashMap<Integer, String>();
		hs.put(1, "Divya");
		hs.put(2, "Damini");
		hs.put(3, "Shalu");
		hs.put(4, "Anu");
		//hs.put(null, "Ritika");
		hs.get(hs);
		System.out.println(hs);
		/*System.out.println(hs.get(2));
		System.out.println(hs.get(null));
		System.out.println(hs.remove(hs));
		System.out.println(hs.containsKey(1));
		
		System.out.println(hs.isEmpty());
		
		System.out.println(hs.size());
		hs.clear();
		System.out.println(hs);*/
		
		//entrySet()
		System.out.println(hs.entrySet());
		
		//keyset() value()
		
		for(int i: hs.keySet()) {
			System.out.println("key set are="+i);
		}
		for(String string:hs.values()) {
			System.out.println("values="+string);
			
		}
		//map covert set
		Set<Map.Entry<Integer,String>> s=hs.entrySet();
		//for reading single entry
		for(Map.Entry<Integer, String> it :s) {
			System.out.println("single entry reading= "+it.getKey()+" "+it.getValue());
			
		}
		s.iterator();
		//while(it.hasNext()) {
			
		}

	}

}
