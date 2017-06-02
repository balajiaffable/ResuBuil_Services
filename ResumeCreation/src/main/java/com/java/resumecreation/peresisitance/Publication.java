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
@Table(name="T_Publication")
@JsonIgnoreProperties(ignoreUnknown=false)
@Proxy(lazy=false)
public class Publication implements Serializable{
	
	private static final long serialVersionUID = 3810763311916039338L;
	
	int publicationID;
	String publicationDescription;
	String paperDetails;
	
	
	Date updateDt; 
	Date createDt; 
	Date updateTime;
	Date createTime;
	String createUserId; 
	String updateUserId;
	String deleteSwInd;
	int   loginID   ;
	
	
	@Id
	@Column(name="PUBLICATION_ID")
	@GeneratedValue
	public int getPublicationID() {
		return publicationID;
	}
	public void setPublicationID(int publicationID) {
		this.publicationID = publicationID;
	}
	
	@Column(name="PUBLICATION_DESCRIPTION", columnDefinition = "VARCHAR(1337)")
	public String getPublicationDescription() {
		return publicationDescription;
	}
	public void setPublicationDescription(String publicationDescription) {
		this.publicationDescription = publicationDescription;
	}
	
	
	@Column(name="PAPER_DETAILS",columnDefinition = "VARCHAR(1337)")
	public String getPaperDetails() {
		return paperDetails;
	}
	public void setPaperDetails(String paperDetails) {
		this.paperDetails = paperDetails;
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
