package com.generics;


class Test<T>{
	//an object of type t is declared
	T obj;
	Test(T obj){
		this.obj=obj;	
		}
	//constructor
	public T getObject() {
		return this.obj;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instance of integer type
		Test<Integer> iobj=new Test<Integer>(15);
		System.out.println(iobj.getObject());
		
		//instance of string type
		Test<String> sobj=new Test<String>("welcome");
		System.out.println(sobj.getObject());


	}

}
