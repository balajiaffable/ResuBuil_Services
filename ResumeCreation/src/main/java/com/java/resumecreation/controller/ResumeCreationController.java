package com.java.resumecreation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.resumecreation.DTO.CertificationDetailsDTO;
import com.java.resumecreation.DTO.EducationExperienceDTO;
import com.java.resumecreation.DTO.PersonalDetailsDTO;
import com.java.resumecreation.DTO.ProfessionalExperienceDTO;
import com.java.resumecreation.DTO.PublicationDTO;
import com.java.resumecreation.DTO.ReferenceDTO;
import com.java.resumecreation.DTO.SocialMediaReferenceDTO;
import com.java.resumecreation.ServiceImpl.CertificationDetailsInterfaceService;
import com.java.resumecreation.pojo.PersonDetails;

@RestController
public class ResumeCreationController {
	@Autowired
	private CertificationDetailsInterfaceService certificationDetailsServiceImpl;

	@RequestMapping(value = "/Details", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<PersonDetails> getDetails() {

		List<PersonDetails> personalDtlsLst = new ArrayList<PersonDetails>();
		personalDtlsLst = createStaticJson();

		return personalDtlsLst;

	}

	private List<PersonDetails> createStaticJson() {
		// TODO Auto-generated method stub

		PersonDetails person1 = new PersonDetails(1, "Balaji", "Venkatachalapathi", "", "balaji@gmail.com",
				"123456789");
		PersonDetails person2 = new PersonDetails(2, "Prabhu", "Venkatachalapathi", "", "prabhu@gmail.com",
				"658974123");
		PersonDetails person3 = new PersonDetails(3, "Deepika", "PS", "", "deepika@gmail.com", "987456321");

		List<PersonDetails> detailsLst = new ArrayList<PersonDetails>();
		detailsLst.add(person1);
		detailsLst.add(person2);
		detailsLst.add(person3);

		return detailsLst;
	}

	@RequestMapping(value = "/personDtlsSave", method = RequestMethod.POST, headers = "Accept=application/json")
	public boolean personDtlsSave(@RequestBody PersonalDetailsDTO personalDetailsDTO) {
		try {
			return certificationDetailsServiceImpl.saveCertPersonalDtls(personalDetailsDTO);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	@RequestMapping(value = "/resProfessionalExperience", method = RequestMethod.POST, headers = "Accept=application/json")
	public boolean resProfessionalExperience(@RequestBody List<ProfessionalExperienceDTO> professionalExperienceDTOs) {
		try {

			System.out.println(professionalExperienceDTOs.size());
			for (ProfessionalExperienceDTO professionalExperienceDTO : professionalExperienceDTOs) {

				System.out.println(professionalExperienceDTO.getCompanyName());

				System.out.println(professionalExperienceDTO.getProjectDescription());

				System.out.println(professionalExperienceDTO.getTechnicalEnvironmnet());

				System.out.println(professionalExperienceDTO.getTitle());

				certificationDetailsServiceImpl.saveCertProfessionExperience(professionalExperienceDTOs);
				return true;

			}
			// return
			// certificationDetailsServiceImpl.saveCertPersonalDtls(personalDetailsDTO);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	@RequestMapping(value = "/resEducationalExperience", method = RequestMethod.POST, headers = "Accept=application/json")
	public boolean resEducationalExperience(@RequestBody List<EducationExperienceDTO> educationExperienceDTOs) {
		try {

			System.out.println(educationExperienceDTOs.size());
			for (EducationExperienceDTO educationExperienceDTO : educationExperienceDTOs) {

				System.out.println(educationExperienceDTO.getDegree());

				System.out.println(educationExperienceDTO.getMajor());

				System.out.println(educationExperienceDTO.getUniversityName());

				System.out.println(educationExperienceDTO.getEndDate());

				System.out.println(educationExperienceDTO.getStartDate());

				certificationDetailsServiceImpl.saveCertEducationalExperience(educationExperienceDTOs);
				return true;

			}
			// return
			// certificationDetailsServiceImpl.saveCertPersonalDtls(personalDetailsDTO);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

	@RequestMapping(value = "/resCertification", method = RequestMethod.POST, headers = "Accept=application/json")
	public boolean resCertification(@RequestBody List<CertificationDetailsDTO> certificationDetailsDTOs) {
		try {

			System.out.println(certificationDetailsDTOs.size());
			for (CertificationDetailsDTO certificationDetailsDTO : certificationDetailsDTOs) {

				System.out.println(certificationDetailsDTO.getCertificationName());

				System.out.println(certificationDetailsDTO.getCertificationDescription());

				System.out.println(certificationDetailsDTO.getValidEndDate());

				certificationDetailsServiceImpl.saveCertfication(certificationDetailsDTOs);
				return true;

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
	
	
	@RequestMapping(value = "/resPublication", method = RequestMethod.POST, headers = "Accept=application/json")
	public boolean resPublication(@RequestBody List<PublicationDTO> publicationDTOs) {
		try {

			System.out.println(publicationDTOs.size());
			for (PublicationDTO publicationDTO : publicationDTOs) {

				System.out.println(publicationDTO.getPublicationDescription());

				System.out.println(publicationDTO.getPaperDetails());

				

				certificationDetailsServiceImpl.savePublication(publicationDTOs);
				return true;

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
	
	@RequestMapping(value = "/resReference", method = RequestMethod.POST, headers = "Accept=application/json")
	public boolean resReference(@RequestBody List<ReferenceDTO> referenceDTOs) {
		try {

			System.out.println(referenceDTOs.size());
			for (ReferenceDTO referenceDTO : referenceDTOs) {

				System.out.println(referenceDTO.getCompanyName());

				System.out.println(referenceDTO.getDesignation());
				
				System.out.println(referenceDTO.getPhoneNumber());

				System.out.println(referenceDTO.getRefEmail());
				
				System.out.println(referenceDTO.getRefName());
				
				System.out.println(referenceDTO.getYearsKnown());

				certificationDetailsServiceImpl.saveReference(referenceDTOs);
				return true;

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}
	
	
	
	@RequestMapping(value = "/resSocialMediaRef", method = RequestMethod.POST, headers = "Accept=application/json")
	public boolean resSocialMediaRef(@RequestBody List<SocialMediaReferenceDTO> socialMediaReferenceDTOs) {
		try {

			System.out.println(socialMediaReferenceDTOs.size());
			for (SocialMediaReferenceDTO socailMediaRefDTO : socialMediaReferenceDTOs) {

				System.out.println(socailMediaRefDTO.getSocialLink());

				System.out.println(socailMediaRefDTO.getSocialName());
				
				

				certificationDetailsServiceImpl.saveSocailMediaRef(socialMediaReferenceDTOs);
				return true;

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;

	}

}
