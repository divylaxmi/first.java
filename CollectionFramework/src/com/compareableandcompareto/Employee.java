package com.compareableandcompareto;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>  {
	int id;
	String name;
	String dept;
	
	Employee(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
		
	}
	
	@Override
	public int compareTo(Employee o) {
		if(id==o.id)
		return 0;
		else if(id>o.id)
			return 1;
		else
			return -1;
					
	}
	
	public static void main(String[] args) {
		
		//arraylist
		
		ArrayList<Employee> a1=new ArrayList<Employee>();
		
		//add
		a1.add(new Employee(101,"Divya","BTech"));
		a1.add(new Employee(102,"Saloni","BCA"));
		a1.add(new Employee(103,"Shruti","MCA"));
		
		//sorting
		Collections.sort(a1);
		for(Employee obj:a1) {
			System.out.println(obj.id+" "+obj.name+" "+obj.dept);
		}
	
	}
}
