package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer>{
	

}
