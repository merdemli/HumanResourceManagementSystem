package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.hrms.entities.concretes.WorkExperienceForCV;
import io.hrms.entities.dtos.WorkExperienceWithCvWithJobSeekerDto;

public interface WorkExperienceForCVDao extends JpaRepository<WorkExperienceForCV, Integer>{
	
	//List<WorkExperienceForCV>getAllByCV_id(int id);
	
	
	@Query("Select new io.hrms.entities.dtos.WorkExperienceWithCvWithJobSeekerDto("
            +" w.id, w.companyName, w.startingDate, w.endingDate,w.isStillWorking, p.jobTitle, j.firstName, j.lastName) "
            +" From WorkExperienceForCV w Inner Join CV c ON w.cv.id  =c.id "
            +" Inner Join JobSeeker j ON w.cv.jobSeeker.id= j.id"
            +" Inner Join JobPosition p ON w.jobPosition.id =p.id "
            +" where w.cv.jobSeeker.id=?1  ORDER BY w.endingDate DESC")
    List<WorkExperienceWithCvWithJobSeekerDto>getWorkExperienceWithCvWithJobSeekerDetails(int userId);


}