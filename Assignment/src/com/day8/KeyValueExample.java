package com.day8;
import java.util.HashMap;

public class KeyValueExample {
	
	    public static void main(String[] args) {
	        // Create a HashMap to store key-value pairs
	        HashMap<String, Integer> map = new HashMap<>();

	        // Add key-value pairs to the HashMap
	        map.put("Apple", 10);      
	        map.put("Banana", 20);     
	        map.put("Orange", 30);   

	        // Display the HashMap contents
	        System.out.println("HashMap contents:" + map);

	        // Add a new value with an existing key
	        map.put("Banana", 25);  

	        // Add a value with a new key
	        map.put("Grapes", 40);  

	        // Display the updated HashMap contents
	        System.out.println("Updated HashMap contents: " + map);
	    }
	}



