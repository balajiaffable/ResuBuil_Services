package com.java.resumecreation.peresisitance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="T_Reference")
@JsonIgnoreProperties(ignoreUnknown=false)
@Proxy(lazy=false)
public class ReferencePerson {
	
	
	private static final long serialVersionUID = 3810763311916039338L;
	
	int referencePersonID;
	String refName;
	String companyName;
	String designation;
	String refEmail;
	String yearsKnown;
	String phoneNumber;
	
	
	Date updateDt; 
	Date createDt; 
	Date updateTime;
	Date createTime;
	String createUserId; 
	String updateUserId;
	String deleteSwInd;
	int   loginID   ;
	
	
	@Id
	@Column(name="REFERENCE_PERSON_ID")
	@GeneratedValue
	public int getReferencePersonID() {
		return referencePersonID;
	}
	public void setReferencePersonID(int referencePersonID) {
		this.referencePersonID = referencePersonID;
	}
	
	@Column(name="REFERENCE_NAME")
	public String getRefName() {
		return refName;
	}
	public void setRefName(String refName) {
		this.refName = refName;
	}

	@Column(name="COMPANY_NAME")
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name="DESIGNATION")
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Column(name="REFERENCE_EMAIL")
	public String getRefEmail() {
		return refEmail;
	}
	public void setRefEmail(String refEmail) {
		this.refEmail = refEmail;
	}

	@Column(name="YEARS_KNOWN")
	public String getYearsKnown() {
		return yearsKnown;
	}
	public void setYearsKnown(String yearsKnown) {
		this.yearsKnown = yearsKnown;
	}

	@Column(name="REFERENCE_PHONE_NUMBER")
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Column(name="UPDATE_DT")
	public Date getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}
	@Column(name="CREATE_DT")
	public Date getCreateDt() {
		return createDt;
	}
	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	@Column(name="UPDATE_TIME")
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Column(name="CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Column(name="CREATE_USER_ID")
	public String getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	@Column(name="UPDATE_USER_ID")
	public String getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	@Column(name="DELETE_SW_IND")
	public String getDeleteSwInd() {
		return deleteSwInd;
	}
	public void setDeleteSwInd(String deleteSwInd) {
		this.deleteSwInd = deleteSwInd;
	}
	@Column(name="LOGIN_ID")
	public int getLoginID() {
		return loginID;
	}
	public void setLoginID(int loginID) {
		this.loginID = loginID;
	}
	
	
	
	

}
