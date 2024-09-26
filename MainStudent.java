package com.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Student> a1=new ArrayList<Student>();
		
		//add
		a1.add(new Student(10,"abc"));
		a1.add(new Student(12,"cde"));
		a1.add(new Student(13,"fgh"));
		
		//sorting as per age
		Collections.sort(a1,new Age());
		System.out.println("sorting data");
		for(Student obj:a1) {
			System.out.println(obj.age+" "+obj.name);
			
			//multiple
			Collections.sort(a1,new Name());
			System.out.println("sorting data");
			for(Student obj1:a1) {
				System.out.println(obj1.age+" "+obj1.name);

	}

}
	}
}
	
