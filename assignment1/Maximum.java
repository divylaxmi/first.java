//Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.
package com.assignment1;
import java.util.*;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the 1st number:");
		int num1=sc.nextInt();
		System.out.println("enter the 2nd number:");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("num1 is maximum than num2");
		}
		else {
			System.out.println("num2 is maximum");
		}
		
		

	}

}
