package com.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Investors")
public class Investor {
	@Id
	private int investor_id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private double investment;
	private Date AOD;
	public int getInvestor_id() {
		return investor_id;
	}
	public void setInvestor_id(int investor_id) {
		this.investor_id = investor_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getInvestment() {
		return investment;
	}
	public void setInvestment(double investment) {
		this.investment = investment;
	}
	public Date getAOD() {
		return AOD;
	}
	public void setAOD(Date aOD) {
		AOD = aOD;
	}
	@Override
	public String toString() {
		return "Investor [investor_id=" + investor_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phone=" + phone + ", investment=" + investment + ", AOD=" + AOD + "]";
	} 
}
