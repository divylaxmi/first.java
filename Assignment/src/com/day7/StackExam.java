package com.day7;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push 10 elements into the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }

        // Display the stack after pushing 10 elements
        System.out.println("Stack after pushing 10 elements: " + stack);

        // Remove (pop) 4 elements from the stack
        for (int i = 1; i <= 4; i++) {
            stack.pop();
        }

        // Display the stack after popping 4 elements
        System.out.println("Stack after popping 4 elements: " + stack);
    }
}
