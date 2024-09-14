package com.JunitCheck;

public class Arithmetic {
	  public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public double maxValue(double a, double b) {
	    	if(a>b) {
	    		return a;
	    	}
	    	else
	    		return b;
	    }
	    
	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        return a / b;
	    }

}
