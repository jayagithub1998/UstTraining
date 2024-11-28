package com.example.eCommerce_FinalProject;

public class CustomProperties {
	private String iexcelpath;
	private String oexcelpath;
	private String iwebexcelpath;
	private String owebexcelpath;

	private CustomProperties() {

	}

	public CustomProperties(String iexcelpath, String oexcelpath, String iwebexcelpath, String owebexcelpath) {
		super();
		this.iexcelpath = iexcelpath;
		this.oexcelpath = oexcelpath;
		this.iwebexcelpath = iwebexcelpath;
		this.owebexcelpath = owebexcelpath;
	}

	public String getIexcelpath() {
		return iexcelpath;
	}

	public String getOexcelpath() {
		return oexcelpath;
	}

	public String getIwebexcelpath() {
		return iwebexcelpath;
	}

	public String getOwebexcelpath() {
		return owebexcelpath;
	}

	public void setIexcelpath(String iexcelpath) {
		this.iexcelpath = iexcelpath;
	}

	public void setOexcelpath(String oexcelpath) {
		this.oexcelpath = oexcelpath;
	}

	public void setIwebexcelpath(String iwebexcelpath) {
		this.iwebexcelpath = iwebexcelpath;
	}

	public void setOwebexcelpath(String owebexcelpath) {
		this.owebexcelpath = owebexcelpath;
	}

	

}
