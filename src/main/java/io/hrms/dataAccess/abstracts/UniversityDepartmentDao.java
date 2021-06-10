package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.UniversityDepartment;

public interface UniversityDepartmentDao extends JpaRepository<UniversityDepartment, Integer> {
	UniversityDepartment getById(int id);
	
	
	

}
