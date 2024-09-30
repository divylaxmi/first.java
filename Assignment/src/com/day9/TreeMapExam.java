package com.day9;

	import java.util.TreeMap;
	import java.util.Map;
	import java.util.Set;

	public class TreeMapExam {
	    public static void main(String[] args) {
	        // Create a TreeMap to store key-value pairs
	        TreeMap<String, Integer> treeMap = new TreeMap<>();

	        // Add key-value pairs to the TreeMap
	        treeMap.put("One", 1);
	        treeMap.put("Two", 2);
	        treeMap.put("Three", 3);
	        treeMap.put("Four", 4);

	        // 1. Using entrySet() to iterate over key-value pairs
	        System.out.println("Using entrySet():");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	        // 2. Using keySet() to iterate over just the keys
	        System.out.println("\nUsing keySet():");
	        for (String key : treeMap.keySet()) {
	            System.out.println("Key: " + key);
	        }

	        // 3. Using values() to iterate over just the values
	        System.out.println("\nUsing values():");
	        for (Integer value : treeMap.values()) {
	            System.out.println("Value: " + value);
	        }

	        // 4. Using forEach() with lambda to iterate over key-value pairs
	        System.out.println("\nUsing forEach() with lambda:");
	        treeMap.forEach((key, value) -> {
	            System.out.println(key + " = " + value);
	        });

	        // 5. Using descendingMap() to iterate in reverse order
	        System.out.println("\nUsing descendingMap():");
	        for (Map.Entry<String, Integer> entry : treeMap.descendingMap().entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }

	        // 6. Using firstEntry() and lastEntry() to access the first and last elements
	        System.out.println("\nUsing firstEntry() and lastEntry():");
	        Map.Entry<String, Integer> firstEntry = treeMap.firstEntry();
	        Map.Entry<String, Integer> lastEntry = treeMap.lastEntry();
	        System.out.println("First Entry: " + firstEntry.getKey() + " = " + firstEntry.getValue());
	        System.out.println("Last Entry: " + lastEntry.getKey() + " = " + lastEntry.getValue());

	        // 7. Using higherEntry() and lowerEntry() to get entries relative to a given key
	        System.out.println("\nUsing higherEntry() and lowerEntry():");
	        Map.Entry<String, Integer> higherEntry = treeMap.higherEntry("One");
	        Map.Entry<String, Integer> lowerEntry = treeMap.lowerEntry("Three");
	        System.out.println("Entry higher than 'One': " + higherEntry.getKey() + " = " + higherEntry.getValue());
	        System.out.println("Entry lower than 'Three': " + lowerEntry.getKey() + " = " + lowerEntry.getValue());

	        // 8. Using pollFirstEntry() and pollLastEntry() to retrieve and remove the first/last entry
	        System.out.println("\nUsing pollFirstEntry() and pollLastEntry():");
	        Map.Entry<String, Integer> polledFirstEntry = treeMap.pollFirstEntry();
	        Map.Entry<String, Integer> polledLastEntry = treeMap.pollLastEntry();
	        System.out.println("Polled First Entry: " + polledFirstEntry.getKey() + " = " + polledFirstEntry.getValue());
	        System.out.println("Polled Last Entry: " + polledLastEntry.getKey() + " = " + polledLastEntry.getValue());

	        // Updated TreeMap after polling
	        System.out.println("\nUpdated TreeMap after polling: " + treeMap);
	    }
	}



