package com.jpa.springsecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDtls {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	
	public String fullname;
	public String address;
	public String email;
	public String password;
	public String qualification;
	public String mobileNumber;
	public String role;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public UserDtls(int id, String fullname, String address, String email, String password, String qualification,
			String mobileNumber, String role) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.address = address;
		this.email = email;
		this.password = password;
		this.qualification = qualification;
		this.mobileNumber = mobileNumber;
		this.role = role;
	}


	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
