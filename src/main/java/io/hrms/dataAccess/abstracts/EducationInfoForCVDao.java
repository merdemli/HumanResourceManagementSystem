package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.hrms.entities.concretes.EducationInfoForCV;
import io.hrms.entities.concretes.JobAdvert;

public interface EducationInfoForCVDao extends JpaRepository<EducationInfoForCV, Integer> {
	EducationInfoForCV getById(int id);
	//List<EducationInfoForCV>getAllByCV_id(int id);
}
	
	
	
	