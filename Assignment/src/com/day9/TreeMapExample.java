package com.day9;
import java.util.TreeMap;
public class TreeMapExample {
	

	    public static void main(String[] args) {
	        // Create a TreeMap to store key-value pairs
	        TreeMap<String, Integer> treeMap = new TreeMap<>();

	        // Add key-value pairs to the TreeMap
	        treeMap.put("One", 1);
	        treeMap.put("Two", 2);
	        treeMap.put("Three", 3);

	        // Display the initial Value
	        System.out.println("Initial TreeMap: " + treeMap);

	        // Remove the entry with the key "Two" and return its associated value
	        Integer removedValue = treeMap.remove("Two");
	        System.out.println("Removed value = " + removedValue);

	        // Check if the entry with the key "Three" is removed
	        boolean isThreeRemoved = treeMap.remove("Three", 3);
	        System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved);

	        // Display the updated TreeMap
	        System.out.println("Updated TreeMap: " + treeMap);
	    }
	}

