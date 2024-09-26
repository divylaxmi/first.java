package com.inheritence;

public class Main1 {
	public static void main(String args[]) {
		MCA m=new MCA();
		Btech b=new Btech() ;
		
		m.print_info("SBU","MCA");
		System.out.println(m.clgname="SBU");
		System.out.println(m.dept="MCA");
		
		
		b.print_info("SBU", "Btech");
		System.out.println(b.clgname="SBU");
		System.out.println(b.dept="Btech");
		
	}

}
