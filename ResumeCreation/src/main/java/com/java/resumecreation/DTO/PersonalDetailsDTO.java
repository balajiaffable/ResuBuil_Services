package com.java.resumecreation.DTO;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonalDetailsDTO {
	
	@JsonProperty(value="FirstName")

	String firstName ;  
	
	@JsonProperty(value="LastName")
	String lastName ;    
	
	@JsonProperty(value="MiddleName")
	String 	middleName  ;
	
	@JsonProperty(value="Email")
	String 	email ;    
	
	@JsonProperty(value="PhoneNumber")
	int	phoneNumber ;   
	
	
	   
	int telephoneNumber;      
	String 	address ;    
	Date updateDt; 
	Date createDt; 
	
	Date updateTime;
	Date createTime;
	String createUserID; 
	String updateUserId;
	String deleteSwInd;
	int   loginID   ;
	int ProfileID   ;
	
	private List<ProfessionalExperienceDTO> professionalExperienceLst;
	
	
	
	
	public List<ProfessionalExperienceDTO> getProfessionalExperienceLst() {
		return professionalExperienceLst;
	}
	public void setProfessionalExperienceLst(List<ProfessionalExperienceDTO> professionalExperienceLst) {
		this.professionalExperienceLst = professionalExperienceLst;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateUserID() {
		return createUserID;
	}
	public void setCreateUserID(String createUserID) {
		this.createUserID = createUserID;
	}
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	public String getDeleteSwInd() {
		return deleteSwInd;
	}
	public void setDeleteSwInd(String deleteSwInd) {
		this.deleteSwInd = deleteSwInd;
	}
	public int getLoginID() {
		return loginID;
	}
	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}
	public int getProfileID() {
		return ProfileID;
	}
	public void setProfileID(int profileID) {
		ProfileID = profileID;
	}
	
	
	
	
	
	
	
	
	

}
