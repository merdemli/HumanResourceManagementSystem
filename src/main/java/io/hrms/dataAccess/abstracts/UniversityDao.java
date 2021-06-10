package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.Result;

import io.hrms.entities.concretes.University;

public interface UniversityDao extends JpaRepository<University, Integer> {
  
	
	

}
