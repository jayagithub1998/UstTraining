package com.Multithreading;


class PrintChar2 extends Thread{

	@Override
	public void run() {
		
		try {
		for(;MultithreadingEg2.getIndex()<MultithreadingEg2.getStr().length();) {
			System.out.println("Child Thread char : "+MultithreadingEg2.getStr().charAt(MultithreadingEg2.getIndex()));
			MultithreadingEg2.incIndex();
			Thread.sleep(30);
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class MultithreadingEg2 {
	static String str="Hi, I am using Multithreading";
	private static int index=0;
	
	public static String getStr() {
		return str;
	}

	public static int getIndex() {
		return index;
	}
	
	public static int incIndex() {
		return index++;
	}

	public static void setIndex(int index) {
		MultithreadingEg2.index = index;
	}

	public static void main(String[] args) {
		PrintChar2 thread=new PrintChar2();
		thread.start();
		try {
		for(;index<str.length();index++) {
			System.out.println("Main Thread char : "+str.charAt(index));
			thread.sleep(25);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}


