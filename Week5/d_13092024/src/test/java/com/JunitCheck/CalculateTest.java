package com.JunitCheck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

//add dependency junit-jupiter-params in pom.xml file
public class CalculateTest {
	Calculate calculate;
	
	@BeforeEach
	void met() {
		calculate = new Calculate();
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,1,2",
		"2,3,5",
		"4,5,9",
		"10,20,30",
		"0,0,0"
	})
	void testAddition(int a,int b,int expectedSum) {
		int actualSum=calculate.add(a, b);
		assertEquals (expectedSum,actualSum,"The sum of "+a+" and "+b+" s="+expectedSum);
	}
}
