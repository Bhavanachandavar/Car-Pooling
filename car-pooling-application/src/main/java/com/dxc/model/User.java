package com.dxc.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class User implements Serializable {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer uId;
    private String password;
    private String fname;
    private String lname;
    private String email;
    private String phoneNo;
    @JsonFormat(pattern="YYYY-MM-DD")
    private Date dob;
   
    public User() {}

	public User(Integer uId, String password, String fname, String lname, String email, String phoneNo, Date dob) {
		super();
		this.uId = uId;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNo = phoneNo;
		this.dob = dob;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", password=" + password + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", phoneNo=" + phoneNo + ", dob=" + dob + "]";
	}

}