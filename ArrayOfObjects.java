package com.arrayofobjects;
public class ArrayOfObjects {

	public static void main(String[] args) {
		//declare array of student
		Student [] arr;
		
		//size
		arr=new Student[3];
		
		//initilize
		arr[0]=new Student(101,"Divya","A");
		arr[1]=new Student(102,"Damini","A");
		arr[2]=new Student(103,"Diya","A");
		System.out.println("1st Student data=");
		arr[0].display();
		System.out.println("2nd Student data=");
		arr[1].display();
		System.out.println("3rd Student data=");
		arr[2].display();
	}

}


class Student{
	int rollno;
	String name;
	String grade;
	
	//constructor
	Student(int rollno,String name,String grade){
		this.rollno=rollno;
		this.name=name;
		this.grade=grade;
	}
	public void setData(int rollno,String name,String grade) {
		
	}
	//display
	public void display() {
		System.out.println("student rollno:"+rollno+" "+name+" "+grade);
	}
}

