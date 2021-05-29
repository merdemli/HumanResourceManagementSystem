package io.hrms.business.abstracts;

import java.util.List;

import io.hrms.entities.concretes.JobPosition;

public interface JobPositionService 
{
	List<JobPosition> getAll();

}
