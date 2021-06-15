package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.entities.concretes.CV;
import io.hrms.entities.concretes.JobAdvert;

public interface CVDao extends JpaRepository<CV, Integer>{
	
	@Query("From CV where job_seeker_id=:userId")
	List<CV>getByJobSeekerId(int userId);
	
	CV getById(int id);

}

