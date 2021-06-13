package io.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
//	@Column(name = "job_seeker_id")
//	private int jobSeekerId;
	
	
	@ManyToOne
	@JoinColumn(name="job_seeker_id")
	private JobSeeker jobSeeker;
	
	@JsonIgnore
	@OneToMany(mappedBy ="cv")
	List<CoverLetterForCV>coverLetters;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	List<EducationInfoForCV>educationInfos;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	List<ForeignLanguageForCv>foreignLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	List<Photo>photos;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	List<SocialMediaForCV>socialMediaForCv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	List<TechnologyForCV>technologiesForCv;
	
	@JsonIgnore
	@OneToMany(mappedBy = "cv")
	List<WorkExperienceForCV>workExperiencies;
}




