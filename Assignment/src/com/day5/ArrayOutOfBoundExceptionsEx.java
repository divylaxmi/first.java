//1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.
package com.day5;

public class ArrayOutOfBoundExceptionsEx {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8};
		try {
			System.out.println("Accessing element at index 10:"+num[10]);
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("Exception Caught:"+e);
		}
		System.out.println("Continues....");

	}

}
