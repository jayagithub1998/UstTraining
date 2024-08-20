package com.p1;

import com.InheritancePractice.Employee;

public class PermanentEmployee extends Employee{
	private float salary;
	private String addr;
	public PermanentEmployee(float salary, String addr) {
		super(); //this will call base class default constructor
		this.salary = salary;
		this.addr = addr;
	}
	public PermanentEmployee(int Eid,String name,float salary, String addr) {
		super(Eid,name); 
		this.salary = salary;
		this.addr = addr;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void displayp() {
		displaye();
		System.out.println("Salary : "+salary+" Address : "+addr);
	}
}

