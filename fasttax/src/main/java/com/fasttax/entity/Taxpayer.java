package com.fasttax.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Taxpayer 
{
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private int ssn;			// or as String because of ' -- '  ???
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private String streetAddress;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	@Column
	private String filingStatus;
	@Column
	private int dependents =0;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userId;
	
	
	
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
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
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
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}	
	public String getFilingStatus() {
		return filingStatus;
	}
	public void setFilingStatus(String filingStatus) {
		this.filingStatus = filingStatus;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDependents() {
		return dependents;
	}
	public void setDependents(int dependents) {
		this.dependents = dependents;
	}
	@Override
	public String toString() {
		return "Taxpayer [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + ", email=" + email
				+ ", password=" + password + ", streetAddress=" + streetAddress + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", filingStatus=" + filingStatus + ", dependents=" + dependents + ", userId="
				+ userId + "]";
	}	
}
