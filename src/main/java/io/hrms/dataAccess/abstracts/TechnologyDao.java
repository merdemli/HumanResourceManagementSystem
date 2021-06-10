package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.hrms.core.utilities.results.DataResult;
import io.hrms.entities.concretes.Technology;

public interface TechnologyDao extends JpaRepository<Technology, Integer> {
	
	Technology getById(int id);
	
	
	
	

}


