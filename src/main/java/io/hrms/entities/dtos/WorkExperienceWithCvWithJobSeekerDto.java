package io.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceWithCvWithJobSeekerDto {
	
	private int id; //workExperienceId
	private String companyName;
	private LocalDate startingDate;
	private LocalDate endingDate;
	private String isStillWorking;
	private String jobTitle;
	private String jobSeekerFirstName;
	private String jobSeekerLastName;
	

}
