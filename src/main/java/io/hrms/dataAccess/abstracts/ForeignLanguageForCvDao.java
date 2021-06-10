package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.ForeignLanguageForCv;

public interface ForeignLanguageForCvDao extends JpaRepository<ForeignLanguageForCv, Integer> {
	
	ForeignLanguageForCv getById(int id);
	//List<ForeignLanguageForCv>getAllByCV_id(int id);

}
