// 2.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.
package com.day6;

import java.util.ArrayList;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		a1.add(7);
		a1.add(8);
		System.out.println(a1);
		int sumOfEven=0;
		for(int a:a1) {
			if(a%2==0) {
				sumOfEven+=a;	
			}
			System.out.println(sumOfEven);
		}
		

	}

}
