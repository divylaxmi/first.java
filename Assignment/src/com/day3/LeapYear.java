package com.day3;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a year:");
		 year=sc.nextInt();
		if(year % 4==0 && year%100!=0) {
			System.out.println("This is a leap year");
		}
		else if(year %400==0){
			System.out.println("This is also a leap year");
		}
		else {
			System.out.println("This is not a leap year");
		}

	}

}
