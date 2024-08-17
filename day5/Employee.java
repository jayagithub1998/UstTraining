package com.Inheritance;

public class Employee {
	private int eid;
	private String name;
	
	Employee(){
		
	}

	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void displaye() {
		System.out.println("Employee id "+eid+"Name "+name);
	}

}

class PermanentEmplyee extends Employee{
	private float salary;
	private String addr;
	
	public PermanentEmplyee(float salary, String addr) {
		super();
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
	
	public void displaye() {
		System.out.println("Employee salary "+salary+"Address "+addr);
	}
	
	
}
