package com.java.resumecreation.DTO;

import java.util.Date;

public class CertificationDetailsDTO {

	String certificationName;
	String certificationDescription;
	Date validEndDate;
	
	
	public CertificationDetailsDTO(){
		
	}
	
	public CertificationDetailsDTO(String certificationName,String certificationDescription,Date validEndDate){
		this.certificationName = certificationName;
		this.certificationDescription=certificationDescription;
		this.validEndDate=validEndDate;
	}
	
	
	
	public String getCertificationName() {
		return certificationName;
	}
	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	
	public String getCertificationDescription() {
		return certificationDescription;
	}
	public void setCertificationDescription(String certificationDescription) {
		this.certificationDescription = certificationDescription;
	}
	public Date getValidEndDate() {
		return validEndDate;
	}
	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}
	

	
	
}
