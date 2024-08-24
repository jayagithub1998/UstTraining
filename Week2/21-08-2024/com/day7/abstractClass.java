package com.day7;

//Abstract class without abstract methods
abstract class Animal{
	String animalName;
	
	Animal(String name){
		animalName=name;
		System.out.println("Animal name is "+name);
	}
	

	void eat() {
		System.out.println("Animal.eat()");
	}
}
//concrete class
class Snake extends Animal{
	Snake(String name){
		super(name);
	}
	
	void move() {
		System.out.println("Crawling...");
		
	}
	
}

public class abstractClass {
	public static void main(String[] args) {
		Animal aobj = new Snake("Cat");
		aobj.eat();
		
	}
	
	

}
