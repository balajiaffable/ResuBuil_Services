package com.java.resumecreation.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.resumecreation.DTO.CertificationDetailsDTO;
import com.java.resumecreation.DTO.EducationExperienceDTO;
import com.java.resumecreation.DTO.PersonalDetailsDTO;
import com.java.resumecreation.DTO.ProfessionalExperienceDTO;
import com.java.resumecreation.DTO.PublicationDTO;
import com.java.resumecreation.DTO.ReferenceDTO;
import com.java.resumecreation.DTO.SocialMediaReferenceDTO;
import com.java.resumecreation.peresisitance.CertificationDetails;
import com.java.resumecreation.peresisitance.EducationExperience;
import com.java.resumecreation.peresisitance.PersonalDetails;
import com.java.resumecreation.peresisitance.ProfessionalExperience;
import com.java.resumecreation.peresisitance.Publication;
import com.java.resumecreation.peresisitance.ReferencePerson;
import com.java.resumecreation.peresisitance.SocialMediaReference;

public class CertificationDetailsDaoImpl implements CertificationDetailsInterfaceDAO{

	
	protected SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	

@Override
public boolean saveCertPersonalDtlsDao(PersonalDetailsDTO personalDetailsDTO) {
	// TODO Auto-generated method stub
	
	PersonalDetails personalDtls = new PersonalDetails();
	Session session = sessionFactory.getCurrentSession();
	if(null != personalDetailsDTO.getFirstName()){
	personalDtls.setFirstName(personalDetailsDTO.getFirstName());
	}
	if(null != personalDetailsDTO.getMiddleName()){
	personalDtls.setMiddleName(personalDetailsDTO.getMiddleName());
	}
	if(null != personalDetailsDTO.getLastName()){
	personalDtls.setLastName(personalDetailsDTO.getLastName());
	}
	if(null != personalDetailsDTO.getEmail()){
	personalDtls.setEmailId(personalDetailsDTO.getEmail());
	}
	if(personalDetailsDTO.getPhoneNumber()!= 0){
	personalDtls.setPhoneNumber(personalDetailsDTO.getPhoneNumber());
	}
	session.saveOrUpdate(personalDtls);
	
	
	
	
	return true;
}

@Override
public boolean saveCertProfessionExperienceDao(List<ProfessionalExperienceDTO> professionalExperienceDTOs) {
	// TODO Auto-generated method stub
	
	
	Session session = sessionFactory.getCurrentSession();
	if(professionalExperienceDTOs.size()>0){
	for (ProfessionalExperienceDTO proExperience : professionalExperienceDTOs) {
		ProfessionalExperience professionalExperience = new ProfessionalExperience();
		
		if(null != proExperience.getCompanyName()){
			professionalExperience.setCompanyName(proExperience.getCompanyName());
		}
		if(null != proExperience.getProjectDescription()){
			professionalExperience.setProjectDescription(proExperience.getProjectDescription());
		}
		if(null != proExperience.getTechnicalEnvironmnet()){
			professionalExperience.setTechnicalEnvironmnet(proExperience.getTechnicalEnvironmnet());
		}
		if(null != proExperience.getTitle()){
			professionalExperience.setTitle(proExperience.getTitle());
		}
		//if(null != proExperience.get)
		
		session.saveOrUpdate(professionalExperience);
		
		//session.saveOrUpdate(proExperience);
		
	}
	return true;
	}
	return false;
}

@Override
public boolean saveCertEducationalExperienceDao(List<EducationExperienceDTO> educationExperienceDTOs) {
	// TODO Auto-generated method stub
	Session session = sessionFactory.getCurrentSession();
	
	if(educationExperienceDTOs.size()>0){
		for (EducationExperienceDTO educExperience : educationExperienceDTOs) {
			
			EducationExperience educationExperience = new EducationExperience();
			
			if(null != educExperience.getUniversityName()){
				educationExperience.setUniversityName(educExperience.getUniversityName());
			}
			if(null != educExperience.getDegree()){
				educationExperience.setDegree(educExperience.getDegree());
			}
			if(null != educExperience.getMajor()){
				educationExperience.setMajor(educExperience.getMajor());
			}
			if(null != educExperience.getStartDate()){
				educationExperience.setPeriodFrom(educExperience.getStartDate());
			}
			if(null != educExperience.getEndDate()){
				educationExperience.setPeriodTo(educExperience.getEndDate());
			}
			session.saveOrUpdate(educationExperience);
		}
		return true;
	}
	
	
	return false;
}

@Override
public boolean saveCertficationDao(List<CertificationDetailsDTO> certificationDetailsDTOs) {
	// TODO Auto-generated method stub
	
	Session session = sessionFactory.getCurrentSession();
	
	if(certificationDetailsDTOs.size()>0){
		
		for  (CertificationDetailsDTO certDetails : certificationDetailsDTOs) {
		
			CertificationDetails certificationDetails = new CertificationDetails();
			
			if(null != certDetails.getCertificationDescription()){
				certificationDetails.setCertificationName(certDetails.getCertificationName());
			}
			if(null != certDetails.getCertificationDescription()){
				certificationDetails.setCertificationDescription(certDetails.getCertificationDescription());
			}
			if(null != certDetails.getValidEndDate()){
				certificationDetails.setValidityEndDt(certDetails.getValidEndDate());
			}
			
			session.saveOrUpdate(certificationDetails);
			
		}
		return true;
	}
	
	return false;
}

@Override
public boolean savePublicationDao(List<PublicationDTO> publicationDTOs) {
	// TODO Auto-generated method stub
	
	Session session = sessionFactory.getCurrentSession();
	if(publicationDTOs.size()>0){
		for  (PublicationDTO publication : publicationDTOs) {
			
			Publication publi = new Publication();
			if(null != publication.getPublicationDescription()){
				
				publi.setPublicationDescription(publication.getPublicationDescription());
				
			}
			if(null != publication.getPaperDetails()){
				publi.setPaperDetails(publication.getPaperDetails());
			}
			
			session.saveOrUpdate(publi);
		}
		
		return true;
		
	}
		
	
	
	return false;
}

@Override
public boolean saveReferenceDao(List<ReferenceDTO> referenceDTOs) {
	// TODO Auto-generated method stub
	Session session = sessionFactory.getCurrentSession();
	if(referenceDTOs.size()>0){
		for  (ReferenceDTO reference : referenceDTOs) {
			
			ReferencePerson referencePerson = new ReferencePerson();
			
			if(null != reference.getCompanyName()){
				referencePerson.setCompanyName(reference.getCompanyName());
				
			}
			if (null != reference.getDesignation()){
				referencePerson.setDesignation(reference.getDesignation());
			}
			
			if(null !=reference.getPhoneNumber()){
				referencePerson.setPhoneNumber(reference.getPhoneNumber());
			}
			
			if(null != reference.getRefEmail()){
				referencePerson.setRefEmail(reference.getRefEmail());
			}
			
			if(null != reference.getRefName()){
				referencePerson.setRefName(reference.getRefName());
			}
			
			if(null != reference.getYearsKnown()){
				referencePerson.setYearsKnown(reference.getYearsKnown());
			}
			session.saveOrUpdate(referencePerson);
		}
		
		return true;
		}
		
	
		
	
	return false;
}

@Override
public boolean saveSocailMediaRefDao(List<SocialMediaReferenceDTO> socialMediaReferenceDTOs) {
	// TODO Auto-generated method stub
	
	Session session = sessionFactory.getCurrentSession();
	if(socialMediaReferenceDTOs.size()>0){
		for  (SocialMediaReferenceDTO socialMediaRef : socialMediaReferenceDTOs) {
			SocialMediaReference socialMediaReference = new SocialMediaReference();
			
			if(null != socialMediaRef.getSocialName()){
				socialMediaReference.setSocialName(socialMediaRef.getSocialName());
			}
			
			if(null != socialMediaRef.getSocialLink()){
				socialMediaReference.setSocialLink(socialMediaRef.getSocialLink());
			}
			
			session.saveOrUpdate(socialMediaReference);
		}
		
		return true;
	
}
	return false;
}










}
