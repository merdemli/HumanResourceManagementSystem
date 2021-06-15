package io.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.hrms.entities.concretes.EducationInfoForCV;
import io.hrms.entities.concretes.JobAdvert;
import io.hrms.entities.dtos.EducationInfoForCvWithUniversityAndUniversityDepartmentDto;

public interface EducationInfoForCVDao extends JpaRepository<EducationInfoForCV, Integer> {
	EducationInfoForCV getById(int id);
	//List<EducationInfoForCV>getAllByCV_id(int id);
	
	
	
	@Query("Select new io.hrms.entities.dtos.EducationInfoForCvWithUniversityAndUniversityDepartmentDto("
		+" e.id, j.firstName, j.lastName, u.id, u.universityName, d.id, d.universityDepartmentName, e.startingDate, e.graduationDate, e.isStillStudying, c.id) "
		+" From EducationInfoForCV e Inner Join University u ON e.university.id = u.id"
		+" Inner Join UniversityDepartment d ON e.universityDepartment.id = d.id"
		+" Inner Join CV c ON e.cv.id = c.id"
		+" Inner Join JobSeeker j ON e.cv.jobSeeker.id = j.id"
		+" where e.cv.jobSeeker.id=?1 ORDER BY e.graduationDate DESC")
	List<EducationInfoForCvWithUniversityAndUniversityDepartmentDto >getEducationInfoForCvWithUniversityAndUniversityDepartment(int userId);
}



