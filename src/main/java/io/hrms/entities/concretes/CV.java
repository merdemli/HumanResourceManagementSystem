package io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cvs")
@NoArgsConstructor
@AllArgsConstructor
public class CV extends Base{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_seeker_id")
	private int jobSeekerId;
	
	@OneToMany(mappedBy ="cv")
	List<CoverLetterForCV>coverLetters;
	
	@OneToMany(mappedBy = "cv")
	List<EducationInfoForCV>educationInfos;
	
	@OneToMany(mappedBy = "cv")
	List<ForeignLanguageForCv>foreignLanguages;
	
	@OneToMany(mappedBy = "cv")
	List<Photo>photos;
	
	@OneToMany(mappedBy = "cv")
	List<SocialMediaForCV>socialMediaForCv;
	
	@OneToMany(mappedBy = "cv")
	List<TechnologyForCV>tecnologiesForCv;
	
	@OneToMany(mappedBy = "cv")
	List<WorkExperienceForCV>workexperiencies;
}




