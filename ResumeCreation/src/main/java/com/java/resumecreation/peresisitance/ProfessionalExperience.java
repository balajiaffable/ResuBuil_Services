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
@Table(name="T_Professional_Experienece")
@JsonIgnoreProperties(ignoreUnknown=false)
@Proxy(lazy=false)
public class ProfessionalExperience implements Serializable{

	
		
		private static final long serialVersionUID = 3810763311916039338L;

		int ProfessionalExperienceID;
		String companyName ;    
		String title ;    
		String 	projectDescription  ;
		String 	technicalEnvironmnet ;    
		Date updateDt; 
		Date createDt; 
		Date updateTime;
		Date createTime;
		String createUserId; 
		String updateUserId;
		String deleteSwInd;
		int   loginID   ;
		
		@Id
		@Column(name="PROFESSIONAL_EXPERIENCE_ID")
		@GeneratedValue
		public int getProfessionalExperienceID() {
			return ProfessionalExperienceID;
		}
		public void setProfessionalExperienceID(int professionalExperienceID) {
			ProfessionalExperienceID = professionalExperienceID;
		}
		@Column(name="COMPANY_NAME")
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		@Column(name="TITLE")
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		@Column(name="PROJECT_DESCRIPTION")
		public String getProjectDescription() {
			return projectDescription;
		}
		public void setProjectDescription(String projectDescription) {
			this.projectDescription = projectDescription;
		}
		@Column(name="TECHNICAL_ENVIRONMENT")
		public String getTechnicalEnvironmnet() {
			return technicalEnvironmnet;
		}
		public void setTechnicalEnvironmnet(String technicalEnvironmnet) {
			this.technicalEnvironmnet = technicalEnvironmnet;
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
