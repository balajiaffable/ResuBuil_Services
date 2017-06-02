package com.java.resumecreation.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import com.java.resumecreation.DAO.CertificationDetailsInterfaceDAO;
import com.java.resumecreation.DTO.CertificationDetailsDTO;
import com.java.resumecreation.DTO.EducationExperienceDTO;
import com.java.resumecreation.DTO.PersonalDetailsDTO;
import com.java.resumecreation.DTO.ProfessionalExperienceDTO;
import com.java.resumecreation.DTO.PublicationDTO;
import com.java.resumecreation.DTO.ReferenceDTO;
import com.java.resumecreation.DTO.SocialMediaReferenceDTO;

public class CertificationDetailsServiceImpl implements CertificationDetailsInterfaceService {

	private CertificationDetailsInterfaceDAO certificationDetailseDaoImpl;
	
	
	


	public CertificationDetailsInterfaceDAO getCertificationDetailseDaoImpl() {
		return certificationDetailseDaoImpl;
	}





	public void setCertificationDetailseDaoImpl(CertificationDetailsInterfaceDAO certificationDetailseDaoImpl) {
		this.certificationDetailseDaoImpl = certificationDetailseDaoImpl;
	}






	
	
	@Transactional
	public boolean saveCertPersonalDtls(
			PersonalDetailsDTO personalDetailsDTO) {
		
			
		// TODO Auto-generated method stub
		return certificationDetailseDaoImpl.saveCertPersonalDtlsDao(personalDetailsDTO);
	}





	@Transactional
	public boolean saveCertProfessionExperience(List<ProfessionalExperienceDTO> professionalExperienceDTOs) {
		// TODO Auto-generated method stub
		return certificationDetailseDaoImpl.saveCertProfessionExperienceDao(professionalExperienceDTOs);
	}





	@Transactional
	public boolean saveCertEducationalExperience(List<EducationExperienceDTO> educationExperienceDTOs) {
		// TODO Auto-generated method stub
		return certificationDetailseDaoImpl.saveCertEducationalExperienceDao(educationExperienceDTOs);
		
	}





	@Transactional
	public boolean saveCertfication(List<CertificationDetailsDTO> certificationDetailsDTOs) {
		// TODO Auto-generated method stub
		return certificationDetailseDaoImpl.saveCertficationDao(certificationDetailsDTOs);
		
	}





	@Transactional
	public boolean savePublication(List<PublicationDTO> publicationDTOs) {
		// TODO Auto-generated method stub
		return certificationDetailseDaoImpl.savePublicationDao(publicationDTOs);
	}





	@Transactional
	public boolean saveReference(List<ReferenceDTO> referenceDTOs) {
		// TODO Auto-generated method stub
		return certificationDetailseDaoImpl.saveReferenceDao(referenceDTOs);
	}





	@Transactional
	public boolean saveSocailMediaRef(List<SocialMediaReferenceDTO> socialMediaReferenceDTOs) {
		// TODO Auto-generated method stub
		return certificationDetailseDaoImpl.saveSocailMediaRefDao(socialMediaReferenceDTOs);
	}
	
	
	





	
	

}
