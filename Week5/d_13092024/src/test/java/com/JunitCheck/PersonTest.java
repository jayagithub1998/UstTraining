package com.JunitCheck;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
	private Person person;
	
	@BeforeEach
	void metbe() {
		person = new Person("name1",34,10000);
	}
	@Test
	void met() {
		//create person object
		//increment eligibility
		//assert 
		
		Person person_actual = person.addeligibility(10);
		assertEquals(11000,person_actual.getLoan_eligibility(),
				"checking Loan eligibility after incrementing 10 percent");
		Person person_expected = new Person("name1",34,11000);
		assertEquals(person_expected,person_actual,
				"Directly checking objects after incrementing salary");
		
	}

}
