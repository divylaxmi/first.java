package com.exception;
@SuppressWarnings("serial")
class LeapYear extends Exception{
	LeapYear(String msg){
		 //call parent cons
		 super(msg);
	 } 
}
public class CheckLeapYear {
	static void leapYear(int num)throws LeapYear{
		if(num%4!=0) {
			throw new LeapYear("this is not a leap year");
		}
		else {
			System.out.println("this is  leap year");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			leapYear(2024);
		}catch(LeapYear e){
			System.out.println("exception..");
			
		}

	}

}
