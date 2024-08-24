package com.day7;

//static method participate in inheritance
class A{
	static void met() {
		System.out.println("A.met()");
	}
}

//static method not participate in method override
class B extends A{
	/*void met() {
		System.out.println("B.met()");
	}*/
}

public class InheritaceEg {
	public static void main(String[] args) {
	/*	B obj = new B();
		obj.met();
		*/
	A.met();	
	}
}

