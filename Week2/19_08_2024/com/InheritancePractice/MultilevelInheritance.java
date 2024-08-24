package com.InheritancePractice;


class A{
	int i;
	A(int i){
		this.i=i;
		System.out.println("A(int i)");
	}
	void show() {
		System.out.println("Value of A.i is:"+i);
	}
	
}

class B extends A{
	int j;
	B(int i,int j){
		super(i);
		this.j=j;
		System.out.println("B(int j)");
	}
	void show() {
		super.show();
		System.out.println("Value of B.j is:"+j);
	}
}

class C extends B{
	int k;
	C(int i,int j,int k){
		super(i,j);
		this.k=k;
		System.out.println("C(int k)");
	}
	void show() {
		super.show();
		System.out.println("Value of C.k is:"+k);
	}
}

class D extends C{
	float l;
	D(int i,int j,int k,float l){
		super(i,j,k);
		this.l=l;
		System.out.println("D(int l)");
	}
	void show() {
		super.show();
		System.out.println("Value of D.l is:"+l);

	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
	//	C obj = new C(10,20,30);
	//	obj.show();
		
		System.out.println("D Class object");
		D Dobj = new D(10,20,30,10.5f);
		Dobj.show();
	
	}
}
