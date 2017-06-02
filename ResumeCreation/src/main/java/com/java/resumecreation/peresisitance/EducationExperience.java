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
@Table(name="T_Educational_Details")
@JsonIgnoreProperties(ignoreUnknown=false)
@Proxy(lazy=false)

public class EducationExperience implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3810763311916039338L;
	int educationExperienceID;
	
	String  universityName;
	String degree;
	String  major;
	Date periodFrom;
	Date periodTo;
	int  gpa;
	String city;
	String state;
	String country;
	int educationID;
	Date updateDt; 
	Date createDt; 
	Date updateTime;
	Date createTime;
	String createUserId; 
	String updateUserId;
	String deleteSwInd;
	int   loginID   ;
	
	@Id
	@Column(name="EDUCATIONAL_EXPERIENCE_ID")
	@GeneratedValue
	public int getEducationExperienceID() {
		return educationExperienceID;
	}
	public void setEducationExperienceID(int educationExperienceID) {
		this.educationExperienceID = educationExperienceID;
	}
	
	@Column(name="UNIVERSITY_NAME")
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	
	@Column(name="DEGREE")
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Column(name="MAJOR")
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Column(name="PERIOD_FROM")
	public Date getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(Date periodFrom) {
		this.periodFrom = periodFrom;
	}
	@Column(name="PERIOD_TO")
	public Date getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(Date periodTo) {
		this.periodTo = periodTo;
	}
	@Column(name="GPA")
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	@Column(name="CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="STATE")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(name="COUNTRY")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Column(name="EDUCATION_ID")
	public int getEducationID() {
		return educationID;
	}
	public void setEducationID(int educationID) {
		this.educationID = educationID;
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
