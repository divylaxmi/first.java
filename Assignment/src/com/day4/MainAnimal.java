package com.day4;

class Animal {
	public void makeSound() {
		System.out.println("The Animal makes a sound.");
		
	}

	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("The cat meowsss");
		
	}
	

}



class Dog extends Animal {
	public void Dog_Voice() {
		System.out.println("The Dog Barks");
	}

}


class Cat extends Animal {
	public void cat_voice() {
		System.out.println("The cat Meows");
	}
	//override the method of animal
	
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("The cat meows.......");
		
	}

}

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		c1.makeSound();
		c1.cat_voice();
		c1.voice();
		
		Dog d1=new Dog();
		d1.Dog_Voice();
		
		

	}

}
