package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.JobPositionService;
import io.hrms.dataAccess.abstracts.JobPositionDao;
import io.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService
{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) { //constructor injection
		super();
		this.jobPositionDao = jobPositionDao;  
	}

	@Override
	public List<JobPosition> getAll()
	{
		
		return jobPositionDao.findAll();
	}

}
