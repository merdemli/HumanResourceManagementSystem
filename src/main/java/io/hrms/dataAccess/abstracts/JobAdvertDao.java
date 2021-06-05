package io.hrms.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.hrms.entities.concretes.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {
	
	
	//getByAdvertisment //JPA
	List<JobAdvert>getByAdvertStatus(boolean advertStatus); 
	
	//List<JobAdvert>getByEmployer_userId(int userId);
	
	//JPQL
	@Query("From JobAdvert where advertStatus = true")
	List<JobAdvert>getAllByAdvertStatusList();

	@Query("From JobAdvert where advertStatus = true Order By createdAt Desc")
	List<JobAdvert>getAllByCretedAtDesc();
	
	@Query("From JobAdvert where advertStatus = true and employer_id =:id")
	List<JobAdvert>getAllByEmployerOpenAdvert(int id);
	
	JobAdvert getById(int id);
	List<JobAdvert> getAllByDeadlineLessThanEqual(LocalDate date);
	
	
	
	
}
