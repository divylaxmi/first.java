package com.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CricketHashMapExam {

	public static void main(String[] args) {
	        // Create a HashMap to store cricketer names and their scores
	        Map<String, Integer> cricketerScores = new HashMap<>();

	        // Add some cricketers and their scores to the map
	        cricketerScores.put("Virat Kohli", 12000);
	        cricketerScores.put("Dhoni", 18426);
	        cricketerScores.put("Rohit Sharma", 9205);
	        
	        // Create a scanner to get input from the user
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter a cricketer's name
	        System.out.print("Enter the cricketer's name to search for their score: ");
	        String name = scanner.nextLine();

	        // Search for the cricketer's score and display it
	        if (cricketerScores.containsKey(name)) {
	            System.out.println(name + "'s score: " + cricketerScores.get(name));
	        } else {
	            System.out.println("Cricketer not found in the records.");
	        }
	    }

	}


