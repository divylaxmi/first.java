package com.compareableandcompareto;

import java.util.ArrayList;
import java.util.Collections;

/*comparable(single sequence sorting(only one condition))
 * implement
 * override compareto() method
 * calling
 * main
 * */
 

public class Student implements Comparable<Student> {
	//data
	int rollno;
	String name;
	int age;
	
	//con
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}

	@Override
	public int compareTo(Student o) {
		if(age==o.age)
		return 0;
		else if(age>o.age)
		    return 1;
		else
			return -1;
	}


public static void main(String[] args) {
	//arraylist
	
	ArrayList<Student> a1=new ArrayList<Student>();
	
	//add
	a1.add(new Student(101,"abc",20));
	a1.add(new Student(102,"cde",30));
	a1.add(new Student(103,"fgh",18));
	
	//sorting
	Collections.sort(a1);
	for(Student obj:a1) {
		System.out.println(obj.rollno+" "+obj.name+" "+obj.age);
	}
	
	

}
}

