package com.staticc;

public class Ajp {
	int id;
	String name;
	//same for all
	static String Projectname="Ajp";
	Ajp(int id,String name){
		this.id=id;
		this.name=name;
	}
	//static method
	static void print() {
		System.out.println("print....");
	}
	
//block
	static{
		System.out.println("i am static block.");
	}
	
	//display
	void display() {
		System.out.println(id+" "+name+" "+Projectname);
	}
	public static void main(String args[]) {
		Ajp a1=new Ajp(1,"Divya");
		Ajp a2=new Ajp(2,"Damini");
		a1.display();
		a2.display();
		Ajp.print();
	}

}
