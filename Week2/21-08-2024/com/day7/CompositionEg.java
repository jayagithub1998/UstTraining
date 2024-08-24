package com.day7;

import java.util.Arrays;

class Department {
	private int id;
	private String deptname;
	private String hod_name;
	public Department(int id,String deptname,String hod_name) {
		this.id=id;
		this.deptname=deptname;
		this.hod_name=hod_name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getHod_name() {
		return hod_name;
	}
	public void setHod_name(String hod_name) {
		this.hod_name = hod_name;
	}
	@Override
	public String toString() {
		return "Department Name ["+id+","+deptname+","+hod_name+"]";
 }	
	
}

class University{
	String name;
	String address;
	Department dept[];
	public University(String name, String address, Department[] dept) {
		super();
		this.name = name;
		this.address = address;
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Department[] getDept() {
		return dept;
	}
	public void setDept(Department[] dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {

		for(Department e: dept){
			System.out.println(e.toString());
		}
		return "University Name ="+name+"\nAddress ="+address+"\n";
		
 }	

}

public class CompositionEg {
	public static void main(String[] args) {
		Department[] d1 = new Department[2];
		d1[0]=new Department(1,"CS","Jaya");
		d1[1]=new Department(1,"CS","Sree");
		
		University u1 = new University("xxxxx","yyyyyy",d1);
		
		System.out.println(u1.toString());

	}
	
}
