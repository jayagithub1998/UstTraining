package com.JunitCheck;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ArithmeticTest {

   // private final Arithmetic arithmetic = new Arithmetic();
	private Arithmetic arithmetic;

    @BeforeAll
    static void befallmet() {
    System.out.println("Before All method");	
    }
    
    @BeforeEach
    void befeachmet() {
    arithmetic = new Arithmetic();
    System.out.println("Before Each method");	
    }
    
    
    @Test
    @Tag("feature1")
    void testAdd() {
    	System.out.println("Met 1");
        assertEquals(5, arithmetic.add(2, 3), "Addition should return the sum of two numbers");
    }
    
    @Test //test case
    @Tag("feature2")
    @Order(1)
    void testMet() {
    	System.out.println("Met 1");
    	Arithmetic arith = new Arithmetic();
    	
    	//invoke business logic method with certain parameters
    	int actual_val=arith.add(-5,-3);
    	//cross check return value with expected value using assert
    	assertEquals(-8,actual_val,"Addition should work for negative values also");
    }
    
    @Test
    @Tag("feature1")
    @Order(3)
    void testMax() {
    	System.out.println("Met 2");
        assertEquals(5, arithmetic.maxValue(5, 4), "Max should return the largest value");
    }
    
    @Test
    @Tag("feature1")
    @Order(2)
    void testMax1() {
    	System.out.println("Met 3");
        assertEquals(4, arithmetic.maxValue(-5, 4), "Max should return the largest value");
    }

    @Test
    @Tag("feature2")
    void testMaxNeg() {
    	System.out.println("Met 1");
        assertNotEquals(-5, arithmetic.maxValue(-5, 4), "Max should return the largest value");
    }
    @Test
    @Tag("feature2")
    void testSubtract() {
    	System.out.println("Met 1");
        assertEquals(1, arithmetic.subtract(5, 4), "Subtraction should return the difference of two numbers");
    }

    @Test
    @Tag("feature1")
    void testMultiply() {
    	System.out.println("Met 1");
        assertEquals(6, arithmetic.multiply(2, 3), "Multiplication should return the product of two numbers");
    }

    @Test
    @Tag("feature2")
    void testDivide() {
    	System.out.println("Met 1");
        assertEquals(2, arithmetic.divide(6, 3), "Division should return the quotient of two numbers");
    }

    @Test
    @Tag("feature2")
    void testDivideByZero() {
    	System.out.println("Met 1");
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> arithmetic.divide(1, 0), "Division by zero should throw ArithmeticException");
        assertEquals("Cannot divide by zero", thrown.getMessage());
    }
    
    @Test
    @Tag("feature1")
    void metArray() {
    	int arr[]= {11,22,33,44,55};
    	int[] actual_arr=arithmetic.reverseArr(arr);
    	int [] expected_arr= {55,44,33,22,11};
    	assertArrayEquals(expected_arr, actual_arr,"Comparing reverser arrays");
    	
    	
    }
    
    @AfterEach
    void metafter() {
    	arithmetic=null;
    	System.out.println("After each");
    }
    @AfterAll
    static void metafterAll() {
    	System.out.println("After All");
    }
}

