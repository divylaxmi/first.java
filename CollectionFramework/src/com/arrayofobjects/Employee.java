package com.arrayofobjects;

public class Employee {

	public static void main(String[] args) {
		Emp arr[];
		arr=new Emp[2];
		arr[0]=new Emp(1,"divya","B.tech");
		arr[1]=new Emp(2,"Shalu","ICICI");
		System.out.println("1st Employee data=");
		arr[0].display();
		System.out.println("2nd Employeedata=");
		arr[1].display();
		

	}

	private void display() {
		// TODO Auto-generated method stub
		
	}

}
class Emp{
	int id;
	String name;
	String dept;
	
	//constructor
	Emp(int id,String name,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	//display
	public void display() {
		System.out.println("Employee info:"+id+" "+name+" "+dept);
	}
}

