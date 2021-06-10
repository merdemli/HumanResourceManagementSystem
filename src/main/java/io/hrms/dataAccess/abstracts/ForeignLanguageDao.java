package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.ForeignLanguage;

public interface ForeignLanguageDao extends JpaRepository<ForeignLanguage, Integer>{
	
	ForeignLanguage getById(int id);
	
	
	
	

}
