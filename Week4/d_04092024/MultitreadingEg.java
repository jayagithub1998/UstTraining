package com.PDatabseEg;

class PrintChar extends Thread{
	static String str="Hi, I am using Multithreading";
	@Override
	public void run() {
		try {
		for(int i=0;i<str.length()-1;i++) {
			System.out.println("Child Thread char : "+str.charAt(i));
			Thread.sleep(30);
		}
	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class MultitreadingEg {
	static String str="Hi, I am using Multithreading";
	public static void main(String[] args) {
		PrintChar thread=new PrintChar();
		thread.start();
		try {
		for(int i=0;i<str.length()-1;i++) {
			System.out.println("Main Thread char : "+str.charAt(i));
			thread.sleep(25);
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
