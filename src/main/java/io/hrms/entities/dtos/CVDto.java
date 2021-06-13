package io.hrms.entities.dtos;

import java.util.List;

import io.hrms.entities.concretes.CV;
import io.hrms.entities.concretes.CoverLetterForCV;
import io.hrms.entities.concretes.EducationInfoForCV;
import io.hrms.entities.concretes.ForeignLanguageForCv;
import io.hrms.entities.concretes.JobSeeker;
import io.hrms.entities.concretes.Photo;
import io.hrms.entities.concretes.SocialMediaForCV;
import io.hrms.entities.concretes.TechnologyForCV;
import io.hrms.entities.concretes.WorkExperienceForCV;

public class CVDto {
	
	public CV cv;
	public JobSeeker jobSeeker;
	public List<EducationInfoForCV>universities;
	public List<SocialMediaForCV>socialMedias;
	public List<TechnologyForCV>technologies;
	public List<WorkExperienceForCV>workexperiences;
	public List<ForeignLanguageForCv>foreignLanguages;
	public List<CoverLetterForCV>coverLetters;
	public Photo photo;
	

}
