package com.java.resumecreation.DAO;

import java.util.List;

import com.java.resumecreation.DTO.CertificationDetailsDTO;
import com.java.resumecreation.DTO.EducationExperienceDTO;
import com.java.resumecreation.DTO.PersonalDetailsDTO;
import com.java.resumecreation.DTO.ProfessionalExperienceDTO;
import com.java.resumecreation.DTO.PublicationDTO;
import com.java.resumecreation.DTO.ReferenceDTO;
import com.java.resumecreation.DTO.SocialMediaReferenceDTO;


public interface CertificationDetailsInterfaceDAO {

	


	boolean saveCertPersonalDtlsDao(PersonalDetailsDTO personalDetailsDTO);


	boolean saveCertProfessionExperienceDao(List<ProfessionalExperienceDTO> professionalExperienceDTOs);


	boolean saveCertEducationalExperienceDao(List<EducationExperienceDTO> educationExperienceDTOs);


	boolean saveCertficationDao(List<CertificationDetailsDTO> certificationDetailsDTOs);


	boolean savePublicationDao(List<PublicationDTO> publicationDTOs);


	boolean saveReferenceDao(List<ReferenceDTO> referenceDTOs);


	boolean saveSocailMediaRefDao(List<SocialMediaReferenceDTO> socialMediaReferenceDTOs);
	

}
