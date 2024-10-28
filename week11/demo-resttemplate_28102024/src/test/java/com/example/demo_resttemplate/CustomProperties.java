package com.example.demo_resttemplate;

public class CustomProperties {
	private String iexcelpath;
	private String oexcelpath;

	private CustomProperties() {

	}

	public CustomProperties(String iexcelpath,String oexcelpath) {
		super();
		this.iexcelpath = iexcelpath;
		this.oexcelpath=oexcelpath;
	}

	public String getIexcelpath() {
		return iexcelpath;
	}

	public void setIexcelpath(String iexcelpath) {
		this.iexcelpath = iexcelpath;
	}

	
	public void setOexcelpath(String oexcelpath) {
		this.oexcelpath = oexcelpath;
	}
	
	public String getOexcelpath() {
		return oexcelpath;
	}

}
