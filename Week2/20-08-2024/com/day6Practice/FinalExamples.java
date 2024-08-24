package com.day6Practice;

class FinalVariableExamples{
	final int number;
	
	FinalVariableExamples(int i){
		number=i;
		final int j=0;
	//	j=1;
	//	i=5;
	//	number=4;
		System.out.println("number "+i);
	}
}


public class FinalExamples {
	public static void main(String[] args) {
		final FinalVariableExamples fobj=new FinalVariableExamples(6);
	//	fobj=new FinalVariableExamples(7);
		
	}

}
