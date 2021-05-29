package io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import io.hrms.entities.concretes.JobPosition;
                                                                  //id dataType,PK
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>
{
	JobPosition findByJobTitle(String title);
}
