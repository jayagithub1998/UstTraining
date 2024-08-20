package com.p2;

import com.InheritancePractice.Employee;
import com.p1.PermanentEmployee;
import com.p1.TemporaryEmployee;

public class MainProgram {
	public static void main(String[] args) {
		PermanentEmployee pobj= new PermanentEmployee(111,"name111",145.6f,"Addr111");
		System.out.println("Permanent Employee");
		pobj.displayp();
		
		TemporaryEmployee tobj= new TemporaryEmployee(111,"name111",145.6f,"Addr111");
		System.out.println("\nTemporary Employee");
		pobj.displayp();
		
		Employee eobj= new TemporaryEmployee(111,"name111",145.6f,"Addr111");
		System.out.println("\nTemporary Employee");
		pobj.displayp();
	}

}
