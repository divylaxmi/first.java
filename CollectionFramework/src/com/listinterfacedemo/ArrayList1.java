package com.listinterfacedemo;
import java.util.ArrayList;
import java.util.List;
import java.util.List.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare
		ArrayList a1=new ArrayList();
		//add
		a1.add(100);
		a1.add('c');
		a1.add(true);
		a1.add(2.5);
		a1.add("hi");
		a1.add(null);
		System.out.println(a1);
		System.out.println("size of list="+a1.size());
		a1.remove(2);
		System.out.println(a1);
		

	}

}
