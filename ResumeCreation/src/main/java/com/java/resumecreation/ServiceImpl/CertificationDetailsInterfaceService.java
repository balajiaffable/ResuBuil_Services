package com.java.resumecreation.ServiceImpl;

import java.util.List;

import com.java.resumecreation.DTO.CertificationDetailsDTO;
import com.java.resumecreation.DTO.EducationExperienceDTO;
import com.java.resumecreation.DTO.PersonalDetailsDTO;
import com.java.resumecreation.DTO.ProfessionalExperienceDTO;
import com.java.resumecreation.DTO.PublicationDTO;
import com.java.resumecreation.DTO.ReferenceDTO;
import com.java.resumecreation.DTO.SocialMediaReferenceDTO;

public interface CertificationDetailsInterfaceService  {

	

	boolean saveCertPersonalDtls(PersonalDetailsDTO personalDetailsDTO);

	boolean saveCertProfessionExperience(List<ProfessionalExperienceDTO> professionalExperienceDTOs);

	boolean saveCertEducationalExperience(List<EducationExperienceDTO> educationExperienceDTOs);

	boolean saveCertfication(List<CertificationDetailsDTO> certificationDetailsDTOs);

	boolean savePublication(List<PublicationDTO> publicationDTOs);

	boolean saveReference(List<ReferenceDTO> referenceDTOs);

	boolean saveSocailMediaRef(List<SocialMediaReferenceDTO> socialMediaReferenceDTOs);
	
}
