package com.day3;

public class StrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=145;
		int temp,i,fact,digit;
		int sum=0;
		temp=num;
		while(temp!=0) {
			i=1;
			fact=1;
			digit=temp%10;
			while(i <= digit) {
	            fact = fact * i;
	            i++;
	         }
	         sum = sum + fact;
	         temp = temp / 10;
	      }

	      if(sum == num)
	       
	         System.out.println(num + " is a strong number\n");
	      else
	        
	         System.out.println(num + "is not a strong number\n");
	   

	}

}
