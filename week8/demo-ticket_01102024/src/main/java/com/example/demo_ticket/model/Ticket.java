package com.example.demo_ticket.model;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@NotBlank(message ="Username cant be blank")
	@Column
	private String username;

	@Size(min=3,max=100)
	@Column
	private String fromplace;
	
	@Column
	private String toplace;
	
	@DecimalMin("99.9")
	@DecimalMax("10000")
	@Column
	private float price;
	
	@Min(1)
	@Max(10)
	private int num_of_seats;
	
	@NotNull
	@Email
	@Column
	private String email;
	
	//@Future(message="Date should be in future")
	@Past(message="Date should be in past")
	private Date TravelDate;

//	@Pattern(regexp="^[0-9]{6}$")
	@Pattern(regexp="^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$")
	private String pincode;
	
	
	public Ticket() {}



	public Ticket(int id, @NotBlank(message = "Username cant be blank") String username,
			@Size(min = 3, max = 100) String fromplace, String toplace,
			@DecimalMin("99.9") @DecimalMax("10000") float price, @Min(1) @Max(10) int num_of_seats,
			@NotNull @Email String email, @Past(message = "Date should be in past") Date travelDate,
			@Pattern(regexp = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$") String pincode) {
		super();
		this.id = id;
		this.username = username;
		this.fromplace = fromplace;
		this.toplace = toplace;
		this.price = price;
		this.num_of_seats = num_of_seats;
		this.email = email;
		TravelDate = travelDate;
		this.pincode = pincode;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getId() {
		return id;
	}

	public int getNum_of_seats() {
		return num_of_seats;
	}

	public void setNum_of_seats(int num_of_seats) {
		this.num_of_seats = num_of_seats;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getFromplace() {
		return fromplace;
	}

	public void setFromplace(String fromplace) {
		this.fromplace = fromplace;
	}

	public String getToplace() {
		return toplace;
	}

	public void setToplace(String toplace) {
		this.toplace = toplace;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getTravelDate() {
		return TravelDate;
	}

	public void setTravelDate(Date travelDate) {
		TravelDate = travelDate;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}



	@Override
	public String toString() {
		return "Ticket [id=" + id + ", username=" + username + ", fromplace=" + fromplace + ", toplace=" + toplace
				+ ", price=" + price + ", num_of_seats=" + num_of_seats + ", email=" + email + ", TravelDate="
				+ TravelDate + ", pincode=" + pincode + "]";
	}




}
