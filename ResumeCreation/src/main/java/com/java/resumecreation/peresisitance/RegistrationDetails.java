package com.java.resumecreation.peresisitance;


import java.io.Serializable;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Proxy;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="T_Registration_Details")
@JsonIgnoreProperties(ignoreUnknown=false)
@Proxy(lazy=false)
public class RegistrationDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3810763311916039338L;

	

		
		int loginID;
		String password; 
		String emailID; 
		String firstName; 
		String lastName; 
		String jobTitle;
		String addressLine1; 
		String addressLine2;
		String Florida; 
		String Country;
		String mobileNumber;
		String postalCode; 
		Date update_dt; 
		Date create_dt; 
		Date update_time;
		Date create_time;
		String create_user_id; 
		String update_user_id;
		
		@Id
		@Column(name="LoginID")
		@GeneratedValue
		public int getLoginID() {
			return loginID;
		}
		public void setLoginID(int loginID) {
			this.loginID = loginID;
		}
		@Column(name="password")
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Column(name="emailID")
		public String getEmailID() {
			return emailID;
		}
		public void setEmailID(String emailID) {
			this.emailID = emailID;
		}
		@Column(name="firstName")
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		@Column(name="lastName")
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		@Column(name="jobTitle")
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		@Column(name="addressLine1")
		public String getAddressLine1() {
			return addressLine1;
		}
		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}
		@Column(name="addressLine2")
		public String getAddressLine2() {
			return addressLine2;
		}
		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}
		@Column(name="State")
		public String getFlorida() {
			return Florida;
		}
		public void setFlorida(String florida) {
			Florida = florida;
		}
		@Column(name="Country")
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
		@Column(name="Mobile_number")
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		@Column(name="Postal_Code")
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		@Column(name="update_dt")
		public Date getUpdate_dt() {
			return update_dt;
		}
		public void setUpdate_dt(Date update_dt) {
			this.update_dt = update_dt;
		}
		@Column(name="create_date")
		public Date getCreate_dt() {
			return create_dt;
		}
		public void setCreate_dt(Date create_dt) {
			this.create_dt = create_dt;
		}
		@Column(name="update_time")
		public Date getUpdate_time() {
			return update_time;
		}
		public void setUpdate_time(Date update_time) {
			this.update_time = update_time;
		}
		@Column(name="create_time")
		public Date getCreate_time() {
			return create_time;
		}
		public void setCreate_time(Date create_time) {
			this.create_time = create_time;
		}
		@Column(name="create_user_id")
		public String getCreate_user_id() {
			return create_user_id;
		}
		public void setCreate_user_id(String create_user_id) {
			this.create_user_id = create_user_id;
		}
		@Column(name="update_user_id")
		public String getUpdate_user_id() {
			return update_user_id;
		}
		public void setUpdate_user_id(String update_user_id) {
			this.update_user_id = update_user_id;
		}
		
}