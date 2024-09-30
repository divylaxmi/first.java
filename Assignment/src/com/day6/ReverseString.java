// 1.Write a program to reverse a given List of strings.
package com.day6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	    public static void main(String[] args) {
	        // Create a List of Strings
	        List<String> strings = new ArrayList<>();
	        strings.add("Apple");
	        strings.add("Banana");
	        strings.add("Cherry");
	        strings.add("Date");
	        strings.add("Elderberry");

	        // Print the original List
	        System.out.println("Original List:"+strings);

	        // Reverse the List using Collections.reverse() method
	        Collections.reverse(strings);

	        // Print the reversed List
	        System.out.println("Reversed List:"+strings);
	    }
	}

