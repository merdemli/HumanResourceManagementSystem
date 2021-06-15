package io.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationInfoForCvWithUniversityAndUniversityDepartmentDto {
	
	private int id; //educatonInfoId
	private String firstName;
	private String lastName;
	private int universityId;
	private String universityName;
	private int departmentId;
	private String universityDepartmentName;
	private LocalDate startingDate;
	private LocalDate graduationDate;
	private String isStillStudying;
	private int cvId;
	
	
	
	
	

}
