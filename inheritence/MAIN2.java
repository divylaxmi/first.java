package com.inheritence;

public class MAIN2 {
	public static void main(String args[]) {
		SBI  s1=new SBI();
		s1.rate_of_interest();
		s1.RBI_loan_dept();
		s1.sbi_info();
		
		//2nd child
		ADB a1=new ADB();
		a1.RBI_loan_dept();
		a1.rate_of_interest();
		a1.adb_info();
		
	}

}
