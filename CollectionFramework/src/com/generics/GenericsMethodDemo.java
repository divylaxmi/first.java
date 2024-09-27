package com.generics;

public class GenericsMethodDemo {

	public static<E> void printArray(E[] elements) {
		// TODO Auto-generated method stub
		for(E  e:elements) {
			System.out.println(e);
			
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Integer[] intArray= {10,20,30,40};
		Character[] charArray= {'j','a','v','a'};
		System.out.println("print int array=");
		printArray(intArray);
		System.out.println("print char array=");
		printArray(charArray);

}
}
