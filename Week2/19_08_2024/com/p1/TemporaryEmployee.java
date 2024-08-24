package com.p1;

import com.InheritancePractice.Employee;

public class TemporaryEmployee extends Employee{
	private float hourlypay;
	private String company_addr;
	public TemporaryEmployee(int eid,String ename,float hourlypay,String company_addr){
		super(eid,ename);
		this.hourlypay=hourlypay;
		this.company_addr=this.company_addr;
	}
	public void displayp() {
		displaye();
		System.out.println("Hourlypay : "+hourlypay+" Companyadd : "+company_addr);
	}

}
