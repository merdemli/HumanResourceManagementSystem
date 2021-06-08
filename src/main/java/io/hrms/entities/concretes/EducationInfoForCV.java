package io.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_edu_infos")
@NoArgsConstructor
@AllArgsConstructor
public class EducationInfoForCV extends Base {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "university_id")
//	private int universityId;
	
//	@Column(name = "university_department_id")
//	private int universityDepartmentId;
	
//	@Column(name = "cv_id")
//	private int cvId;
	
	@Column(name = "starting_date")
	private LocalDate startingDate;
	
	@Column(name = "graduation_date", nullable = true)
	private LocalDate graduationDate;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private CV cv;
	
	@ManyToOne
	@JoinColumn(name = "university_department_id")
	private UniversityDepartment universityDepartment;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private University university;

}
