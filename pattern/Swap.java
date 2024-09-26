package com.pattern;
import java.util.Scanner;

public class Swap {
	public static void main(String args[]) {
		System.out.println("enter the value of x and y:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping:"+x+" "+y);
		
	}

}
