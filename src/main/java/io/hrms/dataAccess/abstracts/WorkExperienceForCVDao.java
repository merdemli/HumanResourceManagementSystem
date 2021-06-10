package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.WorkExperienceForCV;

public interface WorkExperienceForCVDao extends JpaRepository<WorkExperienceForCV, Integer>{
	
	//List<WorkExperienceForCV>getAllByCV_id(int id);

}
