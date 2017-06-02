package com.java.resumecreation.DTO;

import java.util.Date;

public class EducationExperienceDTO {
	
	
	String universityName;
	String degree;
	String major;
	Date startDate;
	Date endDate;
	
	
	public EducationExperienceDTO(){
		
	}
	
	
	public EducationExperienceDTO(String universityName,String degree,String major,Date startDate,Date endDate){
		
	this.universityName = universityName;
	this.degree = degree;
	this.major =major;
	this.startDate = startDate;
	this.endDate = endDate;
	}


	public String getUniversityName() {
		return universityName;
	}


	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
			
		
	
}
