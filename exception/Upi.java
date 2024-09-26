package com.exception;
@SuppressWarnings("serial")
class UpiException extends Exception{
	public UpiException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
	
}

public class Upi {
	static void validUpi1(int n)throws  UpiException {
		if(n!=1234) {
			throw new UpiException("upi is not matched");
		}
		else {
			System.out.println("upi is matched");
}
		
	}
public static void main(String args[]){
	try{
		//method call
		validUpi1(1234);
	}
	catch(UpiException e) {
		System.out.println("Exception occurred..");
	}
		
}
}


