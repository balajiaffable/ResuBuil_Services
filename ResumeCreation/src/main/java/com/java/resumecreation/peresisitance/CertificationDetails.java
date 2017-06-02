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
@Table(name="T_Certification_Details")
@JsonIgnoreProperties(ignoreUnknown=false)
@Proxy(lazy=false)

public class CertificationDetails implements Serializable{
	
	private static final long serialVersionUID = 3810763311916039338L;
	
	int certificationId;
	String certificationName;
	String certificationDescription;
	Date validityEndDt;
	
	Date updateDt; 
	Date createDt; 
	Date updateTime;
	Date createTime;
	String createUserId; 
	String updateUserId;
	String deleteSwInd;
	int loginID   ;
	
	

	
	@Id
	@Column(name="CERTIFICATION_ID")
	@GeneratedValue
	public int getCertificationId() {
		return certificationId;
	}

	public void setCertificationId(int certificationId) {
		this.certificationId = certificationId;
	}
	
	@Column(name="CERTIFICATION_NAME")
	public String getCertificationName() {
		return certificationName;
	}

	public void setCertificationName(String certificationName) {
		this.certificationName = certificationName;
	}
	
	@Column(name="CERTIFICATION_DESCRIPTION")
	public String getCertificationDescription() {
		return certificationDescription;
	}

	public void setCertificationDescription(String certificationDescription) {
		this.certificationDescription = certificationDescription;
	}

	@Column(name="VALIDITY_END_DT")
	public Date getValidityEndDt() {
		return validityEndDt;
	}

	public void setValidityEndDt(Date validityEndDt) {
		this.validityEndDt = validityEndDt;
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
