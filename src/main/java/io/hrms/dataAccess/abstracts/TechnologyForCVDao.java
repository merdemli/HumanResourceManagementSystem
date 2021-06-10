package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.TechnologyForCV;

public interface TechnologyForCVDao extends JpaRepository<TechnologyForCV, Integer>{
	
	TechnologyForCV getById(int cvId);
	//List<TechnologyForCV>getAllByCV_id(int id);
	

}
