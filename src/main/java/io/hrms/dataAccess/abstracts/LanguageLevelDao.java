package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.LanguageLevel;

public interface LanguageLevelDao extends JpaRepository<LanguageLevel, Integer>{
	LanguageLevel getById(int id);

}
