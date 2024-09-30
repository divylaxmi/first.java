package com.day8;

import java.util.HashMap;

public class CheckHashMapEmpty {

	public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Adding some key-value pairs to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);

        // Check again after adding elements
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Display the contents of the HashMap
        System.out.println("HashMap contents: " + map);
    }

}
