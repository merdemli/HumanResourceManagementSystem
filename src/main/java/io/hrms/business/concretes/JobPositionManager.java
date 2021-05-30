package io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.hrms.business.abstracts.JobPositionService;
import io.hrms.core.utilities.results.DataResult;
import io.hrms.core.utilities.results.ErrorResult;
import io.hrms.core.utilities.results.Result;
import io.hrms.core.utilities.results.SuccessDataResult;
import io.hrms.core.utilities.results.SuccessResult;
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
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),
				"Job Positions have been listed");
	}

	@Override
	public DataResult<JobPosition> getByid(int id) {
		
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.getOne(id));
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if(getByJobTitle(jobPosition.getJobTitle()).getData() != null)   //return dataresult.getData,,datası alınır                          //!
		{
			return new ErrorResult(jobPosition.getJobTitle()+" is already exist");
				
		} 
		else this.jobPositionDao.save(jobPosition);
			return new SuccessResult("Job Position has been successfully added");
		
	}

	@Override
	public Result update(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition );
		return new SuccessResult("Job position has been updated");
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		this.jobPositionDao.delete(jobPosition);
		return new SuccessResult("Job position has been deleted");
	}

	@Override
	public DataResult<JobPosition> getByJobTitle(String jobTitle) {
		
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.findByJobTitle(jobTitle));
	}
;
	
}
