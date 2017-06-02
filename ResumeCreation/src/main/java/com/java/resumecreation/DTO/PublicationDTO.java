package com.java.resumecreation.DTO;

public class PublicationDTO {
	
	String publicationDescription;
	String paperDetails;
	
	
	
	public PublicationDTO(){}
	
	public PublicationDTO(String publicationDescription,String paperDetails){
		this.publicationDescription = publicationDescription;
		this.paperDetails = paperDetails;
		
		
	}
	
	
	
	
	public String getPublicationDescription() {
		return publicationDescription;
	}
	public void setPublicationDescription(String publicationDescription) {
		this.publicationDescription = publicationDescription;
	}
	public String getPaperDetails() {
		return paperDetails;
	}
	public void setPaperDetails(String paperDetails) {
		this.paperDetails = paperDetails;
	}
	
	
	

}
