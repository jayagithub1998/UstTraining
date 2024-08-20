package com.InheritancePractice;

class A1{
	private  int i;
	A1(int i){
		this.i=i;
		System.out.println("A(int i)");
	}
	void show() {
		System.out.println("Value of A.i is:"+i);
	}
}

class B1 extends A1{
	private int j;
	B1(int i,int j){
		super(i);
		this.j=j;
		System.out.println("B(int j)");
	}
	void show() {
		super.show();
		System.out.println("Value of B.j is:"+j);
	}
}

class C1 extends B1{
	private int k;
	C1(int i,int j,int k){
		super(i,j);
		this.k=k;
		System.out.println("C(int k)");
	}
	void show() {
		super.show();
		System.out.println("Value of C.k is:"+k);
	}
}

class D1 extends C1{
	private float l;
	D1(int i,int j,int k,float l){
		super(i,j,k);
		this.l=l;
		System.out.println("D(int l)");
	}
	void show() {
		//super.show();
		System.out.println("Value of D.l is:"+l);
		super.show();
	}
}


public class Private_MultilevelInheritance {
	public static void main(String[] args) {
		//	C obj = new C(10,20,30);
		//	obj.show();
			
			System.out.println("D Class object");
			D1 D1obj = new D1(10,20,30,10.5f);
			D1obj.show();
		}
}
