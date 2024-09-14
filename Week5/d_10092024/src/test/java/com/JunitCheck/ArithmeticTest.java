package com.JunitCheck;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
class ArithmeticTest {

  private final Arithmetic arithmetic = new Arithmetic();

    @BeforeAll
    static void befallmet() {
    System.out.println("Before All method");	
    }
    
    @BeforeEach
    void befeachmet() {
    System.out.println("Before Each method");	
    }
    
    
    @Test
    void testAdd() {
        assertEquals(5, arithmetic.add(2, 3), "Addition should return the sum of two numbers");
    }
    
    @Test //test case
    void testMet() {
    	Arithmetic arith = new Arithmetic();
    	
    	//invoke business logic method with certain parameters
    	int actual_val=arith.add(-5,-3);
    	//cross check return value with expected value using assert
    	assertEquals(-8,actual_val,"Addition should work for negative values also");
    }
    
    @Test
    void testMax() {
        assertEquals(5, arithmetic.maxValue(5, 4), "Max should return the largest value");
    }
    
    @Test
    void testMax1() {
        assertEquals(4, arithmetic.maxValue(-5, 4), "Max should return the largest value");
    }

    @Test
    void testMaxNeg() {
        assertNotEquals(-5, arithmetic.maxValue(-5, 4), "Max should return the largest value");
    }
    @Test
    void testSubtract() {
        assertEquals(1, arithmetic.subtract(5, 4), "Subtraction should return the difference of two numbers");
    }

    @Test
    void testMultiply() {
        assertEquals(6, arithmetic.multiply(2, 3), "Multiplication should return the product of two numbers");
    }

    @Test
    void testDivide() {
        assertEquals(2, arithmetic.divide(6, 3), "Division should return the quotient of two numbers");
    }

    @Test
    void testDivideByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> arithmetic.divide(1, 0), "Division by zero should throw ArithmeticException");
        assertEquals("Cannot divide by zero", thrown.getMessage());
    }
}

