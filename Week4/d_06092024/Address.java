package com.egjson;

public class Address {
	private String Street;
	private String city;
	private long zipcode;
	public Address() {
		
	}
	public Address(String street, String city, long zipcode) {
		super();
		Street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", zipcode=" + zipcode + "]";
	}
	

}
