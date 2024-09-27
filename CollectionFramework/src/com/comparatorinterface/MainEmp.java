package com.comparatorinterface;

import java.util.ArrayList;
import java.util.Collections;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Employee> e1=new ArrayList<Employee>();
		
		e1.add(new Employee("Divya",101,80000));
		e1.add(new Employee("Shalini",102,60000));
		e1.add(new Employee("Damini",103,70000));
		
		Collections.sort(e1,new EmpId());
		System.out.println("sorting data");
		for(Employee obj:e1) {
			System.out.println(obj.name+" "+obj.id+" "+obj.salary);
			
			//multiple
			Collections.sort(e1,new EmpSalary());
			System.out.println("sorting data");
			for(Employee obj1:e1) {
				System.out.println(obj1.name+" "+obj1.id+" "+obj1.salary);
				
		
			}
		}
	}
	}

