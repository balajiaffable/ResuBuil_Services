package com.java.resumecreation.DTO;

import java.lang.reflect.Constructor;

public class ProfessionalExperienceDTO {
	
	
	String companyName;
	
	String title;
	
	String 	projectDescription;
	
	String technicalEnvironmnet;
	
	
	public ProfessionalExperienceDTO(){
		
	}
	public ProfessionalExperienceDTO(String companyName,String title,String projectDescription,String technicalEnvironmnet){
		this.companyName=companyName;
		this.title=title;
		this.projectDescription=projectDescription;
		this.technicalEnvironmnet=technicalEnvironmnet;
	}
	
	

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public String getTechnicalEnvironmnet() {
		return technicalEnvironmnet;
	}

	public void setTechnicalEnvironmnet(String technicalEnvironmnet) {
		this.technicalEnvironmnet = technicalEnvironmnet;
	}
	
	
	
	

}
