package io.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.SocialMediaForCV;

public interface SocialMediaForCVDao extends JpaRepository<SocialMediaForCV, Integer> {
	
	SocialMediaForCV getById(int id);
	//List<SocialMediaForCV>getAllBySocialMedia_id(int id);

}
