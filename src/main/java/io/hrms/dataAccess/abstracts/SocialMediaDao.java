package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.SocialMedia;

public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer>{
	
	SocialMedia getById(int id);

}
