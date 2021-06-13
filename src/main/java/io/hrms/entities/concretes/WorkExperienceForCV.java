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
@Table(name = "cv_work_experiences")
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceForCV extends Base{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
//	@Column(name = "cv_id")
//	private int cvId;
	
//	@Column(name = "job_position_id")
//	private int jobPositionId;
//	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "starting_date")
	private LocalDate startingDate;
	
	@Column(name = "ending_date",nullable = true)
	private LocalDate endingDate;
	
	@ManyToOne
	@JoinColumn(name = "cv_id")
	private CV cv;
	
	@ManyToOne
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;

}
