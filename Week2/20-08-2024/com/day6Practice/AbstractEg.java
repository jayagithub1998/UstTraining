package com.day6Practice;

abstract class Animal{
	String animalName;
	
	Animal(String name){
		animalName=name;
		System.out.println("Animal name is "+name);
	}
	
	abstract void move();
	
	void eat() {
		System.out.println("Animal.eat()");
	}
}

//concrete class
class Snake extends Animal{
	Snake(String name){
		super(name);
	}
	
	@Override
	void move() {
		System.out.println("Crawling...");
		
	}
	
}

public class AbstractEg {
	public static void main(String[] args) {
		Animal obj = new Snake("Snake");
		obj.move();
		obj.eat();
	}

}

